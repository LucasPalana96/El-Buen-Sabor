package com.example.demo.Plato;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Runcontroller {

    private final PlatoRepository platoRepository;
    public Runcontroller(PlatoRepository platoRepository){
        this.platoRepository = platoRepository;
    }

    @GetMapping("/api/platos")
    List<Plato> findAll(){
        return platoRepository.findAll();
    }

}
