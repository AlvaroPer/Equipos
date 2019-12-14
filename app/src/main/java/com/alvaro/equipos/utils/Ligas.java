package com.alvaro.equipos.utils;

import java.util.ArrayList;

public class Ligas {
    String nombreLiga;
    int fotoLiga;
    ArrayList ligasEquipos;

    public Ligas(String nombreLiga, int fotoLiga, ArrayList ligasEquipos) {
        this.nombreLiga = nombreLiga;
        this.fotoLiga = fotoLiga;
        this.ligasEquipos = ligasEquipos;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public int getFoto_liga() {
        return fotoLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public void setFotoLiga(int fotoLiga) {
        this.fotoLiga = fotoLiga;
    }

    public ArrayList getLigasEquipos() {
        return ligasEquipos;
    }

    public void setLigasEquipos(ArrayList ligasEquipos) {
        this.ligasEquipos = ligasEquipos;
    }
}
