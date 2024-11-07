using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Usuario
    {
        int idUsuario;
        String nombre;
        String apellido;
        String password;
        String correo;
        String rol;
        public Usuario(){

        }

        public Usuario(int idUsuario, string nombre,string apellido, string correo, string password)
        {
            this.idUsuario = idUsuario;
            this.nombre = nombre;
            this.apellido = apellido;
            this.password = password;
            this.correo = correo;
            rol = "npc";
        }

        public int IdUsuario { get => idUsuario; set => idUsuario = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellido { get => apellido; set => apellido = value; }
        public string Password { get => password; set => password = value; }
        public string Correo { get => correo; set => correo = value; }
        public string Rol { get => rol; set => rol = value; }

        public override string ToString()
        {
            return "Usuario{" + "id_Usuario=" + idUsuario + ", nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", rol=" + rol + '}';
        }
    }
}
