using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Pregunta
    {
        private int idPregunta;
        private int idPublicacion;
        private string pregunta;
        private int idUsuario;

        public Pregunta()
        {

        }
        public Pregunta(int idPregunta, int idPublicacion, string pregunta, int idUsuario)
        {
            this.idPregunta = idPregunta;
            this.idPublicacion = idPublicacion;
            this.pregunta = pregunta;
            this.idUsuario = idUsuario;
        }

        public int IdPregunta { get => idPregunta; set => idPregunta = value; }
        public int IdPublicacion { get => idPublicacion; set => idPublicacion = value; }
        public string ask { get => pregunta; set => pregunta = value; }
        public int IdUsuario { get => idUsuario; set => idUsuario = value; }
    }
}
