package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class Datos extends RecyclerView.Adapter<Datos.ViewHolder> {

    LayoutInflater inflater = null;
    Context context;
    String[] elemento;
    int[] avatar;

    public Datos(Context context, String[] elemento, int[] avatar) {
        this.context = context;
        this.elemento = elemento;
        this.avatar = avatar;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public Datos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_fila, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Datos.ViewHolder holder, int position) {
        holder.elemento.setText(elemento[position]);
        holder.avatar.setImageResource(avatar[position]);
    }

    @Override
    public int getItemCount() {
        return elemento.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView elemento;
        ImageView avatar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            elemento = itemView.findViewById(R.id.titulo);
            avatar = itemView.findViewById(R.id.imagen);
        }
    }
}
