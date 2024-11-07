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
    public partial class Menu : Form
    {
        Usuario usuario;
        List<Publicacion> publicaciones;
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
            cargarPublicaciones();
        }

        private void btnCrearOp_Click(object sender, EventArgs e)
        {
            limpiarCrearOp();
            panel2.Select();
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
            panel3.Select();
        }

        private void btnBack2_Click(object sender, EventArgs e)
        {
            limpiarOfrecerViaje();
            panel1.Select();

        }

        private void btnBack_Click(object sender, EventArgs e)
        {
            limpiarCrearOp();
            panel1.Select();
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
                Publicacion publicacion = new Publicacion(id,textLugar.Text, textPresupuesto.Text, textObstaculos.Text, textEquipaje.Text,textFechas.Text, "viaje",usuario.IdUsuario);
                publicaciones.Add(publicacion);
                MessageBox.Show("Publicado", "Informacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
                limpiarCrearOp();
                panel1.Select();
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
            if (textLugar2.Text == "Ejmplo: Guacamayas" || textLugar2.Text == ""||
            textCosto.Text == "$$$"|| textCosto.Text == "" ||
            textDetalles.Text == "")
            {
                MessageBox.Show("Complete todo el formulario", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else
            {
                int id = publicaciones.Count();
                Publicacion publicacion = new Publicacion(id, textLugar.Text, textCosto.Text, textDetalles.Text);
                publicaciones.Add(publicacion);
                MessageBox.Show("Publicado", "Informacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
                limpiarOfrecerViaje();
                panel1.Select();

            }
        }
    }
}
