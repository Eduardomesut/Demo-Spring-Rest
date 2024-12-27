package com.example.demo.models;

public class Camper {
    private String nombre;
    public Camper(String nombre){
        this.nombre = nombre;
    }
    public Camper(){

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
