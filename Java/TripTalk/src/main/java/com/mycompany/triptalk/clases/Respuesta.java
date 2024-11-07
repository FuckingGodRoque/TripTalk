
package com.mycompany.triptalk.clases;

public class Respuesta {
    private int idRespuesta;
    private int idPregunta;
    private String respuesta;
    private int idUsuario;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, int idPregunta, String respuesta, int idUsuario) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}
