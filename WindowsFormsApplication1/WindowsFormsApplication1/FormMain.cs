using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace WindowsFormsApplication1
{
    public partial class FormMain : Form
    {
        string _mediaPath;
        List<string> _mediaFiles;
        public FormMain()
        {
            InitializeComponent();
            _mediaFiles = new List<string>();
        }

        private void buttonGetMedia_Click(object sender, EventArgs e)
        {
            _mediaPath = "C://Users//Brad//Videos";
            foreach (String folder in Directory.GetDirectories(_mediaPath))
            {
                foreach (string file in Directory.GetFiles(folder))
                {
                    //_mediaFiles.Add(Path.GetFileNameWithoutExtension(file));
                    _mediaFiles.Add(file);
                }
            }
            foreach (string file in Directory.GetFiles(_mediaPath))
            {
                _mediaFiles.Add(file);
            }
            foreach (string files in _mediaFiles)
            {
                Console.Write(files);
                Console.Write('\n');
            }
        }

    }
}
