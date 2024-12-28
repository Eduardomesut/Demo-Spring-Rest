package com.example.demo.services;

import com.example.demo.models.Camper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CamperService {
    private final List<Camper> campers = new ArrayList<>();

    public Camper get(String nombre){

        for (Camper camper:campers) {
            if (camper.getNombre().equalsIgnoreCase(nombre)){
                return camper;
            }
        }
        return null;
    }

    public List<Camper>getAll(){
        return campers;
    }
    public void add(Camper camper){
        campers.add(camper);
    }
}
