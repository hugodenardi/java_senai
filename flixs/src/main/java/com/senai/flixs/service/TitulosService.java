package com.senai.flixs.service;

import com.senai.flixs.model.Titulos;
import com.senai.flixs.repository.TitulosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class TitulosService {
    private final TitulosRepository titulosrepository;
    @Autowired
    public TitulosService(TitulosRepository titulosrepository) {
        this.titulosrepository = titulosrepository;
    }


    public Titulos salvarTitulo(Titulos titulo) {
        titulosrepository.save(titulo);
        return titulo;
    }

    public List<Titulos> buscarTitulos() {
        return titulosrepository.findAll();

    }
}
