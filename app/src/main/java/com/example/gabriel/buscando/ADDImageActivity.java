package com.example.gabriel.buscando;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.gabriel.buscando.Adaptador.ListaImagenesAdapter;
import com.example.gabriel.buscando.Adaptador.ListaPersonaAdapter;

import java.io.File;

public class ADDImageActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ListaImagenesAdapter listaImagenesAdapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addimage);
        listaImagenesAdapter=new ListaImagenesAdapter(this);   /////

        recyclerView= (RecyclerView) findViewById(R.id.recAddImage);

        recyclerView.setAdapter(listaImagenesAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2 );
        recyclerView.setLayoutManager(layoutManager);
    }


    private void llamarintent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }


    public void AddImgFoto(View view) {
        llamarintent();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            listaImagenesAdapter.adicionarBitmap(imageBitmap);
        }
    }
}
