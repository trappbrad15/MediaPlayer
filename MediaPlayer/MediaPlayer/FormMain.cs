using System;
using System.Configuration;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace MediaPlayer
{
    public partial class FormMain : Form
    {
        bool _loading = true;
        bool _fileTypeChanging = false;
        bool _mediaPlayerOpened = false;
        string _mediaPath;
        List<string> _mediaFiles;
        List<string> _fileTypes;
        List<string> videoTypes = new List<string>() { ".m4v", ".avi", ".XviD", ".mpg", ".flv" };
        List<string> musicTypes = new List<string>() { ".m4a", ".mp3", ".flv", ".m4p" };
        System.Configuration.Configuration config = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
        AXVLC.VLCPlugin2Class mediaPlayer = new AXVLC.VLCPlugin2Class();
        
        public FormMain()
        {
            InitializeComponent();
            _mediaFiles = new List<string>();
            _fileTypes = new List<string>();
        }

        private void FormMain_Load(object sender, EventArgs e)
        {
            textBoxMediaLocation.Text = ConfigurationManager.AppSettings["mediaLocation"];
            comboBoxFileTypes.Text = ConfigurationManager.AppSettings["fileType"];
            //Load ComboBox File Types
            comboBoxFileTypes.Items.Add("Video");
            comboBoxFileTypes.Items.Add("Music");

            loadFileTypes();
            //Load ComboBox Types
            populateComboBoxTypes();

            _mediaPath = textBoxMediaLocation.Text;
            getFiles(_mediaPath);
            _loading = false;
        }

        private void populateComboBoxTypes()
        {
            comboBoxFormats.Items.Clear();
            comboBoxFormats.Items.Add("All Types");
            foreach (string type in _fileTypes)
            {
                comboBoxFormats.Items.Add(type);
            }
            comboBoxFormats.Text = "All Types";
        }

        private void loadFileTypes()
        {
            if (comboBoxFileTypes.Text == "Video")
            {
                _fileTypes = videoTypes;
            }
            else
            {
                _fileTypes = musicTypes;
            }
        }

        private void getFiles(string mediaPath)
        {
            foreach (string folder in Directory.GetDirectories(mediaPath))
            {
                getFiles(folder);
                foreach (string file in Directory.GetFiles(folder))
                {
                    foreach (string fileType in _fileTypes)
                    {
                        if (file.EndsWith(fileType))
                        {
                            checkedListBoxMedia.Items.Add(file);
                        }
                    }
                }
            }
        }

        private void buttonBrowse_Click(object sender, EventArgs e)
        {
            FolderBrowserDialog folderBrowser = new FolderBrowserDialog();
            folderBrowser.SelectedPath = textBoxMediaLocation.Text;
            if (folderBrowser.ShowDialog() == DialogResult.OK)
            {
                textBoxMediaLocation.Text = folderBrowser.SelectedPath;
                _mediaPath = folderBrowser.SelectedPath;
                checkedListBoxMedia.Items.Clear();
                getFiles(_mediaPath);
            }
        }

        private void FormMain_SizeChanged(object sender, EventArgs e)
        {
            checkedListBoxMedia.Size = new System.Drawing.Size(this.Width - 50, checkedListBoxMedia.Height);
        }

        private void FormMain_FormClosing(object sender, FormClosingEventArgs e)
        {
            ConfigurationManager.AppSettings["fileType"] = comboBoxFileTypes.Text;
            ConfigurationManager.AppSettings["mediaLocation"] = textBoxMediaLocation.Text;
            config.Save();
        }

        private void comboBoxFormats_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!_loading && !_fileTypeChanging)
            {
                _fileTypes = new List<string>() { comboBoxFormats.Text };
                checkedListBoxMedia.Items.Clear();
                getFiles(_mediaPath);
                _fileTypeChanging = false;
            }
        }

        private void comboBoxFileTypes_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!_loading)
            {
                _fileTypeChanging = true;
                loadFileTypes();
                populateComboBoxTypes();
                checkedListBoxMedia.Items.Clear();
                getFiles(_mediaPath);
                _fileTypeChanging = false;
            }
        }

        private void buttonPlay_Click(object sender, EventArgs e)
        {

            foreach (var mediaFile in checkedListBoxMedia.CheckedItems)
            {
                mediaPlayer.addTarget(mediaFile.ToString(), new object(), AXVLC.VLCPlaylistMode.VLCPlayListInsert, 0);
            }
            if (!_mediaPlayerOpened)
            {
                mediaPlayer.play();
                _mediaPlayerOpened = true;
            }


        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (_mediaPlayerOpened)
            {
                if (!mediaPlayer.playlist.isPlaying)
                {
                    mediaPlayer.playlistNext();
                }
            }
        }
    }
}
