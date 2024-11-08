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
    public partial class UsuariosForm : Form
    {
        private BindingList<string> listModel = new BindingList<string>();
        private List<Usuario> listaUsuarios = new List<Usuario>(); 
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";
        public UsuariosForm()
        {
            InitializeComponent();
            this.StartPosition = FormStartPosition.CenterScreen;
            actualizarListaUsuarios();
        }
        private void cambiarEstadoUsuario(bool bloquear)
        {
            int indiceSeleccionado = listUsuarios.SelectedIndex;
            if (indiceSeleccionado >= 0)
            {
                Usuario usuarioSeleccionado = listaUsuarios[indiceSeleccionado];

                if (usuarioSeleccionado.Rol == "adm")
                {
                    btnBloquear.Enabled = false;
                    btnDesbloquear.Enabled = false;
                }
                else
                {
                    btnBloquear.Enabled = true;
                    btnDesbloquear.Enabled = true;
                    usuarioSeleccionado.Bloqueado = bloquear;
                    guardarUsuarios();
                    actualizarListaUsuarios();
                }
            }
            else
            {
                MessageBox.Show("Seleccione un usuario", "Advertencia", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        private void actualizarListaUsuarios()
        {
            cargarUsuarios();
            listModel.Clear();
            foreach (Usuario usuario in listaUsuarios)
            {
                string estado = usuario.Bloqueado ? "(Bloqueado)" : "(Activo)";
                listModel.Add(usuario.IdUsuario + ":    " + usuario.Nombre + " " + usuario.Apellido + " " + estado);
            }
            listUsuarios.DataSource = listModel;

            guardarUsuarios();
        }

        
        private void verificarRolUsuarioSeleccionado()
        {
            int indiceSeleccionado = listUsuarios.SelectedIndex;
            if (indiceSeleccionado >= 0)
            {
                Usuario usuarioSeleccionado = listaUsuarios[indiceSeleccionado];

                if (usuarioSeleccionado.Rol == "adm")
                {
                    btnBloquear.Enabled = false;
                    btnDesbloquear.Enabled = false;
                }
                else
                {

                    btnBloquear.Enabled = true;
                    btnDesbloquear.Enabled = true;
                }
            }
        }
        private void guardarUsuarios()
        {
            try
            {
                string json = JsonConvert.SerializeObject(listaUsuarios, Formatting.Indented);
                File.WriteAllText(ruta + "usuarios.json", json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }



        private void cargarUsuarios()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "usuarios.json");
                string json = sr.ReadToEnd();
                sr.Close();
                listaUsuarios = JsonConvert.DeserializeObject<List<Usuario>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }
        private void btnDesbloquear_Click(object sender, EventArgs e)
        {
            cambiarEstadoUsuario(false);
        }

        private void btnBloquear_Click(object sender, EventArgs e)
        {
            cambiarEstadoUsuario(true);
        }

        private void listUsuarios_SelectedIndexChanged(object sender, EventArgs e)
        {
            verificarRolUsuarioSeleccionado();
        }
    }
}
