package com.example.demo.service;

import com.example.demo.models.Plato;
import com.example.demo.repository.PlatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlatosService {

    private PlatoRepository platoRepository;
    public List<Plato> getAllPlatos() {
        return platoRepository.findAll();
    }
}
