package com.example.demo.Plato;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoController {

    private final PlatoRepository platoRepository;
    public PlatoController(PlatoRepository platoRepository){
        this.platoRepository = platoRepository;
    }

    @GetMapping("/api/mostrar-platos")
    List<Plato> findAll(){
        return platoRepository.findAll();
    }

}
