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
import com.alvaro.equipos.utils.Ligas;

import java.util.ArrayList;

public class AdaptadorLigas extends RecyclerView.Adapter<AdaptadorLigas.HolderAdapterLigas> {

    Context contexto;
    ArrayList<Ligas> listaLigas;
    OnMiRecyclerListener listener;

    public AdaptadorLigas(LigasActivity ligas, ArrayList<Ligas> listaLigas) {
        this.contexto = ligas;
        this.listaLigas = listaLigas;
        listener = (OnMiRecyclerListener) contexto;
    }

    @NonNull
    @Override
    public HolderAdapterLigas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.recycler_ligas,parent,false);
        HolderAdapterLigas miHolder = new HolderAdapterLigas(view);
        return miHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderAdapterLigas holder, int position) {

        final Ligas actual = listaLigas.get(position);
        holder.getNombre_liga().setText(actual.getNombreLiga());
        holder.getFoto_liga().setImageResource(actual.getFoto_liga());
        holder.getNombre_liga().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onMiRecycler(actual);
            }
        });    }

    @Override
    public int getItemCount() {
        return listaLigas.size();
    }

     class HolderAdapterLigas extends RecyclerView.ViewHolder {

        private ImageView foto_liga;
        private TextView nombre_liga;

         public HolderAdapterLigas(@NonNull View itemView) {
             super(itemView);
             foto_liga = itemView.findViewById(R.id.foto_liga);
             nombre_liga = itemView.findViewById(R.id.nombre_liga);
         }

         public ImageView getFoto_liga() {
             return foto_liga;
         }

         public TextView getNombre_liga() {
             return nombre_liga;
         }
     }

    public interface OnMiRecyclerListener {
        void onMiRecycler(Ligas ligas);
    }
}
