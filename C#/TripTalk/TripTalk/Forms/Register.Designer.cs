namespace TripTalk.Forms
{
    partial class Register
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.textApellidos = new System.Windows.Forms.TextBox();
            this.textCorreo = new System.Windows.Forms.TextBox();
            this.textPassword = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btnCrear = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(297, 20);
            this.panel1.TabIndex = 12;
            // 
            // textNombre
            // 
            this.textNombre.BackColor = System.Drawing.Color.White;
            this.textNombre.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textNombre.ForeColor = System.Drawing.Color.Gray;
            this.textNombre.Location = new System.Drawing.Point(85, 221);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(153, 22);
            this.textNombre.TabIndex = 13;
            this.textNombre.Tag = "";
            this.textNombre.Text = "Nombre";
            this.textNombre.MouseDown += new System.Windows.Forms.MouseEventHandler(this.textNombre_MouseDown);
            // 
            // textApellidos
            // 
            this.textApellidos.BackColor = System.Drawing.Color.White;
            this.textApellidos.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textApellidos.ForeColor = System.Drawing.Color.Gray;
            this.textApellidos.Location = new System.Drawing.Point(85, 249);
            this.textApellidos.Name = "textApellidos";
            this.textApellidos.Size = new System.Drawing.Size(153, 22);
            this.textApellidos.TabIndex = 14;
            this.textApellidos.Tag = "";
            this.textApellidos.Text = "Apellidos";
            this.textApellidos.MouseDown += new System.Windows.Forms.MouseEventHandler(this.textApellidos_MouseDown);
            // 
            // textCorreo
            // 
            this.textCorreo.BackColor = System.Drawing.Color.White;
            this.textCorreo.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textCorreo.ForeColor = System.Drawing.Color.Gray;
            this.textCorreo.Location = new System.Drawing.Point(85, 277);
            this.textCorreo.Name = "textCorreo";
            this.textCorreo.Size = new System.Drawing.Size(153, 22);
            this.textCorreo.TabIndex = 15;
            this.textCorreo.Tag = "";
            this.textCorreo.Text = "Correo";
            this.textCorreo.MouseDown += new System.Windows.Forms.MouseEventHandler(this.textCorreo_MouseDown);
            // 
            // textPassword
            // 
            this.textPassword.BackColor = System.Drawing.Color.White;
            this.textPassword.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textPassword.ForeColor = System.Drawing.Color.Gray;
            this.textPassword.Location = new System.Drawing.Point(85, 305);
            this.textPassword.Name = "textPassword";
            this.textPassword.Size = new System.Drawing.Size(153, 22);
            this.textPassword.TabIndex = 16;
            this.textPassword.Tag = "";
            this.textPassword.Text = "Contraseña";
            this.textPassword.MouseDown += new System.Windows.Forms.MouseEventHandler(this.textPassword_MouseDown);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(84, 167);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(155, 39);
            this.label1.TabIndex = 17;
            this.label1.Text = "Registro";
            // 
            // btnCrear
            // 
            this.btnCrear.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(191)))), ((int)(((byte)(122)))));
            this.btnCrear.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCrear.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCrear.ForeColor = System.Drawing.Color.White;
            this.btnCrear.Image = global::TripTalk.Properties.Resources.barraDegradadoNaranja120x24;
            this.btnCrear.Location = new System.Drawing.Point(99, 342);
            this.btnCrear.Name = "btnCrear";
            this.btnCrear.Size = new System.Drawing.Size(125, 32);
            this.btnCrear.TabIndex = 18;
            this.btnCrear.Text = "Crear cuenta";
            this.btnCrear.UseVisualStyleBackColor = false;
            this.btnCrear.Click += new System.EventHandler(this.btnCrear_Click);
            // 
            // button3
            // 
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button3.Image = global::TripTalk.Properties.Resources.close30x30;
            this.button3.Location = new System.Drawing.Point(295, 0);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(30, 30);
            this.button3.TabIndex = 11;
            this.button3.UseVisualStyleBackColor = true;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TripTalk.Properties.Resources.logoTripTalk260x140;
            this.pictureBox1.Location = new System.Drawing.Point(37, 20);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(252, 132);
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // Register
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(191)))), ((int)(((byte)(122)))));
            this.ClientSize = new System.Drawing.Size(324, 417);
            this.Controls.Add(this.btnCrear);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textPassword);
            this.Controls.Add(this.textCorreo);
            this.Controls.Add(this.textApellidos);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.pictureBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Register";
            this.Text = "Register";
            this.Load += new System.EventHandler(this.Register_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.TextBox textApellidos;
        private System.Windows.Forms.TextBox textCorreo;
        private System.Windows.Forms.TextBox textPassword;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnCrear;
    }
}