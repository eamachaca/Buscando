package com.example.gabriel.buscando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.gabriel.buscando.Clases.persona;
import com.example.gabriel.buscando.Clases.usuarios;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class RegistroActivity extends AppCompatActivity {
    private EditText ci,nombre,apellido,fechanac,sexo,email,usuario,contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro);
            ci= (EditText) findViewById(R.id.txt_ci);
            nombre= (EditText) findViewById(R.id.txtnombre);
            apellido= (EditText) findViewById(R.id.txtapellido);
            fechanac= (EditText) findViewById(R.id.txtfechanac);
            sexo = (EditText) findViewById(R.id.txtsexo);
            email = (EditText) findViewById(R.id.txtemail);
            usuario= (EditText) findViewById(R.id.txtusuario);
            contraseña= (EditText) findViewById(R.id.txtcontraseña);



    }

    public void registrar(View view) {

        DatabaseReference ref= FirebaseDatabase.getInstance().getReference();
        DatabaseReference mensajeRef = ref.child("Usuario");
        DatabaseReference mensajeRef1 = ref.child("Personas");

        mensajeRef = mensajeRef.child(ci.getText().toString());

        usuarios usuarion = new usuarios();
        usuarion.setNombre_usuario(nombre.getText().toString());
        usuarion.setEmail(email.getText().toString());
        usuarion.setContraseña(contraseña.getText().toString());
        //Map<String,usuarios> gabriel= new HashMap<String, usuarios>();
        //gabriel.put(ci.getText().toString(),usuarion);

        mensajeRef1 = mensajeRef1.push();
        usuarion.setPersona(mensajeRef1.getKey());
        persona p = new persona();
        p.setNombre(nombre.getText().toString());
        p.setApellidos(apellido.getText().toString());
        p.setFechanac(fechanac.getText().toString());
        p.setSexo(sexo.getText().toString());


        mensajeRef.setValue(usuarion);
        mensajeRef1.setValue(p);
        //mensajeRef.



    }
}
