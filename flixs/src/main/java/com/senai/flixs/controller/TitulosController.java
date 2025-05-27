package com.senai.flixs.controller;

import com.senai.flixs.model.Titulos;
import com.senai.flixs.service.TitulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titulos")
public class TitulosController {
    @Autowired
    private final TitulosService titulosService;

    public TitulosController(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    @GetMapping
    public List<Titulos> buscarTitulos(){
        return titulosService.buscarTitulos();
    }


    @PostMapping
    public Titulos gravarTitulo(@RequestBody Titulos titulos) {
        return titulosService.salvarTitulo(titulos);
    }

    @PutMapping
    public String atualizarFilme() {
        return "Filme atualizado com sucesso";
    }

    @DeleteMapping
    public String deletarFilme() {
        return "Filme deletado com sucesso";
    }
}
