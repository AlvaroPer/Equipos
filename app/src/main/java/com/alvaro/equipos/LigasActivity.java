package com.alvaro.equipos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.alvaro.equipos.adaptadores.AdaptadorEquipos;
import com.alvaro.equipos.adaptadores.AdaptadorJugadores;
import com.alvaro.equipos.adaptadores.AdaptadorLigas;
import com.alvaro.equipos.utils.DataSet;
import com.alvaro.equipos.utils.Equipos;
import com.alvaro.equipos.utils.Ligas;

import java.util.ArrayList;

public class LigasActivity extends AppCompatActivity implements AdaptadorLigas.OnMiRecyclerListener, AdaptadorEquipos.OnMiRecyclerListener, AdapterView.OnItemClickListener {

    RecyclerView recyclerEquipos;
    RecyclerView recyclerLigas;
    ArrayList<Ligas> listaLigas;
    ArrayList<Equipos> listaEquipos;
    AdaptadorLigas adaptadorLigas;
    AdaptadorEquipos adaptadorEquipos;
    final static String TAG_1= "Jugador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligas);
        instancias();
        rellenarRecyclerLigas();
        rellenarRecyclerEquipos();
    }

    private void rellenarRecyclerEquipos() {
        recyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
        recyclerEquipos.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void rellenarRecyclerLigas() {
        recyclerLigas.setAdapter(adaptadorLigas);
        adaptadorLigas.notifyDataSetChanged();
        recyclerLigas.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    }

    private void instancias() {
        recyclerEquipos = findViewById(R.id.recycler_equipos);
        recyclerLigas = findViewById(R.id.recycler_ligas);
        listaEquipos = DataSet.newInstance().listaEquiposLiga();
        listaLigas = DataSet.newInstance().listaLigasTotal();
        adaptadorLigas = new AdaptadorLigas(LigasActivity.this, listaLigas);
        adaptadorEquipos = new AdaptadorEquipos(LigasActivity.this, listaEquipos);
    }

    @Override
    public void onMiRecycler(Ligas ligas) {
        adaptadorEquipos = new AdaptadorEquipos(LigasActivity.this,ligas.getLigasEquipos());
        recyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();

    }

    @Override
    public void onMiRecycler(Equipos equipos) {
        Intent i = new Intent(getApplicationContext(),EquipoActivity.class);
        i.putExtra(TAG_1,equipos);
        startActivity(i);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
