package com.example.gabriel.buscando;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    private EditText usuario,contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario= (EditText) findViewById(R.id.txtlogusuario);
        contraseña= (EditText) findViewById(R.id.txtlogcontra);
    }

    public Context retornar(){
        return this.getApplicationContext();


    }

    public void clic(View view) {

        DatabaseReference ref= FirebaseDatabase.getInstance().getReference();
        DatabaseReference mensajeRef = ref.child("Usuario");


        mensajeRef = mensajeRef.child(usuario.getText().toString());

        mensajeRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String x= dataSnapshot.child("contraseña").getValue(String.class) ;
                if (x.compareTo( contraseña.getText().toString())==0){
                    Toast.makeText(getApplicationContext(),"ingreso correcto",Toast.LENGTH_SHORT).show();
                   // Intent z = new Intent(retornar(),InicioActivity.class);
                   //startActivity(z);

                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void clicR(View view) {
        Intent z = new Intent(retornar(),RegistroActivity.class);
        startActivity(z);
    }
}
