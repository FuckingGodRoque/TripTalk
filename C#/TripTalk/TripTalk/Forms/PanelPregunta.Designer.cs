namespace TripTalk.Forms
{
    partial class PanelPregunta
    {
        /// <summary> 
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de componentes

        /// <summary> 
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.labelUsuario = new System.Windows.Forms.Label();
            this.textAsk = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.textAnswer = new System.Windows.Forms.TextBox();
            this.btnEnviar = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.panelRespuestas = new System.Windows.Forms.FlowLayoutPanel();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // labelUsuario
            // 
            this.labelUsuario.AutoSize = true;
            this.labelUsuario.BackColor = System.Drawing.Color.White;
            this.labelUsuario.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelUsuario.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(165)))), ((int)(((byte)(123)))));
            this.labelUsuario.Location = new System.Drawing.Point(15, 17);
            this.labelUsuario.Name = "labelUsuario";
            this.labelUsuario.Size = new System.Drawing.Size(95, 15);
            this.labelUsuario.TabIndex = 0;
            this.labelUsuario.Text = "UsuarioName";
            // 
            // textAsk
            // 
            this.textAsk.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textAsk.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(189)))), ((int)(((byte)(75)))), ((int)(((byte)(0)))));
            this.textAsk.Location = new System.Drawing.Point(18, 46);
            this.textAsk.Margin = new System.Windows.Forms.Padding(0);
            this.textAsk.Multiline = true;
            this.textAsk.Name = "textAsk";
            this.textAsk.Size = new System.Drawing.Size(284, 50);
            this.textAsk.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.ForeColor = System.Drawing.Color.Gray;
            this.label1.Location = new System.Drawing.Point(15, 108);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(240, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Respuestas: Escribe una respuesta al comentario";
            // 
            // textAnswer
            // 
            this.textAnswer.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(165)))), ((int)(((byte)(123)))));
            this.textAnswer.Location = new System.Drawing.Point(18, 187);
            this.textAnswer.Name = "textAnswer";
            this.textAnswer.Size = new System.Drawing.Size(199, 20);
            this.textAnswer.TabIndex = 5;
            // 
            // btnEnviar
            // 
            this.btnEnviar.BackColor = System.Drawing.Color.White;
            this.btnEnviar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEnviar.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEnviar.ForeColor = System.Drawing.Color.White;
            this.btnEnviar.Image = global::TripTalk.Properties.Resources.barraNaranja60x20;
            this.btnEnviar.Location = new System.Drawing.Point(227, 183);
            this.btnEnviar.Name = "btnEnviar";
            this.btnEnviar.Size = new System.Drawing.Size(75, 26);
            this.btnEnviar.TabIndex = 8;
            this.btnEnviar.Text = "Enviar";
            this.btnEnviar.UseVisualStyleBackColor = false;
            this.btnEnviar.Click += new System.EventHandler(this.btnEnviar_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TripTalk.Properties.Resources.MARCONaranjaRedondeado;
            this.pictureBox1.Location = new System.Drawing.Point(0, 0);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(318, 223);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 1;
            this.pictureBox1.TabStop = false;
            // 
            // panelRespuestas
            // 
            this.panelRespuestas.Location = new System.Drawing.Point(18, 126);
            this.panelRespuestas.Margin = new System.Windows.Forms.Padding(0);
            this.panelRespuestas.Name = "panelRespuestas";
            this.panelRespuestas.Size = new System.Drawing.Size(284, 55);
            this.panelRespuestas.TabIndex = 9;
            // 
            // PanelPregunta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.panelRespuestas);
            this.Controls.Add(this.btnEnviar);
            this.Controls.Add(this.textAnswer);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textAsk);
            this.Controls.Add(this.labelUsuario);
            this.Controls.Add(this.pictureBox1);
            this.Name = "PanelPregunta";
            this.Size = new System.Drawing.Size(320, 226);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelUsuario;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.TextBox textAsk;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textAnswer;
        private System.Windows.Forms.Button btnEnviar;
        private System.Windows.Forms.FlowLayoutPanel panelRespuestas;
    }
}
