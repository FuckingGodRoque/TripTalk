
package com.mycompany.triptalk.clases;

public class Pregunta {
    private int idPregunta;
    private int idPublicacion;
    private String pregunta;
    private int idUsuario;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, int idPublicacion, String pregunta, int idUsuario) {
        this.idPregunta = idPregunta;
        this.idPublicacion = idPublicacion;
        this.pregunta = pregunta;
        this.idUsuario = idUsuario;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
  
}
