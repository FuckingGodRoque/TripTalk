using ClosedXML.Excel;
using iTextSharp.text;
using iTextSharp.text.pdf;
using Microsoft.VisualBasic.Logging;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Windows.Forms;
using TripTalk.Clases;

namespace TripTalk.Forms
{
    public partial class Menu : Form
    {
        Usuario usuario;
        List<Publicacion> publicaciones;
        List<Usuario> usuarios;
        List<Pregunta> preguntas;
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
                btnShowUsuarios.Enabled = false;
                btnShowUsuarios.Visible = false;
                btnPopulares.Enabled = false;
                btnPopulares.Visible = false;
                btnTopUs.Visible = false;
                btnTopUs.Enabled = false;
            }

            Form1_Load();
            cargarPublicaciones();
            showPublicaciones(0);
        }

        private void showPublicaciones(int feedIndex)
        {
            panelPublicaciones.Controls.Clear();
            int cantidadPublicaciones = 0;

            foreach (Publicacion publicacion in publicaciones)
            {
                bool valida = false;
                switch (feedIndex)
                {
                    case 0:
                        valida = publicacion.Tipo.Equals("opinion", StringComparison.OrdinalIgnoreCase);
                        break;
                    case 1:
                        valida = publicacion.Tipo.Equals("viaje", StringComparison.OrdinalIgnoreCase);
                        break;
                    case 2:
                        valida = publicacion.IdUsuario == usuario.IdUsuario;
                        break;
                }

                if (valida)
                {
                    Usuario usuarioPublicacion = ObtenerUsuario(publicacion.IdUsuario);
                    if (usuarioPublicacion != null && !usuarioPublicacion.Bloqueado)
                    {
                        panelPublicacion panel = new panelPublicacion(publicacion, usuario)
                        {
                            Dock = DockStyle.Top
                        };
                        panelPublicaciones.Controls.Add(panel);
                        cantidadPublicaciones++;
                    }
                }
            }

            panelPublicaciones.Update();
        }

        private void Form1_Load()
        {
            tabControl1.Appearance = TabAppearance.FlatButtons;
            tabControl1.ItemSize = new Size(0, 1);
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
                int id;
                if (publicaciones.Count == 0)
                {
                    id = 0;
                }
                else
                {
                    id = publicaciones.Last().IdPublicacion + 1;
                }

                Publicacion publicacion = new Publicacion(id,textLugar.Text, textPresupuesto.Text, textObstaculos.Text,textSitio2.Text, textSitio3.Text, textSitio1.Text, textEquipaje.Text,textFechas.Text, "viaje",usuario.IdUsuario);
                publicaciones.Add(publicacion);
                MessageBox.Show("Publicado", "Informacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
                limpiarCrearOp();
                tabControl1.SelectedIndex = 0;
                showPublicaciones(0);
            }
        }
        public void EliminarPublicacion(Publicacion publicacion)
        {
            publicaciones.Remove(publicacion);
            GuardarPublicaciones();
            showPublicaciones(0);
        }
        public Usuario ObtenerUsuario(int idUsuario)
        {
            cargarUsuarios();
            foreach (Usuario usuario in usuarios)
            {
                if (usuario.IdUsuario == idUsuario)
                {
                    return usuario;
                }
            }
            return null;
        }
        private void cargarUsuarios()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "usuarios.json");
                string json = sr.ReadToEnd();
                sr.Close();
                usuarios = JsonConvert.DeserializeObject<List<Usuario>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }

        private void cargarPreguntas()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta + "preguntas.json");
                string json = sr.ReadToEnd();
                sr.Close();
                preguntas = JsonConvert.DeserializeObject<List<Pregunta>>(json);
            }
            catch (Exception ex)
            {
                new Log().WriteException(ex);
            }
        }
        /* DOCUMENTOS
        public void GenerarReporteLugares(List<Publicacion> publicaciones, List<Pregunta> preguntas)
        {
            cargarPublicaciones();
            cargarPreguntas();
            var conteoLugares = new Dictionary<string, int>();

            // Crear una lista de lugares válidos
            var lugaresValidos = new HashSet<string>(publicaciones.Select(p => p.Lugar));

            // Contar menciones de lugares en publicaciones
            foreach (var publicacion in publicaciones)
            {
                if (!string.IsNullOrEmpty(publicacion.Lugar))
                {
                    conteoLugares[publicacion.Lugar] = conteoLugares.ContainsKey(publicacion.Lugar)
                        ? conteoLugares[publicacion.Lugar] + 1
                        : 1;
                }
            }

            // Contar menciones de lugares en preguntas
            foreach (var pregunta in preguntas)
            {
                foreach (var lugar in lugaresValidos)
                {
                    if (pregunta.Ask.Contains(lugar))
                    {
                        conteoLugares[lugar] = conteoLugares.ContainsKey(lugar)
                            ? conteoLugares[lugar] + 1
                            : 1;
                    }
                }
            }

            // Seleccionar los tres lugares más mencionados
            var topLugares = conteoLugares.OrderByDescending(x => x.Value).Take(3).ToList();

            // Crear archivo Excel con gráfico
            CrearExcelConGrafica(topLugares);
        }

        private void CrearExcelConGrafica(List<KeyValuePair<string, int>> topLugares)
        {
            using (var workbook = new XLWorkbook())
            {
                var worksheet = workbook.Worksheets.Add("Lugares más mencionados");

                // Crear encabezados
                worksheet.Cell(1, 1).Value = "Lugar";
                worksheet.Cell(1, 2).Value = "Menciones";

                // Llenar datos
                int row = 2;
                foreach (var lugar in topLugares)
                {
                    worksheet.Cell(row, 1).Value = lugar.Key;
                    worksheet.Cell(row, 2).Value = lugar.Value;
                    row++;
                }

                // Si deseas evitar el error de gráficos, puedes omitir esta parte
                // o si necesitas gráficos, es necesario usar OpenXml.

                // Guardar y abrir archivo
                string filePath = Path.Combine(ruta, "ReporteLugares.xlsx");
                workbook.SaveAs(filePath);
                Process.Start(new ProcessStartInfo(filePath) { UseShellExecute = true });
            }
        }

        private void CrearReporteUsuarios(List<Usuario> usuarios)
        {
            using (var workbook = new XLWorkbook())
            {
                var worksheet = workbook.Worksheets.Add("Top Usuarios");

                // Crear la tabla de usuarios con los datos.
                var table = worksheet.Range("A1:C1").CreateTable();
                table.SetShowAutoFilter(true);

                // Insertar encabezados
                table.Cell(1, 1).Value = "Usuario";
                table.Cell(1, 2).Value = "Total de Publicaciones";
                table.Cell(1, 3).Value = "Lugar de Publicaciones";

                // Llenar datos de los usuarios
                int row = 2;
                foreach (var usuario in usuarios)
                {
                    table.Cell(row, 1).Value = usuario.Nombre;
                    table.Cell(row, 2).Value = usuario.Publicaciones.Count;
                    table.Cell(row, 3).Value = usuario.Lugar;
                    row++;
                }

                // Guardar archivo
                string filePath = Path.Combine(ruta, "ReporteUsuarios.xlsx");
                workbook.SaveAs(filePath);
                Process.Start(new ProcessStartInfo(filePath) { UseShellExecute = true });
            }
        }



        public void CrearPdfUsuariosMasOpiniones()
        {
            cargarPublicaciones();
            cargarUsuarios();

            // Filtrar las publicaciones de tipo "opinión"
            var publicacionesOpinion = publicaciones.Where(p => p.Tipo.Equals("opinion", StringComparison.OrdinalIgnoreCase)).ToList();

            // Contar las publicaciones por usuario
            var publicacionesPorUsuario = publicacionesOpinion
                .GroupBy(p => usuarios.FirstOrDefault(u => u.IdUsuario == p.IdUsuario))
                .Where(g => g.Key != null)
                .ToDictionary(g => g.Key, g => g.LongCount());

            // Obtener los 3 usuarios con más publicaciones de tipo "opinión"
            var topUsuarios = publicacionesPorUsuario.OrderByDescending(x => x.Value).Take(3).ToList();

            // Crear documento PDF
            string filePath = Path.Combine(ruta, "TopUsuarios.pdf");
            using (FileStream fs = new FileStream(filePath, FileMode.Create, FileAccess.Write, FileShare.None))
            using (Document document = new Document())
            using (PdfWriter writer = PdfWriter.GetInstance(document, fs))
            {
                document.Open();

                // Título del documento
                document.Add(new Paragraph("Top 3 Usuarios con Más Publicaciones de Opinión").SetBold().SetFontSize(14));

                // Crear tabla
                Table table = new Table(new float[] { 3, 2, 3 });
                table.AddHeaderCell("Usuario");
                table.AddHeaderCell("Total de Publicaciones");
                table.AddHeaderCell("Lugar de Publicaciones");

                // Agregar datos a la tabla
                foreach (var entry in topUsuarios)
                {
                    var usuario = entry.Key;
                    var totalPublicaciones = entry.Value;

                    table.AddCell($"{usuario.Nombre} {usuario.Apellido}");
                    table.AddCell(totalPublicaciones.ToString());

                    // Agregar lugares de publicaciones de tipo "opinión"
                    var lugares = publicacionesOpinion
                        .Where(p => p.IdUsuario == usuario.IdUsuario)
                        .Select(p => p.Lugar)
                        .ToList();
                    table.AddCell(string.Join(", ", lugares));
                }

                document.Add(table);
            }

            // Abrir el archivo PDF automáticamente
            if (File.Exists(filePath))
            {
                Process.Start(new ProcessStartInfo(filePath) { UseShellExecute = true });
            }
        }

        public class Log
        {
            private string logFilePath = "error_log.txt";

            public void WriteException(Exception ex)
            {
                File.AppendAllText(logFilePath, DateTime.Now.ToString() + ": " + ex.Message + Environment.NewLine);
            }
        }*/



        private void cargarPublicaciones()
        {
            try
            {
                StreamReader sr = new StreamReader(ruta+"publicaciones.json");
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
            btnOpiniones.Image = TripTalk.Properties.Resources.botonGrisSombra100x30;
            btnOpiniones.ForeColor = Color.White;
            btnOfrecerViaje.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnOfrecerViaje.ForeColor = Color.Black;
            btnMisPublicaciones.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnMisPublicaciones.ForeColor = Color.Black;

        }

        private void btnViajes_Click(object sender, EventArgs e)
        {
            showPublicaciones(1);
            btnViajes.Image = TripTalk.Properties.Resources.botonGrisSombra100x30;
            btnViajes.ForeColor = Color.White;
            btnOpiniones.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnOpiniones.ForeColor = Color.Black;
            btnMisPublicaciones.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnMisPublicaciones.ForeColor = Color.Black;
        }

        private void btnMisPublicaciones_Click(object sender, EventArgs e)
        {
            showPublicaciones(2);
            btnMisPublicaciones.Image = TripTalk.Properties.Resources.botonGrisSombra100x30;
            btnMisPublicaciones.ForeColor = Color.White;
            btnOfrecerViaje.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnOfrecerViaje.ForeColor = Color.Black;
            btnOpiniones.Image = TripTalk.Properties.Resources.botonBlancoSombra100x30;
            btnOpiniones.ForeColor = Color.Black;
            
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

        private void btnPopulares_Click(object sender, EventArgs e)
        {

        }
    }
}
