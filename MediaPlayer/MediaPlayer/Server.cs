using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net;
using System.Net.Sockets;

namespace MediaPlayer
{
    class Server
    {
        private bool _isRunning = false;
        private FormPlaylistSetup _PlaylistSetup;
        public Server()
        {
            _isRunning = true;
            
            try
            {
                bool endIPFound = false;
                IPAddress ipAd = IPAddress.Parse("192.168.0.107");
                string endIPAddress = "";
                string endPort = "";
                // use local m/c IP address, and 

                // use the same in the client


                /* Initializes the Listener */
                TcpListener myList = new TcpListener(ipAd, 8001);

                /* Start Listeneting at the specified port */
                myList.Start();
                while(_isRunning)
                {
            
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


                    byte[] b = new byte[100];
                    int k = s.Receive(b);

                    char cc = ' ';
                    string test = null;
                    for (int i = 0; i < k; i++)
                    {
                        cc = Convert.ToChar(b[i]);
                        test += cc.ToString();
                    }

                    switch (test)
                    {
                        case "MediaPlayer":
                            _PlaylistSetup = new FormPlaylistSetup(endIPAddress);
                            break;

                        default:
                            break;
                    }
                    s.Close();

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
    }
}
