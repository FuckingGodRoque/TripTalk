﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TripTalk.Clases
{
    public class Usuario
    {
        int id_Usuario;
        String nombre;
        String apellido;
        String user;
        String password;
        String correo;
        char rol;
        public Usuario(){

        }

        public Usuario(int id_Usuario, string nombre,string apellido, string user, string password, string correo, char rol)
        {
            this.id_Usuario = id_Usuario;
            this.nombre = nombre;
            this.apellido = apellido;
            this.user = user;
            this.password = password;
            this.correo = correo;
            this.rol = rol;
        }

        public int Id_Usuario { get => id_Usuario; set => id_Usuario = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellido { get => apellido; set => apellido = value; }
        public string User { get => user; set => user = value; }
        public string Password { get => password; set => password = value; }
        public string Correo { get => correo; set => correo = value; }
        public char Rol { get => rol; set => rol = value; }

        public override string ToString()
        {
            return "Usuario{" + "id_Usuario=" + id_Usuario + ", nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", rol=" + rol + '}';
        }
    }
}
