namespace WindowsFormsApplication1
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
            this.buttonGetMedia = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonGetMedia
            // 
            this.buttonGetMedia.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonGetMedia.Location = new System.Drawing.Point(12, 46);
            this.buttonGetMedia.Name = "buttonGetMedia";
            this.buttonGetMedia.Size = new System.Drawing.Size(98, 45);
            this.buttonGetMedia.TabIndex = 0;
            this.buttonGetMedia.Text = "Get Media";
            this.buttonGetMedia.UseVisualStyleBackColor = true;
            this.buttonGetMedia.Click += new System.EventHandler(this.buttonGetMedia_Click);
            // 
            // FormMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 262);
            this.Controls.Add(this.buttonGetMedia);
            this.Name = "FormMain";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonGetMedia;
    }
}

