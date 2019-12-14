package com.alvaro.equipos.utils;

import com.alvaro.equipos.R;

import java.util.ArrayList;

public class DataSet {

    public static DataSet newInstance(){

        DataSet dataSet = new DataSet();
        return dataSet;
    }

    public ArrayList listaEquiposLiga(){

        ArrayList<Equipos> lista = new ArrayList<>();

        lista.add(new Equipos("FC.Barcelona", R.drawable.barsa));
        lista.add(new Equipos("Real Madrid", R.drawable.madrid));
        lista.add(new Equipos("Atletico de Madrid", R.drawable.atletico));
        lista.add(new Equipos("Valencia", R.drawable.valencia));
        lista.add(new Equipos("Sevilla", R.drawable.sevilla));
        lista.add(new Equipos("Getafe", R.drawable.getafe));
        lista.add(new Equipos("Leganes", R.drawable.leganes));
        return lista;
    }

    public ArrayList listaEquiposPremier(){

        ArrayList<Equipos> lista = new ArrayList<>();

        lista.add(new Equipos("M. City", R.drawable.city));
        lista.add(new Equipos("Liverpool", R.drawable.liverpool));
        lista.add(new Equipos("Manchester United", R.drawable.manchester));
        lista.add(new Equipos("Everton", R.drawable.everton));
        lista.add(new Equipos("Leicester", R.drawable.leices));
        lista.add(new Equipos("Chelsea", R.drawable.chelsea));
        return lista;
    }

    public ArrayList listaEquiposItalia(){

        ArrayList<Equipos> lista = new ArrayList<>();

        lista.add(new Equipos("Juventus", R.drawable.juventus));
        lista.add(new Equipos("Milan", R.drawable.milan));
        lista.add(new Equipos("Inter", R.drawable.inter));
        return lista;
    }

    public ArrayList listaLigasTotal(){

        ArrayList<Ligas> lista = new ArrayList<>();

        lista.add(new Ligas("LaLigaBBVA",R.drawable.laliga,listaEquiposLiga()));
        lista.add(new Ligas("Premiere League",R.drawable.premiere,listaEquiposPremier()));
        lista.add(new Ligas("Calcio",R.drawable.calcio,listaEquiposItalia()));
        return lista;
    }

    public ArrayList jugadoresBarsa(){
        ArrayList<Jugadores> lista = new ArrayList<>();
        lista.add(new Jugadores("Leo Messi","delantero", true));
        lista.add(new Jugadores("Luis Suarez","delantero", true));
        lista.add(new Jugadores("Ousman Dembelé","delantero", false));
        lista.add(new Jugadores("Antoine Griezman","delantero", true));
        lista.add(new Jugadores("Sergio Busquets","centroCampista", false));
        lista.add(new Jugadores("Ivan Rakitic","centroCampista", true));
        lista.add(new Jugadores("Arturo Vidal","centroCampista", false));
        lista.add(new Jugadores("Artur Melo","centroCampista", true));
        lista.add(new Jugadores("Frankie DeJong","centroCampista", true));
        lista.add(new Jugadores("Gerard Pique","defensa", true));
        lista.add(new Jugadores("Clement Lenglet","defensa", true));
        return lista;
    }
}
