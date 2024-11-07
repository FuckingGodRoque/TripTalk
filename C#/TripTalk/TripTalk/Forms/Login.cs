using Microsoft.VisualBasic.Logging;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using TripTalk.Clases;

namespace TripTalk.Forms
{
    public partial class Login : Form
    {
        private bool mouseD;
        private Point lastLocation;
        private List<Usuario> listUsuarios = new List<Usuario>();
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";
        public Login()
        {
            InitializeComponent();
            cargarUsuarios();
        }

        private void panel1_MouseDown(object sender, MouseEventArgs e)
        {
            mouseD = true;
            lastLocation = e.Location;
        }

        private void panel1_MouseMove(object sender, MouseEventArgs e)
        {
            if (mouseD)
            {
                int ejeX = e.Location.X - lastLocation.X;
                int ejeY = e.Location.Y - lastLocation.Y;
                this.Location = new Point(this.Location.X + ejeX, this.Location.Y + ejeY);
            }
        }

        private void panel1_MouseUp(object sender, MouseEventArgs e)
        {
            mouseD = false;
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            iniciarSesion();


        }

        public void iniciarSesion()
        {
            bool acceso = false;
            foreach (Usuario usuario in listUsuarios)
            {
                if (usuario.Correo == textCorreo.Text)
                {
                    if (usuario.Password == textPassword.Text)
                    {
                        acceso = true;
                        Console.WriteLine("contraseña correcta");
                        new Menu(usuario).Show();
                        break;
                    }
                }
            }

            if (acceso)
            {
                this.Hide();
            }
            else
            {
                textCorreo.Text = "Ingrese su correo";
                textCorreo.ForeColor = Color.Gray;
                textPassword.Text = "********";
                textPassword.ForeColor = Color.Gray;
                MessageBox.Show("Usuario o contraseña incorrecta", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void cargarUsuarios()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta +"usuarios.json");
                string json = sr.ReadToEnd();
                sr.Close();
                listUsuarios = JsonConvert.DeserializeObject<List<Usuario>>(json);
            }
            catch(Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void textUsuario_MouseDown(object sender, MouseEventArgs e)
        {
            if (textCorreo.Text.Equals("Ingrese su correo"))
            {
                textCorreo.Text = "";
                textCorreo.ForeColor = Color.Black;
            }
            if (textPassword.Text.Equals(""))
            {
                textPassword.Text = "********";
                textPassword.ForeColor = Color.Gray;
            }
        }

        private void textPassword_MouseDown(object sender, MouseEventArgs e)
        {
            if (textPassword.Text.Equals("********"))
            {
                textPassword.Text = "";
                textPassword.ForeColor = Color.Black;
            }
            if (textCorreo.Text.Equals(""))
            {
                textCorreo.Text = "Ingrese su correo";
                textCorreo.ForeColor = Color.Gray;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            new Register().Show();
            this.Hide();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
