package com.example.demo.controller;

import com.example.demo.repository.PlatoRepository;
import com.example.demo.service.PlatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.example.demo.models.Plato;
import java.util.List;

@RestController
public class Runcontroller {

    private final PlatosService platosService;
    public Runcontroller(PlatosService platosServices){
        this.platosService = platosServices;
    }

    @GetMapping("/api/platos")
    List<Plato> findAll(){
        return platosService.getAllPlatos();
    }

}
