package com.alvaro.equipos.utils;

import java.io.Serializable;

public class Equipos implements Serializable {
    String nombreEquipo;
    int foto_escudo;

    public Equipos(String nombreEquipo, int foto_escudo) {
        this.nombreEquipo = nombreEquipo;
        this.foto_escudo = foto_escudo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getFoto_escudo() {
        return foto_escudo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setFoto_escudo(int foto_escudo) {
        this.foto_escudo = foto_escudo;
    }
}
