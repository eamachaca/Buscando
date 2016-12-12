package com.example.gabriel.buscando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddDesaparecidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_desaparecido);
        ArrayList<String> x=new ArrayList<>();
        x.add("Encontrado");
        x.add("Desaparecido");
        Spinner xSp= (Spinner) findViewById(R.id.spiADDesaparecido);
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, x);
        xSp.setAdapter(adapter);
    }
}
