package com.senai.flixs.service;

import com.senai.flixs.model.Titulos;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class TitulosService {
    private final HashSet hashTitulos = new HashSet<Titulos>();
    public Titulos salvarTitulo(Titulos titulos){
        hashTitulos.add(titulos);
        return titulos;
    }

    public List<Titulos> buscarTitulos(){
        return hashTitulos.stream().toList();
    }

}
