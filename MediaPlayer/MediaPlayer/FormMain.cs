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
    public struct file
    {
        public string path;
        public string fileName;
    }

    public partial class FormMain : Form
    {
        private bool _controlOpen = false;
        private bool _loading = true;
        private bool _fileTypeChanging = false;
        private string _mediaPath;
        private List<file> _allFiles;
        private List<file> _playlistFiles;
        private List<string> _mediaFiles;
        private List<string> _fileTypes;
        private List<string> videoTypes = new List<string>() { ".m4v", ".avi", ".XviD", ".mpg", ".flv" };
        private List<string> musicTypes = new List<string>() { ".m4a", ".mp3", ".flv", ".m4p" };
        private FormControls formControls;
        System.Configuration.Configuration config = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
        
        public FormMain()
        {
            InitializeComponent();
            _mediaFiles = new List<string>();
            _fileTypes = new List<string>();
            _allFiles = new List<file>();
            _playlistFiles = new List<file>();
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

            populateComboBoxPlayer();

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
                            file temp = new file();
                            temp.fileName = Path.GetFileNameWithoutExtension(file);
                            temp.path = file;
                            _allFiles.Add(temp);
                            listBoxAvailableMedia.Items.Add(temp.fileName);
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
                listBoxAvailableMedia.Items.Clear();
                getFiles(_mediaPath);
            }
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
                listBoxAvailableMedia.Items.Clear();
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
                listBoxAvailableMedia.Items.Clear();
                getFiles(_mediaPath);
                _fileTypeChanging = false;
            }
        }

        private void buttonPlay_Click(object sender, EventArgs e)
        {

                formControls = new FormControls(_playlistFiles, comboBoxPlayer.Text);
                formControls.Show();

        }

        private void buttonToPlaylist_Click(object sender, EventArgs e)
        {
            file temp = _allFiles[findIndex(listBoxAvailableMedia.SelectedItem.ToString(), _allFiles)];
            _playlistFiles.Add(temp);
            listBoxPlaylist.Items.Add(temp.fileName);
        }

        private void buttonFromPlaylist_Click(object sender, EventArgs e)
        {
            file temp = _playlistFiles[findIndex(listBoxPlaylist.SelectedItem.ToString(), _playlistFiles)];
            _playlistFiles.Remove(temp);
            listBoxPlaylist.Items.Remove(listBoxPlaylist.SelectedItem);
        }

        private int findIndex(string fileName, List<file> toSearch)
        {
            int index = 0;
            foreach (file temp in toSearch)
            {
                if (temp.fileName == fileName)
                {
                    break;
                }
                index++;
            }
            return index;
        }

        public bool controlOpen
        {
            get
            {
                return _controlOpen;
            }
            set
            {
                _controlOpen = value;
            }
        }

        private void populateComboBoxPlayer()
        {
            comboBoxPlayer.Items.Add("VLC");
            comboBoxPlayer.Items.Add("Windows Media Player");
            comboBoxPlayer.Text = "VLC";
        }
    }
}
