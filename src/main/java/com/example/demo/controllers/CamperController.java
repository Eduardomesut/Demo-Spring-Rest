package com.example.demo.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class CamperController {
    @GET
    public String hola(){

        return "hola";
    }

}
