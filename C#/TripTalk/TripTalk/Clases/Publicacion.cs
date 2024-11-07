using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Publicacion
    {
        private int idPublicacion;
        private string lugar;
        private string presupuesto;
        private string obstaculos;
        private string lugarRecomendado1;
        private string lugarRecomendado2;
        private string lugarRecomendado3;
        private string detalles;
        private string equipaje;
        private string fechasRecomendadas;
        private string tipo;
        private int idUsuario;

        public Publicacion() { }

        public Publicacion(int idPublicacion, string lugar, string presupuesto, string obstaculos, string lugarRecomendado1, string lugarRecomendado2, string lugarRecomendado3,
                           string equipaje, string fechasRecomendadas, string tipo, int idUsuario)
        {
            this.idPublicacion = idPublicacion;
            this.lugar = lugar;
            this.presupuesto = presupuesto;
            this.obstaculos = obstaculos;
            this.lugarRecomendado1 = lugarRecomendado1;
            this.lugarRecomendado2 = lugarRecomendado2;
            this.lugarRecomendado3 = lugarRecomendado3;
            this.equipaje = equipaje;
            this.fechasRecomendadas = fechasRecomendadas;
            this.tipo = "opinion";
            this.idUsuario = idUsuario;
        }

        public Publicacion(int idPublicacion, string lugar, string presupuesto, string detalles, int idUsuario)
        {
            this.idPublicacion = idPublicacion;
            this.lugar = lugar;
            this.presupuesto = presupuesto;
            this.detalles = detalles;
            this.tipo = "viaje";
            this.idUsuario = idUsuario;
        }

        [JsonProperty("idPublicacion")]
        public int IdPublicacion
        {
            get => idPublicacion;
            set => idPublicacion = value;
        }

        [JsonProperty("lugar")]
        public string Lugar
        {
            get => lugar;
            set => lugar = value;
        }

        [JsonProperty("presupuesto")]
        public string Presupuesto
        {
            get => presupuesto;
            set => presupuesto = value;
        }

        [JsonProperty("detalles")]
        public string Detalles
        {
            get => detalles; // Cambiado para obtener el valor correcto
            set => detalles = value; // Cambiado para asignar el valor correcto
        }

        [JsonProperty("obstaculos")]
        public string Obstaculos
        {
            get => obstaculos;
            set => obstaculos = value;
        }

        [JsonProperty("equipaje")]
        public string Equipaje
        {
            get => equipaje;
            set => equipaje = value;
        }

        [JsonProperty("fechasRecomendadas")]
        public string FechasRecomendadas
        {
            get => fechasRecomendadas;
            set => fechasRecomendadas = value;
        }

        [JsonProperty("tipo")]
        public string Tipo
        {
            get => tipo;
            set => tipo = value;
        }

        [JsonProperty("idUsuario")]
        public int IdUsuario
        {
            get => idUsuario;
            set => idUsuario = value;
        }

        [JsonProperty("lugarRecomendado1")]
        public string LugarRecomendado1
        {
            get => lugarRecomendado1;
            set => lugarRecomendado1 = value;
        }

        [JsonProperty("lugarRecomendado2")]
        public string LugarRecomendado2
        {
            get => lugarRecomendado2;
            set => lugarRecomendado2 = value;
        }

        [JsonProperty("lugarRecomendado3")]
        public string LugarRecomendado3
        {
            get => lugarRecomendado3;
            set => lugarRecomendado3 = value;
        }
    }

}
