namespace MediaPlayer
{
    partial class FormMain
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
            this.checkedListBoxMedia = new System.Windows.Forms.CheckedListBox();
            this.comboBoxFileTypes = new System.Windows.Forms.ComboBox();
            this.comboBoxFormats = new System.Windows.Forms.ComboBox();
            this.buttonPlay = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
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
            // checkedListBoxMedia
            // 
            this.checkedListBoxMedia.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.checkedListBoxMedia.FormattingEnabled = true;
            this.checkedListBoxMedia.Location = new System.Drawing.Point(12, 106);
            this.checkedListBoxMedia.Name = "checkedListBoxMedia";
            this.checkedListBoxMedia.Size = new System.Drawing.Size(549, 310);
            this.checkedListBoxMedia.TabIndex = 4;
            // 
            // comboBoxFileTypes
            // 
            this.comboBoxFileTypes.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxFileTypes.FormattingEnabled = true;
            this.comboBoxFileTypes.Location = new System.Drawing.Point(17, 49);
            this.comboBoxFileTypes.Name = "comboBoxFileTypes";
            this.comboBoxFileTypes.Size = new System.Drawing.Size(121, 24);
            this.comboBoxFileTypes.TabIndex = 5;
            this.comboBoxFileTypes.SelectedIndexChanged += new System.EventHandler(this.comboBoxFileTypes_SelectedIndexChanged);
            // 
            // comboBoxFormats
            // 
            this.comboBoxFormats.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboBoxFormats.FormattingEnabled = true;
            this.comboBoxFormats.Location = new System.Drawing.Point(154, 49);
            this.comboBoxFormats.Name = "comboBoxFormats";
            this.comboBoxFormats.Size = new System.Drawing.Size(121, 24);
            this.comboBoxFormats.TabIndex = 6;
            this.comboBoxFormats.SelectedIndexChanged += new System.EventHandler(this.comboBoxFormats_SelectedIndexChanged);
            // 
            // buttonPlay
            // 
            this.buttonPlay.Location = new System.Drawing.Point(404, 49);
            this.buttonPlay.Name = "buttonPlay";
            this.buttonPlay.Size = new System.Drawing.Size(93, 36);
            this.buttonPlay.TabIndex = 7;
            this.buttonPlay.Text = "Play Media";
            this.buttonPlay.UseVisualStyleBackColor = true;
            this.buttonPlay.Click += new System.EventHandler(this.buttonPlay_Click);
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // FormMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(582, 467);
            this.Controls.Add(this.buttonPlay);
            this.Controls.Add(this.comboBoxFormats);
            this.Controls.Add(this.comboBoxFileTypes);
            this.Controls.Add(this.checkedListBoxMedia);
            this.Controls.Add(this.buttonBrowse);
            this.Controls.Add(this.textBoxMediaLocation);
            this.Controls.Add(this.labelMedia);
            this.Name = "FormMain";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FormMain_FormClosing);
            this.Load += new System.EventHandler(this.FormMain_Load);
            this.SizeChanged += new System.EventHandler(this.FormMain_SizeChanged);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelMedia;
        private System.Windows.Forms.TextBox textBoxMediaLocation;
        private System.Windows.Forms.Button buttonBrowse;
        private System.Windows.Forms.CheckedListBox checkedListBoxMedia;
        private System.Windows.Forms.ComboBox comboBoxFileTypes;
        private System.Windows.Forms.ComboBox comboBoxFormats;
        private System.Windows.Forms.Button buttonPlay;
        private System.Windows.Forms.Timer timer1;
    }
}

