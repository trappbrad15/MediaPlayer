namespace MediaPlayer
{
    partial class FormPlaylistSetup
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.labelMedia = new System.Windows.Forms.Label();
            this.textBoxMediaLocation = new System.Windows.Forms.TextBox();
            this.buttonBrowse = new System.Windows.Forms.Button();
            this.comboBoxFileTypes = new System.Windows.Forms.ComboBox();
            this.comboBoxFormats = new System.Windows.Forms.ComboBox();
            this.buttonPlay = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.listBoxPlaylist = new System.Windows.Forms.ListBox();
            this.listBoxAvailableMedia = new System.Windows.Forms.ListBox();
            this.buttonToPlaylist = new System.Windows.Forms.Button();
            this.buttonFromPlaylist = new System.Windows.Forms.Button();
            this.comboBoxPlayer = new System.Windows.Forms.ComboBox();
            this.labelSearch = new System.Windows.Forms.Label();
            this.textBoxSearch = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // labelMedia
            // 
            this.labelMedia.AutoSize = true;
            this.labelMedia.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelMedia.Location = new System.Drawing.Point(13, 13);
            this.labelMedia.Name = "labelMedia";
            this.labelMedia.Size = new System.Drawing.Size(135, 20);
            this.labelMedia.TabIndex = 1;
            this.labelMedia.Text = "Location of Media";
            // 
            // textBoxMediaLocation
            // 
            this.textBoxMediaLocation.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxMediaLocation.Location = new System.Drawing.Point(154, 10);
            this.textBoxMediaLocation.Name = "textBoxMediaLocation";
            this.textBoxMediaLocation.Size = new System.Drawing.Size(317, 26);
            this.textBoxMediaLocation.TabIndex = 2;
            // 
            // buttonBrowse
            // 
            this.buttonBrowse.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonBrowse.Location = new System.Drawing.Point(491, 10);
            this.buttonBrowse.Name = "buttonBrowse";
            this.buttonBrowse.Size = new System.Drawing.Size(75, 23);
            this.buttonBrowse.TabIndex = 3;
            this.buttonBrowse.Text = "Browse";
            this.buttonBrowse.UseVisualStyleBackColor = true;
            this.buttonBrowse.Click += new System.EventHandler(this.buttonBrowse_Click);
            // 
            // comboBoxFileTypes
            // 
            this.comboBoxFileTypes.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxFileTypes.FormattingEnabled = true;
            this.comboBoxFileTypes.Location = new System.Drawing.Point(17, 49);
            this.comboBoxFileTypes.Name = "comboBoxFileTypes";
            this.comboBoxFileTypes.Size = new System.Drawing.Size(95, 24);
            this.comboBoxFileTypes.TabIndex = 5;
            this.comboBoxFileTypes.SelectedIndexChanged += new System.EventHandler(this.comboBoxFileTypes_SelectedIndexChanged);
            // 
            // comboBoxFormats
            // 
            this.comboBoxFormats.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxFormats.FormattingEnabled = true;
            this.comboBoxFormats.Location = new System.Drawing.Point(127, 49);
            this.comboBoxFormats.Name = "comboBoxFormats";
            this.comboBoxFormats.Size = new System.Drawing.Size(95, 24);
            this.comboBoxFormats.TabIndex = 6;
            this.comboBoxFormats.SelectedIndexChanged += new System.EventHandler(this.comboBoxFormats_SelectedIndexChanged);
            // 
            // buttonPlay
            // 
            this.buttonPlay.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonPlay.Location = new System.Drawing.Point(506, 45);
            this.buttonPlay.Name = "buttonPlay";
            this.buttonPlay.Size = new System.Drawing.Size(198, 50);
            this.buttonPlay.TabIndex = 7;
            this.buttonPlay.Text = "Play";
            this.buttonPlay.UseVisualStyleBackColor = true;
            this.buttonPlay.Click += new System.EventHandler(this.buttonPlay_Click);
            // 
            // listBoxPlaylist
            // 
            this.listBoxPlaylist.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listBoxPlaylist.FormattingEnabled = true;
            this.listBoxPlaylist.ItemHeight = 16;
            this.listBoxPlaylist.Location = new System.Drawing.Point(454, 122);
            this.listBoxPlaylist.Name = "listBoxPlaylist";
            this.listBoxPlaylist.Size = new System.Drawing.Size(315, 324);
            this.listBoxPlaylist.TabIndex = 9;
            // 
            // listBoxAvailableMedia
            // 
            this.listBoxAvailableMedia.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listBoxAvailableMedia.FormattingEnabled = true;
            this.listBoxAvailableMedia.ItemHeight = 16;
            this.listBoxAvailableMedia.Location = new System.Drawing.Point(17, 122);
            this.listBoxAvailableMedia.Name = "listBoxAvailableMedia";
            this.listBoxAvailableMedia.Size = new System.Drawing.Size(315, 324);
            this.listBoxAvailableMedia.TabIndex = 10;
            // 
            // buttonToPlaylist
            // 
            this.buttonToPlaylist.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonToPlaylist.Location = new System.Drawing.Point(357, 122);
            this.buttonToPlaylist.Name = "buttonToPlaylist";
            this.buttonToPlaylist.Size = new System.Drawing.Size(75, 45);
            this.buttonToPlaylist.TabIndex = 11;
            this.buttonToPlaylist.Text = "Add";
            this.buttonToPlaylist.UseVisualStyleBackColor = true;
            this.buttonToPlaylist.Click += new System.EventHandler(this.buttonToPlaylist_Click);
            // 
            // buttonFromPlaylist
            // 
            this.buttonFromPlaylist.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonFromPlaylist.Location = new System.Drawing.Point(357, 230);
            this.buttonFromPlaylist.Name = "buttonFromPlaylist";
            this.buttonFromPlaylist.Size = new System.Drawing.Size(75, 47);
            this.buttonFromPlaylist.TabIndex = 12;
            this.buttonFromPlaylist.Text = "Remove";
            this.buttonFromPlaylist.UseVisualStyleBackColor = true;
            this.buttonFromPlaylist.Click += new System.EventHandler(this.buttonFromPlaylist_Click);
            // 
            // comboBoxPlayer
            // 
            this.comboBoxPlayer.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxPlayer.FormattingEnabled = true;
            this.comboBoxPlayer.Location = new System.Drawing.Point(237, 49);
            this.comboBoxPlayer.Name = "comboBoxPlayer";
            this.comboBoxPlayer.Size = new System.Drawing.Size(95, 24);
            this.comboBoxPlayer.TabIndex = 13;
            this.comboBoxPlayer.Visible = false;
            // 
            // labelSearch
            // 
            this.labelSearch.AutoSize = true;
            this.labelSearch.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelSearch.Location = new System.Drawing.Point(12, 85);
            this.labelSearch.Name = "labelSearch";
            this.labelSearch.Size = new System.Drawing.Size(51, 16);
            this.labelSearch.TabIndex = 14;
            this.labelSearch.Text = "Search";
            // 
            // textBoxSearch
            // 
            this.textBoxSearch.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBoxSearch.Location = new System.Drawing.Point(71, 85);
            this.textBoxSearch.Name = "textBoxSearch";
            this.textBoxSearch.Size = new System.Drawing.Size(261, 22);
            this.textBoxSearch.TabIndex = 15;
            this.textBoxSearch.TextChanged += new System.EventHandler(this.textBoxSearch_TextChanged);
            // 
            // FormMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(781, 461);
            this.Controls.Add(this.textBoxSearch);
            this.Controls.Add(this.labelSearch);
            this.Controls.Add(this.comboBoxPlayer);
            this.Controls.Add(this.buttonFromPlaylist);
            this.Controls.Add(this.buttonToPlaylist);
            this.Controls.Add(this.listBoxAvailableMedia);
            this.Controls.Add(this.listBoxPlaylist);
            this.Controls.Add(this.buttonPlay);
            this.Controls.Add(this.comboBoxFormats);
            this.Controls.Add(this.comboBoxFileTypes);
            this.Controls.Add(this.buttonBrowse);
            this.Controls.Add(this.textBoxMediaLocation);
            this.Controls.Add(this.labelMedia);
            this.Name = "FormMain";
            this.Text = "Media Player";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FormPlaylistSetup_FormClosing);
            this.Load += new System.EventHandler(this.FormPlaylistSetup_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelMedia;
        private System.Windows.Forms.TextBox textBoxMediaLocation;
        private System.Windows.Forms.Button buttonBrowse;
        private System.Windows.Forms.ComboBox comboBoxFileTypes;
        private System.Windows.Forms.ComboBox comboBoxFormats;
        private System.Windows.Forms.Button buttonPlay;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.ListBox listBoxPlaylist;
        private System.Windows.Forms.ListBox listBoxAvailableMedia;
        private System.Windows.Forms.Button buttonToPlaylist;
        private System.Windows.Forms.Button buttonFromPlaylist;
        private System.Windows.Forms.ComboBox comboBoxPlayer;
        private System.Windows.Forms.Label labelSearch;
        private System.Windows.Forms.TextBox textBoxSearch;
    }
}

