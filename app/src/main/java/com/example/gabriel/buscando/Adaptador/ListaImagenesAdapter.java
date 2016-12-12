package com.example.gabriel.buscando.Adaptador;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gabriel.buscando.Clases.extraviado;
import com.example.gabriel.buscando.R;

import java.util.ArrayList;

/**
 * Created by i7 on 12-12-16.
 */

public class ListaImagenesAdapter extends RecyclerView.Adapter<ListaImagenesAdapter.ViewHolder> {

    private ArrayList<Bitmap> dataset;
    private Context context;



    public ListaImagenesAdapter()
    {
        dataset=new ArrayList<>();
    }

    public ListaImagenesAdapter(Context context){
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public void onBindViewHolder(ListaImagenesAdapter.ViewHolder holder, int position) {
        holder.fotoImageVie.setImageBitmap(dataset.get(position));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    @Override
    public ListaImagenesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image,parent,false);
        return new ListaImagenesAdapter.ViewHolder(view);
    }

    public void adicionarBitmap(Bitmap post) {
        dataset.add(post);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView fotoImageVie;

        public ViewHolder(View itemView){
            super(itemView);

            fotoImageVie = (ImageView) itemView.findViewById(R.id.addIMimg);
        }


    }


}
