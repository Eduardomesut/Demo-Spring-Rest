package com.example.demo.controllers;

import com.example.demo.models.Camper;
import com.example.demo.services.CamperService;
import jakarta.ws.rs.*;

import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class CamperController {
   
    private final CamperService camperService;

    public CamperController(CamperService camperService) {
        this.camperService = camperService;
        this.camperService.add(new Camper("Uno"));
        this.camperService.add(new Camper("Dos"));
        this.camperService.add(new Camper("Tres"));
        this.camperService.add(new Camper("Cuatro"));
        this.camperService.add(new Camper("Cinco"));
        this.camperService.add(new Camper("Seis"));

    }

    @GET
    @Path("/campers")
    @Produces("application/json")
    public List<Camper>listarTodos(){
        return camperService.getAll();
    }

    @POST
    @Path("/campers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterCamper(Camper camper){
        camperService.add(camper);
        return Response.created(
                URI.create("/campers/" + camper.getNombre())
        ).build();

    }

    @GET
    @Path("/campers/{nombre}")
    @Produces("application/json")
    public Camper listarUno(@PathParam("nombre") String nombre){
        return camperService.get(nombre);
    }
}
