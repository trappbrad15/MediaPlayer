using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Diagnostics;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;
using System.Net;
using System.Net.Sockets;
using System.IO;

namespace MediaPlayer
{
    public partial class FormControls : Form
    {
        private bool _fullScreen = false;
        private bool _isRunning = true;
        private List<file> _playListFiles = new List<file>();
        private WMPLib.IWMPPlaylist _currentPlaylist;
        private Thread phoneListener;
        private string _phoneIP;
        
        
        public FormControls(List<file> playList, string player, string phoneIP)
        {
            InitializeComponent();
            _phoneIP = phoneIP;
            phoneListener = new Thread(phoneServer);
            phoneListener.Start();

            _playListFiles = playList;
            if (player == "VLC")
            {
                VLCSetupForm();
                trackBarVolume.Maximum = 100;
                trackBarVolume.Minimum = 0;
                foreach (file media in _playListFiles)
                {
                    axVLCPlugin21.playlist.add(media.path);
                }
                axVLCPlugin21.playlist.play();
                trackBarVolume.Value = axVLCPlugin21.Volume;
            }
            else
            {
                WMPSetupForm();
                _currentPlaylist = axWindowsMediaPlayer1.currentPlaylist;
                foreach (file media in _playListFiles)
                {
                    WMPLib.IWMPMedia wmpPlayer = axWindowsMediaPlayer1.newMedia(media.path);
                    _currentPlaylist.appendItem(wmpPlayer);
                }
                _currentPlaylist.name = "TempPlaylist";
                axWindowsMediaPlayer1.currentPlaylist = _currentPlaylist;
                axWindowsMediaPlayer1.settings.autoStart = true;
            }
            displaySong(_playListFiles[0].fileName);
        }

        private void buttonPlay_Click(object sender, EventArgs e)
        {
            axVLCPlugin21.playlist.play();
        }

        private void buttonPause_Click(object sender, EventArgs e)
        {
            axVLCPlugin21.playlist.togglePause();
        }

        private void buttonNext_Click(object sender, EventArgs e)
        {
            axVLCPlugin21.playlist.next();
        }

        private void buttonPrevious_Click(object sender, EventArgs e)
        {
            axVLCPlugin21.playlist.prev();
        }

        private void trackBarVolume_ValueChanged(object sender, EventArgs e)
        {
            axVLCPlugin21.Volume = trackBarVolume.Value;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if(!axVLCPlugin21.playlist.isPlaying)
            {
                axVLCPlugin21.playlist.next();
            }
            displaySong(axWindowsMediaPlayer1.currentPlaylist.Item[0].ToString());
        }

        private void toolStripLabelFullScreen_Click(object sender, EventArgs e)
        {
            if (_fullScreen)
            {
                this.WindowState = FormWindowState.Maximized;
                axVLCPlugin21.Width = this.Width - 50;
                axVLCPlugin21.Height = this.Height - 50;
                _fullScreen = true;
            }
            else
            {
                this.WindowState = FormWindowState.Normal;
                axVLCPlugin21.Width = this.Width - 50;
                axVLCPlugin21.Height = this.Height - 50;
                _fullScreen = false;
            }
        }

        private void VLCSetupForm()
        {
            axWindowsMediaPlayer1.SendToBack();
            axWindowsMediaPlayer1.Visible = false;

            buttonPrevious.Enabled = true;
            buttonNext.Enabled = true;
            buttonPlay.Enabled = true;
            buttonPause.Enabled = true;
            toolStripLabelFullScreen.Enabled = true;
            labelVolume.Enabled = true;
            trackBarVolume.Enabled = true;

            buttonPrevious.Visible = true;
            buttonNext.Visible = true;
            buttonPlay.Visible = true;
            buttonPause.Visible = true;
            toolStripLabelFullScreen.Visible = true;
            labelVolume.Visible = true;
            trackBarVolume.Visible = true;

            axVLCPlugin21.Visible = true;
            axVLCPlugin21.BringToFront();
        }

        private void WMPSetupForm()
        {
            axVLCPlugin21.SendToBack();
            axVLCPlugin21.Visible = false;

            buttonPrevious.Enabled = false;
            buttonNext.Enabled = false;
            buttonPlay.Enabled = false;
            buttonPause.Enabled = false;
            toolStripLabelFullScreen.Enabled = false;
            labelVolume.Enabled = false;
            trackBarVolume.Enabled = false;

            buttonPrevious.Visible = false;
            buttonNext.Visible = false;
            buttonPlay.Visible = false;
            buttonPause.Visible = false;
            toolStripLabelFullScreen.Visible = false;
            labelVolume.Visible = false;
            trackBarVolume.Visible = false;

            axWindowsMediaPlayer1.Visible = true;
            axWindowsMediaPlayer1.BringToFront();
        }

        private void phoneServer()
        {
            try
            {
                bool endIPFound = false;
                IPAddress ipAd = IPAddress.Parse("192.168.0.107");
                string endIPAddress = "";
                string endPort = "";
                // use local m/c IP address, and 

                // use the same in the client


                /* Initializes the Listener */
                TcpListener myList = new TcpListener(ipAd, 8002);

                /* Start Listeneting at the specified port */
                myList.Start();
                while(_isRunning)
                {
                    //Console.WriteLine("The server is running at port 8001...");
                    //Console.WriteLine("The local End point is  :" +
                    //                  myList.LocalEndpoint);
                    //Console.WriteLine("Waiting for a connection.....");
            
                    Socket s = myList.AcceptSocket();
                    string endPoint = s.RemoteEndPoint.ToString();
                    foreach (char temp in endPoint.ToCharArray())
                    {
                        if (endIPFound)
                        {
                            endPort += temp.ToString();
                        }
                        else
                        {
                            if (temp == ':')
                            {
                                endIPFound = true;
                            }
                            else
                            {
                                endIPAddress += temp.ToString();
                            }
                        }
                    }

                    //Console.WriteLine("Connection accepted from " + s.RemoteEndPoint);

                    byte[] b = new byte[100];
                    int k = s.Receive(b);

                    char cc = ' ';
                    string test = null;
                    //Console.WriteLine("Recieved...");
                    for (int i = 0; i < k; i++)
                    {
                        //Console.Write(Convert.ToChar(b[i]));
                        cc = Convert.ToChar(b[i]);
                        test += cc.ToString();
                    }

                    switch (test)
                    {
                        case "Play":
                            axWindowsMediaPlayer1.Ctlcontrols.play();
                            break;
                        case "Pause":
                            axWindowsMediaPlayer1.Ctlcontrols.pause();
                            break;
                        case "Next":
                            axWindowsMediaPlayer1.Ctlcontrols.next();
                            break;
                        case "Previous":
                            axWindowsMediaPlayer1.Ctlcontrols.previous();
                            break;
                        default:
                            break;
                    }

                    //ASCIIEncoding asen = new ASCIIEncoding();
                    //s.Send(asen.GetBytes("The string was recieved by the server."));
                    s.Close();
                    _phoneIP = endIPAddress;
                    //Console.WriteLine("\nSent Acknowledgement");


                    /* clean up */
                }
                myList.Stop();
                Console.ReadLine();

            }
            catch (Exception e)
            {
                Console.WriteLine("Error..... " + e.StackTrace);
            }
        }
        private void displaySong(string toSend)
        {
            TcpClient client = new TcpClient();
            client.Connect(_phoneIP, 8003);
            Stream stream = client.GetStream();
            ASCIIEncoding asen = new ASCIIEncoding();
            byte[] ba = asen.GetBytes(toSend);
            stream.Write(ba, 0, ba.Length);
            stream.Close();
        }
        private void FormControls_FormClosing(object sender, FormClosingEventArgs e)
        {
            _isRunning = false;
            //phoneConnection.Abort();
            this.Close();
        }
        
    }
}
