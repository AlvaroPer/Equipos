package com.alvaro.equipos.adaptadores;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.alvaro.equipos.R;
import com.alvaro.equipos.utils.Jugadores;

import java.util.ArrayList;

public class AdaptadorJugadores extends RecyclerView.Adapter<AdaptadorJugadores.HolderAdapter> {

    Context context;
    ArrayList<Jugadores> listaJugadores;

    public AdaptadorJugadores(Context context, ArrayList<Jugadores> listaJugadores) {
        this.context = context;
        this.listaJugadores = listaJugadores;
    }

    @NonNull
    @Override
    public HolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_jugadores,parent,false);
        return new HolderAdapter(view);
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull AdaptadorJugadores.HolderAdapter holder, int position) {
        final Jugadores actual = (listaJugadores.get(position));
        holder.getNombre_jugador().setText(actual.getNombre());
        if (actual.isEstrella()){
            holder.getEstrella_jugador().setVisibility(View.VISIBLE);
        } else {
            holder.getEstrella_jugador().setVisibility(View.INVISIBLE);
        }
        if (actual.getPosicion() == "delantero"){
            holder.getCardView().setCardBackgroundColor(R.color.colorDelantero);
        } else if (actual.getPosicion() == "defensa"){
            holder.getCardView().setCardBackgroundColor(R.color.colorDefensa);
        } else if (actual.getPosicion()=="centroCampista"){
            holder.getCardView().setCardBackgroundColor(R.color.colorCentroCampista);
        }
    }

    @Override
    public int getItemCount() {
        return listaJugadores.size();
    }

    class HolderAdapter extends RecyclerView.ViewHolder {
        private TextView nombre_jugador;
        private ImageView estrella_jugador;
        private CardView cardView;

        public HolderAdapter(@NonNull View itemView) {
            super(itemView);
            nombre_jugador = itemView.findViewById(R.id.nombre_jugador);
            estrella_jugador = itemView.findViewById(R.id.estrella_jugador);
            cardView = itemView.findViewById(R.id.card);
        }

        public CardView getCardView() {
            return cardView;
        }

        public TextView getNombre_jugador() {
            return nombre_jugador;
        }

        public ImageView getEstrella_jugador() {
            return estrella_jugador;
        }
    }
}
