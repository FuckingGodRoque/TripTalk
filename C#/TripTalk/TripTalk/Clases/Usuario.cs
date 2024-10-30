using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Usuario
    {
        String nombre;
        String password;
        String correo;
        char rol;
        public Usuario(){

        }
        public Usuario(String nombre, String password, String correo, char rol)
        {
            this.nombre = nombre;
            this.password = password;
            this.correo = correo;
            this.rol = rol;
        }

        public String Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public String Password
        {
            get { return password; }
            set { password = value; }
        }

        public String Correo
        {
            get { return correo; }
            set { correo = value; }
        }

        public char Rol
        {
            get { return rol; }
            set { rol = value; }
        }

        public override string ToString()
        {
            return "Nombre: " + nombre + " Password: " + password + " Correo: " + correo + " Rol: " + rol;
        }

    }
}
