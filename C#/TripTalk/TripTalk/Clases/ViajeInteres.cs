using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{

        public class ViajeInteres
        {
            int idUsuario;
            int idPublicacion;

            public ViajeInteres()
            {
            }

            public ViajeInteres(int idUsuario, int idPublicacion)
            {
                this.idUsuario = idUsuario;
                this.idPublicacion = idPublicacion;
            }

            [JsonProperty("idUsuario")]
            public int IdUsuario
            {
                get => idUsuario;
                set => idUsuario = value;
            }

            [JsonProperty("idPublicacion")]
            public int IdPublicacion
            {
                get => idPublicacion;
                set => idPublicacion = value;
            }

            public override string ToString()
            {
                return "ViajeInteres{" + "idUsuario=" + idUsuario + ", idPublicacion=" + idPublicacion + '}';
            }
        }
    }


