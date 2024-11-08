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
    public partial class Comentarios : Form
    {
        private Usuario usuario;
        private Usuario usuarioActual;
        private Publicacion publicacion;
        private List<Pregunta> listPreguntas = new List<Pregunta>();
        private String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";

        public Comentarios(Publicacion publicacion, Usuario usuario, Usuario usuarioActual)
        {
            InitializeComponent();
            this.usuario = usuario;
            this.usuarioActual=usuarioActual;
            this.publicacion = publicacion;
            cargarPreguntas(); 
            ActualizarComentarios(); 
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            if (textAsk.Text == "")
            {
                MessageBox.Show("¡Antes debes escribir una pregunta!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else
            {
                int id;
                if (listPreguntas.Count == 0)
                {
                    id = 0;
                }
                else
                {
                    id = listPreguntas.Last().IdPregunta + 1;
                }
                Pregunta pregunta = new Pregunta(id, publicacion.IdPublicacion, textAsk.Text, usuarioActual.IdUsuario);
                listPreguntas.Add(pregunta);
                textAsk.Text = "";
                guardarPreguntas(); 
                ActualizarComentarios(); 
            }
        }

        public void ActualizarComentarios()
        {

            panelComentarios.Controls.Clear();
            foreach (Pregunta pregunta in listPreguntas)
            {
                if (pregunta.IdPublicacion == publicacion.IdPublicacion) 
                {
                    PanelPregunta panelPregunta = new PanelPregunta(usuario, pregunta, usuarioActual);
                    panelPregunta.Dock = DockStyle.Top; 
                    panelComentarios.Controls.Add(panelPregunta); 
                }
            }
            panelComentarios.Refresh();
        }

        private void cargarPreguntas()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "preguntas.json");
                string json = sr.ReadToEnd();
                sr.Close();
                listPreguntas = JsonConvert.DeserializeObject<List<Pregunta>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void guardarPreguntas()
        {
            try
            {
                string json = JsonConvert.SerializeObject(listPreguntas, Formatting.Indented);
                File.WriteAllText(ruta + "preguntas.json", json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void eliminarPregunta(Pregunta pregunta)
        {
            listPreguntas.Remove(pregunta);
            guardarPreguntas();
        }
    }
}
