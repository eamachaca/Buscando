package com.example.gabriel.buscando.Clases;

import java.io.Serializable;

/**
 * Created by GABRIEL on 9/12/2016.
 */

public class usuarios implements Serializable{
    private String Contraseña,Email, Nombre_usuario,Persona;

    public usuarios() {

    }


    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        Nombre_usuario = nombre_usuario;
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String persona) {
        Persona = persona;
    }
}
