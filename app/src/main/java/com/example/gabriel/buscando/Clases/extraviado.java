package com.example.gabriel.buscando.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by GABRIEL on 10/12/2016.
 */

public class extraviado implements Serializable{
    private String  key,Direccion,Descripcion,Encontrado,Fecha_Ex;
    private ArrayList<Integer> Telefonos=new ArrayList();
    private ArrayList<String> imagenes=new ArrayList<>();



    public extraviado(){

    }

    public String getFecha_Ex() {
        return Fecha_Ex;
    }

    public void setFecha_Ex(String fecha_Ex) {
        Fecha_Ex = fecha_Ex;
    }

    public ArrayList<Integer> getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        Telefonos = telefonos;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEncontrado() {
        return Encontrado;
    }

    public void setEncontrado(String encontrado) {
        Encontrado = encontrado;
    }


}
