
package com.mycompany.triptalk.clases;

public class ViajeInteres {
    private int idUsuario;
    private int idPublicacion;

    public ViajeInteres(int idUsuario, int idPublicacion) {
        this.idUsuario = idUsuario;
        this.idPublicacion = idPublicacion;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
