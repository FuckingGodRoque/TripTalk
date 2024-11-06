using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using TripTalk.Clases;

namespace TripTalk.Forms
{
    public partial class Register : Form
    {
        Usuario usuario = new Usuario();
        public Register()
        {
            InitializeComponent();
        }

        private void btnCrear_Click(object sender, EventArgs e)
        {
            if(textNombre.Text !="Nombre" || textApellidos.Text != "Apellidos" || textCorreo.Text != "Correo" || textPassword.Text != "Contraseña")
            {
                usuario.Nombre= textNombre.Text;
                usuario.Apellido = textApellidos.Text;
                usuario.Correo= textCorreo.Text;
                usuario.Password= textPassword.Text;    
                crearUsuario();
                MessageBox.Show("Cuenta creada", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                textNombre.Text = "Nombre";
                textNombre.ForeColor= Color.Gray;
                textApellidos.Text = "Apellidos";
                textApellidos.ForeColor= Color.Gray;
                textCorreo.Text = "Correo";
                textCorreo.ForeColor= Color.Gray;
                textPassword.Text = "Contraseña";
                textPassword.ForeColor= Color.Gray;
                MessageBox.Show("Completa el formulario", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        private void crearUsuario()
        {

        }

        private void textNombre_MouseDown(object sender, MouseEventArgs e)
        {
            if (textNombre.Text.Equals("Nombre"))
            {
                textNombre.Text = "";
                textNombre.ForeColor = Color.Black;
            }
        }

        private void textApellidos_MouseDown(object sender, MouseEventArgs e)
        {
            if (textApellidos.Text.Equals("Apellidos"))
            {
                textApellidos.Text = "";
                textApellidos.ForeColor = Color.Black;
            }
        }

        private void textCorreo_MouseDown(object sender, MouseEventArgs e)
        {
            if (textCorreo.Text.Equals("Correo"))
            {
                textCorreo.Text = "";
                textCorreo.ForeColor = Color.Black;
            }
        }

        private void textPassword_MouseDown(object sender, MouseEventArgs e)
        {
            if (textPassword.Text.Equals("Password"))
            {
                textPassword.Text = "";
                textPassword.ForeColor = Color.Black;
                textPassword.PasswordChar = '*';
            }
        }
    }
}
