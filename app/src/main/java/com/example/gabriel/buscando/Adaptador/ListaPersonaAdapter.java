package com.example.gabriel.buscando.Adaptador;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.example.gabriel.buscando.Clases.extraviado;
import com.example.gabriel.buscando.R;

import java.util.ArrayList;


/**
 * Created by GABRIEL on 10/12/2016.
 */

public class ListaPersonaAdapter extends RecyclerView.Adapter<ListaPersonaAdapter.ViewHolder> {

    private ArrayList<extraviado> dataset;
    private Context context;



    public ListaPersonaAdapter()
    {
        dataset=new ArrayList<>();
    }

    public ListaPersonaAdapter(Context context){
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        extraviado e= dataset.get(position);
        holder.nombreTextVie.setText(e.getDescripcion());


        Glide.with(context)
                .load(dataset.get(position).getImagenes().get(0))
                .into(holder.fotoImageVie);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona,parent,false);
        return new ViewHolder(view);
    }

    public void adicionarExtraviado(extraviado post) {
        dataset.add(post);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView fotoImageVie;
        private TextView nombreTextVie;

        public ViewHolder(View itemView){
            super(itemView);

            fotoImageVie = (ImageView) itemView.findViewById(R.id.fotoImageView);
            nombreTextVie = (TextView) itemView.findViewById(R.id.nombreTexView);
        }


    }


}
