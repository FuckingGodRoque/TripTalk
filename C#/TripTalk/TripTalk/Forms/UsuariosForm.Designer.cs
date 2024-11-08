namespace TripTalk.Forms
{
    partial class UsuariosForm
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
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.button3 = new System.Windows.Forms.Button();
            this.btnCrearOp = new System.Windows.Forms.Button();
            this.listUsuarios = new System.Windows.Forms.ListBox();
            this.btnDesbloquear = new System.Windows.Forms.Button();
            this.btnBloquear = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TripTalk.Properties.Resources.MARCONaranjaRedondeado;
            this.pictureBox1.Location = new System.Drawing.Point(-1, 31);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(463, 299);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // panel1
            // 
            this.panel1.Location = new System.Drawing.Point(-1, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(433, 20);
            this.panel1.TabIndex = 12;
            // 
            // button3
            // 
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.button3.Image = global::TripTalk.Properties.Resources.close30x30;
            this.button3.Location = new System.Drawing.Point(432, 0);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(30, 30);
            this.button3.TabIndex = 11;
            this.button3.UseVisualStyleBackColor = true;
            // 
            // btnCrearOp
            // 
            this.btnCrearOp.Enabled = false;
            this.btnCrearOp.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCrearOp.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCrearOp.ForeColor = System.Drawing.Color.Black;
            this.btnCrearOp.Image = global::TripTalk.Properties.Resources.barraNaranja117x35;
            this.btnCrearOp.Location = new System.Drawing.Point(166, 49);
            this.btnCrearOp.Name = "btnCrearOp";
            this.btnCrearOp.Size = new System.Drawing.Size(124, 38);
            this.btnCrearOp.TabIndex = 13;
            this.btnCrearOp.Text = "USUARIOS";
            this.btnCrearOp.UseVisualStyleBackColor = false;
            // 
            // listUsuarios
            // 
            this.listUsuarios.FormattingEnabled = true;
            this.listUsuarios.Location = new System.Drawing.Point(43, 107);
            this.listUsuarios.Name = "listUsuarios";
            this.listUsuarios.Size = new System.Drawing.Size(370, 147);
            this.listUsuarios.TabIndex = 14;
            this.listUsuarios.SelectedIndexChanged += new System.EventHandler(this.listUsuarios_SelectedIndexChanged);
            // 
            // btnDesbloquear
            // 
            this.btnDesbloquear.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDesbloquear.ForeColor = System.Drawing.Color.Black;
            this.btnDesbloquear.Image = global::TripTalk.Properties.Resources.botonBlancoSombra117x35;
            this.btnDesbloquear.Location = new System.Drawing.Point(43, 275);
            this.btnDesbloquear.Margin = new System.Windows.Forms.Padding(0);
            this.btnDesbloquear.Name = "btnDesbloquear";
            this.btnDesbloquear.Size = new System.Drawing.Size(139, 27);
            this.btnDesbloquear.TabIndex = 18;
            this.btnDesbloquear.Text = "Desbloquear";
            this.btnDesbloquear.UseVisualStyleBackColor = false;
            this.btnDesbloquear.Click += new System.EventHandler(this.btnDesbloquear_Click);
            // 
            // btnBloquear
            // 
            this.btnBloquear.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnBloquear.ForeColor = System.Drawing.Color.Black;
            this.btnBloquear.Image = global::TripTalk.Properties.Resources.botonBlancoSombra117x35;
            this.btnBloquear.Location = new System.Drawing.Point(274, 275);
            this.btnBloquear.Margin = new System.Windows.Forms.Padding(0);
            this.btnBloquear.Name = "btnBloquear";
            this.btnBloquear.Size = new System.Drawing.Size(139, 27);
            this.btnBloquear.TabIndex = 19;
            this.btnBloquear.Text = "Bloquear";
            this.btnBloquear.UseVisualStyleBackColor = false;
            this.btnBloquear.Click += new System.EventHandler(this.btnBloquear_Click);
            // 
            // UsuariosForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(462, 331);
            this.Controls.Add(this.btnBloquear);
            this.Controls.Add(this.btnDesbloquear);
            this.Controls.Add(this.listUsuarios);
            this.Controls.Add(this.btnCrearOp);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.pictureBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "UsuariosForm";
            this.Text = "UsuariosForm";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button btnCrearOp;
        private System.Windows.Forms.ListBox listUsuarios;
        private System.Windows.Forms.Button btnDesbloquear;
        private System.Windows.Forms.Button btnBloquear;
    }
}