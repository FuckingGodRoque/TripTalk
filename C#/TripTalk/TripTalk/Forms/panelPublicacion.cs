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
    public partial class panelPublicacion : UserControl
    {
        private Publicacion publicacion=new Publicacion();
        private List<Usuario> listUsuarios=new List<Usuario>();
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";
        public panelPublicacion(Publicacion publicacion)
        {
            InitializeComponent();
            this.publicacion = publicacion;
            labelLugar.Text= publicacion.Lugar;
            cargarUsuarios();
            Usuario usuario = listUsuarios.Find(u => u.IdUsuario == publicacion.IdUsuario);
            if (publicacion.Tipo == "opinion")
            {
                labelUsuario.Text = usuario.Nombre;
                labelPresupuesto.Text = "$" + publicacion.Presupuesto;
                labelRecomendacion1.Text = publicacion.LugarRecomendado1;
                labelRecomendacion2.Text = publicacion.LugarRecomendado2;
                labelRecomendacion3.Text = publicacion.LugarRecomendado3;
                textObstaculo.Text = publicacion.Obstaculos;
                textEquipaje.Text = publicacion.Equipaje;
                textFechas.Text = publicacion.FechasRecomendadas;
                labelOV.Visible = false;
                labelOVUsuario.Visible = false;
                labelOVLugar.Visible = false;
                labelOV1.Visible = false;
                labelOVCosto.Visible = false;
                labelOV3.Visible = false;
                panelOV.Visible = false;
                pictureBoxOV.Visible = false;
                textOVDetalles.Visible = false;
            }
            else
            {
                labelOVUsuario.Text = usuario.Nombre+ " "+usuario.Apellido;
                labelOVLugar.Text = publicacion.Lugar;
                labelOVCosto.Text = "$" + publicacion.Presupuesto;
                textOVDetalles.Text = publicacion.Detalles;
            }
        }

        private void cargarUsuarios()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "usuarios.json");
                string json = sr.ReadToEnd();
                sr.Close();
                listUsuarios = JsonConvert.DeserializeObject<List<Usuario>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void btnComentarios_Click(object sender, EventArgs e)
        {

        }
    }
}
