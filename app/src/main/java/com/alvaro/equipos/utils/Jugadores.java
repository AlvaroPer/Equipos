package com.alvaro.equipos.utils;

public class Jugadores {
    String nombre;
    boolean estrella;
    String posicion;

    public Jugadores(String nombre, String posicion, boolean estrella) {
        this.nombre = nombre;
        this.estrella = estrella;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }
}
