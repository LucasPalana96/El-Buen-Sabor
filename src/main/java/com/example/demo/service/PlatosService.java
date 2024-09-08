package com.example.demo.service;

import com.example.demo.DTO.request.PlatoRequestDTO;
import com.example.demo.models.Plato;
import com.example.demo.models.PlatoJpa;
import com.example.demo.models.enums.Tipo;
import com.example.demo.repository.PlatoJpaRepository;
import com.example.demo.repository.PlatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
@Service
public class PlatosService {

    private  PlatoRepository platoRepository;

    public PlatosService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    //JPA repository
    @Autowired
    private PlatoJpaRepository platoJpaRepository;

    public List<Plato> getAllPlatos() {
       return platoRepository.findAll();
    }

    public String addPlatos(PlatoRequestDTO platoDTO) {

        PlatoJpa plato = PlatoJpa.builder()
                .name(platoDTO.name())
                .description(platoDTO.description())
                .price(platoDTO.price())
                .type(Tipo.BEBIDA)
                .stock(platoDTO.stock())
                .avaliable(true)
                .build();
        // Here we save in dataBase
       platoJpaRepository.save(plato);
        return "Plato agregado";
    }
}
