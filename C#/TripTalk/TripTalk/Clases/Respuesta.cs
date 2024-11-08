using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Respuesta
    {
        private int idRespuesta;
        private int idPregunta;
        private String respuesta;
        private int idUsuario;

        private Respuesta()
        {
        }
        public Respuesta(int idRespuesta, int idPregunta, string respuesta, int idUsuario)
        {
            this.idRespuesta = idRespuesta;
            this.idPregunta = idPregunta;
            this.respuesta = respuesta;
            this.idUsuario = idUsuario;
        }
        [JsonProperty("idRespuesta")]
        public int IdRespuesta { get => idRespuesta; set => idRespuesta = value; }
        [JsonProperty("idPregunta")]
        public int IdPregunta { get => idPregunta; set => idPregunta = value; }
        [JsonProperty("respuesta")]
        public string Answer { get => respuesta; set => respuesta = value; }
        [JsonProperty("idUsuario")]
        public int IdUsuario { get => idUsuario; set => idUsuario = value; }
    }
}
