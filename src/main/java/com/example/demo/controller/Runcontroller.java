package com.example.demo.controller;


import com.example.demo.DTO.request.PlatoRequestDTO;
import com.example.demo.service.PlatosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.example.demo.models.Plato;
import java.util.List;

@RestController
@AllArgsConstructor //With Lombok
public class Runcontroller {

    private final PlatosService platosService;

    /*
        ** Without lombok **
    public Runcontroller(PlatosService platosServices){
            this.platosService = platosServices;
    }
    */

    @PostMapping("/add")
    public ResponseEntity<String> addPlatos(@RequestBody PlatoRequestDTO platoDTO){
        
        return ResponseEntity.ok(platosService.addPlatos(platoDTO));
    }

   // @GetMapping("/getPlatos")
   // List<Plato> findAll(){
       // return platosService.getAllPlatos();
   // }

}
