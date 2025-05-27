package com.senai.flixs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Titulos {
    private String nome;
    private String genero;
    @Enumerated(EnumType.STRING)
    private TipoTitulo tipo;
    private int anoLancamento;
    private boolean jaAssistiu;
    private double avaliacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulo tipo) {
        this.tipo = tipo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isJaAssistiu() {
        return jaAssistiu;
    }

    public void setJaAssistiu(boolean jaAssistiu) {
        this.jaAssistiu = jaAssistiu;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
