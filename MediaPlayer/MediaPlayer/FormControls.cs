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

namespace MediaPlayer
{
    public partial class FormControls : Form
    {
        bool _fullScreen = false;
        List<file> _playListFiles = new List<file>();
        WMPLib.IWMPPlaylist _currentPlaylist;
        public FormControls(List<file> playList, string player)
        {
            InitializeComponent();
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
                    WMPLib.IWMPMedia temp = axWindowsMediaPlayer1.newMedia(media.path);
                    _currentPlaylist.appendItem(temp);
                }
                _currentPlaylist.name = "SHABOOKIE";
                axWindowsMediaPlayer1.currentPlaylist = _currentPlaylist;
                axWindowsMediaPlayer1.settings.autoStart = true;
            }
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
    }
}
