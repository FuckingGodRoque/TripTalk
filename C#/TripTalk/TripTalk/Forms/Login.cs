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
            string user = textUsuario.Text;
            string pass = textPassword.Text;
            bool existe = false;


        }

        public void iniciarSesion()
        {
            bool acceso = false;
            foreach (Usuario usuario in listUsuarios)
            {
                if (usuario.User == textUsuario.Text)
                {
                    if (usuario.Password == textPassword.Text)
                    {
                        acceso = true;
                        Console.WriteLine("contraseña correcta");
                        //Mandar usuario al proximo form 
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
                textUsuario.Text = "Ingrese su nombre de usuario";
                textUsuario.ForeColor = Color.Gray;
                textPassword.Text = "********";
                textPassword.ForeColor = Color.Gray;
                MessageBox.Show("Usuario o contraseña incorrecta", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void cargarUsuarios()
        {
            try
            {
                StreamReader sr = new StreamReader("C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\usuarios.json");
                string json = sr.ReadToEnd();
                sr.Close();
                listUsuarios = JsonConvert.DeserializeObject<List<Usuario>>(json);
            }
            catch(Exception ex)
            {
                new Log().WriteException(ex);
            }
        }
    }
}
