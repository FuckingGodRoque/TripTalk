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
        private string equipaje;
        private string fechasRecomendadas;
        private string tipo;
        private int usuario_IdUsuario;

        public Publicacion() { }


        public Publicacion(int idPublicacion, string lugar, string presupuesto, string obstaculos,
                           string equipaje, string fechasRecomendadas, string tipo, int usuario_IdUsuario)
        {
            this.idPublicacion = idPublicacion;
            this.lugar = lugar;
            this.presupuesto = presupuesto;
            this.obstaculos = obstaculos;
            this.equipaje = equipaje;
            this.fechasRecomendadas = fechasRecomendadas;
            this.tipo = tipo;
            this.usuario_IdUsuario = usuario_IdUsuario;
        }


        public int IdPublicacion
        {
            get => idPublicacion;
            set => idPublicacion = value;
        }

        public string Lugar
        {
            get => lugar;
            set => lugar = value;
        }

        public string Presupuesto
        {
            get => presupuesto;
            set => presupuesto = value;
        }

        public string Obstaculos
        {
            get => obstaculos;
            set => obstaculos = value;
        }

        public string Equipaje
        {
            get => equipaje;
            set => equipaje = value;
        }

        public string FechasRecomendadas
        {
            get => fechasRecomendadas;
            set => fechasRecomendadas = value;
        }

        public string Tipo
        {
            get => tipo;
            set => tipo = value;
        }

        public int Usuario_IdUsuario
        {
            get => usuario_IdUsuario;
            set => usuario_IdUsuario = value;
        }
    }

}
