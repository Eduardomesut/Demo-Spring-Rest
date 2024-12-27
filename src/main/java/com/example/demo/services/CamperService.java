package com.example.demo.services;

import com.example.demo.models.Camper;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CamperService {
    private List<Camper> campers = new ArrayList<>();

    public List<Camper>getAll(){
        return campers;
    }
    public void add(Camper camper){
        campers.add(camper);
    }
}
