package com.alvaro.equipos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alvaro.equipos.adaptadores.AdaptadorJugadores;
import com.alvaro.equipos.utils.DataSet;
import com.alvaro.equipos.utils.Jugadores;

import java.util.ArrayList;

public class EquipoActivity extends AppCompatActivity {

    AdaptadorJugadores adaptadorJugadores;
    RecyclerView recyclerJugadores;
    ArrayList<Jugadores> listaJugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);
        instancias();
    }

    private void instancias() {
        listaJugadores = new ArrayList();
        recyclerJugadores = findViewById(R.id.recycler_plantilla);
        listaJugadores = DataSet.newInstance().jugadoresBarsa();
        adaptadorJugadores = new AdaptadorJugadores(this,listaJugadores);
        recyclerJugadores.setAdapter(adaptadorJugadores);
        adaptadorJugadores.notifyDataSetChanged();
        recyclerJugadores.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }
}
