using Microsoft.VisualBasic.Logging;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.ComTypes;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using TripTalk.Clases;

namespace TripTalk.Forms
{
    public partial class Menu : Form
    {
        Usuario usuario;
        List<Publicacion> publicaciones;
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";
        public Menu(Usuario usuario)
        {
            InitializeComponent();
            this.usuario = usuario;
            labelNombre.Text = usuario.Nombre;
            labelApellidos.Text = usuario.Apellido;
            if (usuario.Rol == "npc")
            {
                btnOfrecerViaje.Enabled = false;
                btnOfrecerViaje.Visible = false;
            }
            Form1_Load();
            cargarPublicaciones();
            showPublicaciones(0);
        }

        private void showPublicaciones(int opcion)
        {

            panelPublicaciones.Controls.Clear();
            // Recorrer la lista de publicaciones y crear un panelPublicacion para cada una
            foreach (Publicacion publicacion in publicaciones)
            {
                switch(opcion)
                {
                    case 0:
                        if (publicacion.Tipo == "opinion")
                        {
                            panelPublicacion panel = new panelPublicacion(publicacion)
                            {
                                Dock = DockStyle.Top
                            };
                            panelPublicaciones.Controls.Add(panel);
                        }
                        break;
                    case 1:
                        if (publicacion.Tipo == "viaje")
                        {
                            panelPublicacion panel = new panelPublicacion(publicacion)
                            {
                                Dock = DockStyle.Top
                            };
                            panelPublicaciones.Controls.Add(panel);
                        }
                        break;
                    case 2:
                        if (publicacion.IdUsuario == usuario.IdUsuario)
                        {
                            panelPublicacion panel = new panelPublicacion(publicacion)
                            {
                                Dock = DockStyle.Top
                            };
                            panelPublicaciones.Controls.Add(panel);
                        }
                        break;
                }
            }
        }

        private void Form1_Load()
        {
            tabControl1.Appearance = TabAppearance.FlatButtons;
            tabControl1.ItemSize = new Size(0, 1); // Tamaño de pestañas a 0 para hacerlas invisibles
            tabControl1.SizeMode = TabSizeMode.Fixed;
        }


        private void btnCrearOp_Click(object sender, EventArgs e)
        {
            limpiarCrearOp();
            tabControl1.SelectedIndex = 1;
            showPublicaciones(0);
        }

        private void limpiarCrearOp()
        {
            textLugar.Text = "Ejmplo: Guacamayas";
            textPresupuesto.Text= "$$$";
            textSitio1.Text = "";
            textSitio2.Text = "";
            textSitio3.Text = "";
            textObstaculos.Text = "";
            textFechas.Text = "";
            textPresupuesto.Text = "";
            textEquipaje.Text = "";

        }

        private void limpiarOfrecerViaje()
        {
            textLugar2.Text = "Ejmplo: Guacamayas";
            textCosto.Text = "$$$";
            textDetalles.Text = "";

        }

        private void btnOfrecerViaje_Click(object sender, EventArgs e)
        {
            limpiarOfrecerViaje();
            tabControl1.SelectedIndex = 2;
            showPublicaciones(1);
        }

        private void btnBack2_Click(object sender, EventArgs e)
        {
            limpiarOfrecerViaje();
            tabControl1.SelectedIndex = 0;
            showPublicaciones(0);
        }

        private void btnBack_Click(object sender, EventArgs e)
        {
            limpiarCrearOp();
            tabControl1.SelectedIndex = 0;
        }

        private void btnPublicar_Click(object sender, EventArgs e)
        {
            if (textLugar.Text == "Ejmplo: Guacamayas"|| textLugar.Text ==""||
            textPresupuesto.Text == "$$$"|| textPresupuesto.Text == ""||
            textSitio1.Text == ""||
            textSitio2.Text == ""||
            textSitio3.Text == ""||
            textObstaculos.Text == ""||
            textFechas.Text == ""||
            textPresupuesto.Text == ""||
            textEquipaje.Text == "")
            {
                MessageBox.Show("Complete todo el formulario", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else
            {
                int id = publicaciones.Count;
                Publicacion publicacion = new Publicacion(id,textLugar.Text, textPresupuesto.Text, textObstaculos.Text,textSitio2.Text, textSitio3.Text, textSitio1.Text, textEquipaje.Text,textFechas.Text, "viaje",usuario.IdUsuario);
                publicaciones.Add(publicacion);
                MessageBox.Show("Publicado", "Informacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
                limpiarCrearOp();
                tabControl1.SelectedIndex = 0;
                showPublicaciones(0);
            }
        }

        private void cargarPublicaciones()
        {
            try
            {
                StreamReader sr = new StreamReader("C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\publicaciones.json");
                string json = sr.ReadToEnd();
                sr.Close();
                publicaciones = JsonConvert.DeserializeObject<List<Publicacion>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void btnPublicar2_Click(object sender, EventArgs e)
        {
            if (textLugar2.Text == "Ejmplo: Guacamayas" || textLugar2.Text == "" ||
            textCosto.Text == "$$$" || textCosto.Text == "" ||
            textDetalles.Text == "")
            {
                MessageBox.Show("Complete todo el formulario", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else
            {
                int id = publicaciones.Count();
                Publicacion publicacion = new Publicacion(id, textLugar2.Text, textCosto.Text, textDetalles.Text, usuario.IdUsuario);
                publicaciones.Add(publicacion);
                GuardarPublicaciones();
                MessageBox.Show("Publicado", "Informacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
                limpiarOfrecerViaje();
                tabControl1.SelectedIndex = 0;
                showPublicaciones(1);

            }
        }

        private void GuardarPublicaciones()
        {
            try
            {
                string json = JsonConvert.SerializeObject(publicaciones, Formatting.Indented);
                File.WriteAllText(ruta+"publicaciones.json", json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void btnCerrarSesion_Click(object sender, EventArgs e)
        {
            new Login().Show();
            this.Hide();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnOpiniones_Click(object sender, EventArgs e)
        {
            showPublicaciones(0);

        }

        private void btnViajes_Click(object sender, EventArgs e)
        {
            showPublicaciones(1);
        }

        private void btnMisPublicaciones_Click(object sender, EventArgs e)
        {
            showPublicaciones(2);
        }

        private void textCosto_MouseClick(object sender, MouseEventArgs e)
        {
            textCosto.Text = "";
            textCosto.ForeColor = Color.Black;
        }

        private void textLugar2_MouseClick(object sender, MouseEventArgs e)
        {
            textLugar2.Text = "";
            textLugar2.ForeColor = Color.Black;
        }
    }
}
