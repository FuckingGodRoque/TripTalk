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
        private string fechaPublicacion;
        private string agencia;
        private int usuario_IdUsuario;

        public Publicacion() { }

        private Publicacion (int idPublicacion, string lugar, string presupuesto, string obstaculos, string equipaje, string fechasRecomendadas, string fechaPublicacion, string agencia, int usuario_IdUsuario)
        {
            this.idPublicacion = idPublicacion;
            this.lugar = lugar;
            this.presupuesto = presupuesto;
            this.obstaculos = obstaculos;
            this.equipaje = equipaje;
            this.fechasRecomendadas = fechasRecomendadas;
            this.fechaPublicacion = fechaPublicacion;
            this.agencia = agencia;
        }
        
        public int IdPublicacion { get => idPublicacion; set => idPublicacion = value; }
        public string Lugar { get => lugar; set => lugar = value; }
        public string Presupuesto { get => presupuesto; set => presupuesto = value; }

        public string Obstaculos { get => obstaculos; set => obstaculos = value; }

        public string Equipaje { get => equipaje; set => equipaje = value; }
        public string FechasRecomendadas { get => fechasRecomendadas; set=> fechasRecomendadas= value; }

        public string FechaPublicacion {  get => fechaPublicacion; set => fechaPublicacion= value; }
        public string Agencia { get => agencia; set => agencia = value; }

    }
}
