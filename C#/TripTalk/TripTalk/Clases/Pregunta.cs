using Newtonsoft.Json;
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

        [JsonProperty("idPregunta")]
        public int IdPregunta { get => idPregunta; set => idPregunta = value; }
        [JsonProperty("idPublicacion")]
        public int IdPublicacion { get => idPublicacion; set => idPublicacion = value; }
        [JsonProperty("pregunta")]
        public string Ask { get => pregunta; set => pregunta = value; }
        [JsonProperty("idUsuario")]
        public int IdUsuario { get => idUsuario; set => idUsuario = value; }
    }
}
