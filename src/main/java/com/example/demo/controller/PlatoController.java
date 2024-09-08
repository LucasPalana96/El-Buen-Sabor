package com.example.demo.controller;

import com.example.demo.DTO.request.PlatoRequestDTO;
import com.example.demo.models.Plato;
import com.example.demo.repository.PlatoRepository;
import com.example.demo.service.PlatosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor // with lombok
public class PlatoController {

    private final PlatosService platosService;
    // Without lombok
    /*
    public PlatoController(PlatosService platosService){
        this.platosService = platosService;
    }
    */
    @GetMapping("/api/mostrar-platos")
    List<Plato> findAll(){
        return platosService.getAllPlatos();
    }


    @PostMapping("/add")
    public ResponseEntity<String> addPlatos(@RequestBody PlatoRequestDTO platoDTO){

        return ResponseEntity.ok(platosService.addPlatos(platoDTO));
    }
}
