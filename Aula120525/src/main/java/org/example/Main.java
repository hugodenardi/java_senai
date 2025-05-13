package org.example;

public class Main {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel("azul", "fusca", 10);
        automovel1.Acelerar();
        automovel1.Acelerar();
        automovel1.Acelerar();
        automovel1.Frear();

        Automovel automovel2 = new Automovel("dourado", "chevette", 80);
        automovel2.Acelerar();
        automovel2.Frear();

        Carro carro1 = new Carro("preto","gol",50,false);
        carro1.Acelerar();
        carro1.Frear();
        carro1.verificarAirbag();

        Moto moto1 = new Moto("branca","Hornet", 80);
        moto1.Acelerar();

        Automovel teste = new Carro("preto","gol",50,false);
    }
}