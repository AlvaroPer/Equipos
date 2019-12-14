package com.alvaro.equipos.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alvaro.equipos.LigasActivity;
import com.alvaro.equipos.R;
import com.alvaro.equipos.utils.Equipos;

import java.util.ArrayList;

public class AdaptadorEquipos extends RecyclerView.Adapter<AdaptadorEquipos.HolderAdapterEquipos> {

    Context contexto;
    ArrayList<Equipos> listaEquipos;
    OnMiRecyclerListener listener;

    public AdaptadorEquipos(LigasActivity equipos, ArrayList<Equipos> listaEquipos) {
        this.contexto = equipos;
        this.listaEquipos = listaEquipos;
        listener = (OnMiRecyclerListener) contexto;
    }

    @NonNull
    @Override
    public HolderAdapterEquipos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.recycler_equipos, parent,false);
        HolderAdapterEquipos miHolder = new HolderAdapterEquipos(view);
        return miHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderAdapterEquipos holder, int position) {
        final Equipos actual = listaEquipos.get(position);

        holder.getNombre_equipo().setText(actual.getNombreEquipo());
        holder.getFoto_escudo().setImageResource(actual.getFoto_escudo() );
        holder.getNombre_equipo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(actual);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    class HolderAdapterEquipos extends RecyclerView.ViewHolder {
        private ImageView foto_escudo;
        private TextView nombre_equipo;

        public HolderAdapterEquipos(@NonNull View itemView) {
            super(itemView);
            foto_escudo = itemView.findViewById(R.id.foto_equipo);
            nombre_equipo = itemView.findViewById(R.id.nombre_equipo);
        }

        public ImageView getFoto_escudo() {
            return foto_escudo;
        }

        public TextView getNombre_equipo() {
            return nombre_equipo;
        }
    }
    public interface OnMiRecyclerListener {
        void onMiRecycler(Equipos equipos);
    }
}
