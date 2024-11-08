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
        List<ViajeInteres> viajesInteres = new List<ViajeInteres>();
        List<Usuario> usuarios = new List<Usuario>();
        Usuario usuario=new Usuario();
        Usuario usuarioActual = new Usuario();
        private bool leInteresa;
        private Publicacion publicacion=new Publicacion();
        private List<Usuario> listUsuarios=new List<Usuario>();
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";
        public panelPublicacion(Publicacion publicacion, Usuario usuarioActual)
        {
            InitializeComponent();
            this.publicacion = publicacion;
            labelLugar.Text = publicacion.Lugar;
            cargarUsuarios();
            this.usuarioActual = usuarioActual;
            usuario = listUsuarios.Find(u => u.IdUsuario == publicacion.IdUsuario);
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
                btnInteres.Visible = false;
                btnInteres.Enabled = false;
                btnExcel.Visible = false;
                btnExcel.Enabled = false;
                btnBorrar.Enabled = false;
                btnBorrar.Visible = false;
            }
            else
            {
                labelOVUsuario.Text = usuario.Nombre + " " + usuario.Apellido;
                labelOVLugar.Text = publicacion.Lugar;
                labelOVCosto.Text = "$" + publicacion.Presupuesto;
                textOVDetalles.Text = publicacion.Detalles;
            }
        }

        public void DefinirInteres()
        {
            cargarViajesInteres();
            for (ViajeInteres viajeInteres : viajesInteres) //Que show
            {
                if (viajeInteres.IdUsuario == usuarioActual.IdUsuario && viajeInteres.IdPublicacion == publicacion.IdPublicacion)
                {
                    leInteresa = true;
                    btnInteres.Text="Ya no me interesa";
                }
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
        private void guardarViajeInteres()
        {
            try
            {
                string json = JsonConvert.SerializeObject(viajesInteres, Formatting.Indented);
                File.WriteAllText(ruta + "viajeInteres.json", json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void cargarViajesInteres()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "viajesInteres.json");
                string json = sr.ReadToEnd();
                sr.Close();
                viajesInteres = JsonConvert.DeserializeObject<List<ViajeInteres>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void btnComentarios_Click(object sender, EventArgs e)
        {
            new Comentarios(publicacion,usuario,usuarioActual).Show();
        }
    }
}
