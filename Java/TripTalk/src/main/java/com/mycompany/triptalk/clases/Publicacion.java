
package com.mycompany.triptalk.clases;

public class Publicacion {
    private int idPublicacion;
    private int idUsuario; //el que publica
    private String lugar;
    private String presupuesto; //es lo mismo que costo para el viaje
    private String obstaculos;
    private String detalles; //detalles del lugar para el viaje
    private String lugarRecomendado1;
    private String lugarRecomendado2;
    private String lugarRecomendado3;
    private String equipaje;
    private String fechasRecomendadas;
    private String tipo; //Opinion o viaje (viaje ofrecido)

    public Publicacion() {
    }
    
    //para opiniones
    public Publicacion(int idPublicacion,int idUsuario,String lugar, String presupuesto, String obstaculos, String lugarrecomendado1, String lugarrecomendado2, String lugarrecomendado3, String equipaje, String fechasRecomendadas, String tipo) {
        this.idPublicacion = idPublicacion;
        this.idUsuario = idUsuario;
        this.lugar = lugar;
        this.presupuesto = presupuesto;
        this.obstaculos = obstaculos;
        this.lugarRecomendado1 = lugarrecomendado1;
        this.lugarRecomendado2 = lugarrecomendado2;
        this.lugarRecomendado3 = lugarrecomendado3;
        this.equipaje = equipaje;
        this.fechasRecomendadas = fechasRecomendadas;
        this.tipo = tipo;
    }

    //para ofrecer viajes
    public Publicacion(int idPublicacion, int idUsuario, String lugar, String presupuesto, String detalles, String tipo) {
        this.idPublicacion = idPublicacion;
        this.idUsuario = idUsuario;
        this.lugar = lugar;
        this.presupuesto = presupuesto;
        this.detalles = detalles;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getObstaculos() {
        return obstaculos;
    }

    public void setObstaculos(String obstaculos) {
        this.obstaculos = obstaculos;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(String equipaje) {
        this.equipaje = equipaje;
    }

    public String getFechasRecomendadas() {
        return fechasRecomendadas;
    }

    public void setFechasRecomendadas(String fechasRecomendadas) {
        this.fechasRecomendadas = fechasRecomendadas;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugarRecomendado1() {
        return lugarRecomendado1;
    }

    public void setLugarRecomendado1(String lugarRecomendado1) {
        this.lugarRecomendado1 = lugarRecomendado1;
    }

    public String getLugarRecomendado2() {
        return lugarRecomendado2;
    }

    public void setLugarRecomendado2(String lugarRecomendado2) {
        this.lugarRecomendado2 = lugarRecomendado2;
    }

    public String getLugarRecomendado3() {
        return lugarRecomendado3;
    }

    public void setLugarRecomendado3(String lugarRecomendado3) {
        this.lugarRecomendado3 = lugarRecomendado3;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
