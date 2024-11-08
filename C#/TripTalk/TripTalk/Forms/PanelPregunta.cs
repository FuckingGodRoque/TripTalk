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
    public partial class PanelPregunta : UserControl
    {
        Pregunta pregunta;
        Usuario usuario;
        Usuario usuarioActual;
        List<Usuario> listUsuarios = new List<Usuario>();
        List<Publicacion> publicaciones = new List<Publicacion>();
        List<Respuesta> respuestas = new List<Respuesta>();

        String ruta = "C:\\Users\\DANIEL ROQUE\\OneDrive - Instituto Tecnológico de Morelia\\5to Semestre\\TAP\\TripTalk\\Files\\";

        public PanelPregunta(Usuario usuario, Pregunta pregunta, Usuario usuarioActual)
        {
            InitializeComponent();
            this.pregunta = pregunta;
            this.usuario = usuario;
            this.usuarioActual = usuarioActual;
            cargarUsuarios(); 
            cargarRespuestas(); 
            ActualizarInfo();
            panelRespuestas.FlowDirection = FlowDirection.TopDown;
        }

        private void ActualizarInfo()
        {
            Usuario usuarioPregunta = obtenerUsuario(pregunta.IdUsuario);
            labelUsuario.Text = usuarioPregunta.Nombre + " " + usuarioPregunta.Apellido;
            textAsk.Text = pregunta.Ask;


            panelRespuestas.Controls.Clear();
            ActualizarRespuestas(); 
        }

        private void ActualizarRespuestas()
        {
            panelRespuestas.Controls.Clear();

            int yOffset = 0; 

            foreach (Respuesta respuesta in respuestas)
            {
                if (respuesta.IdPregunta == pregunta.IdPregunta)
                {
                    Usuario usuario = obtenerUsuario(respuesta.IdUsuario);
                    if (usuario != null)
                    {
                        String txtRespuesta = usuario.Nombre + " " + usuario.Apellido + ": " + respuesta.Answer + "\n";
                        Label lblRespuesta = new Label
                        {
                            Text = txtRespuesta,
                            AutoSize = true,
                            Location = new Point(0, yOffset) 
                        };
                        panelRespuestas.Controls.Add(lblRespuesta);
                        yOffset += lblRespuesta.Height + 5; 
                    }
                }
            }
            panelRespuestas.Refresh();
        }


        public Usuario obtenerUsuario(int idUsuario)
        {

            return listUsuarios.FirstOrDefault(u => u.IdUsuario == idUsuario);
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

        private void cargarRespuestas()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "respuestas.json");
                string json = sr.ReadToEnd();
                sr.Close();
                respuestas = JsonConvert.DeserializeObject<List<Respuesta>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void GuardarRespuestas()
        {
            try
            {
                string json = JsonConvert.SerializeObject(respuestas, Formatting.Indented); 
                File.WriteAllText(ruta + "respuestas.json", json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            string text = textAnswer.Text;
            if (textAnswer.Text == "")
            {
                MessageBox.Show("¡Antes debes escribir una pregunta!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Warning);

            }
            else
            {
                int id= respuestas.Count;
                Respuesta respuesta = new Respuesta(id, pregunta.IdPregunta, text, usuarioActual.IdUsuario);
                respuestas.Add(respuesta);
                textAnswer.Text = "";
                GuardarRespuestas();
                ActualizarRespuestas();
            }
        }
    }

}
