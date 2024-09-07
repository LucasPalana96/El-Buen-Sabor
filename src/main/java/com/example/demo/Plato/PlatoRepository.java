package com.example.demo.Plato;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

@Repository
public class PlatoRepository {
    private List<Plato> platos = new ArrayList<Plato>();
    List<Plato> findAll(){
        return platos;
    }
    @PostConstruct
    public void init(){
        platos.add(new Plato("Empanada de Pollo"
            , "Docena de Empanadas de Pollo"
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Pizza Muzzarela"
            , "Pizza Muzzarella 8 Porciones"
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
    }
}
