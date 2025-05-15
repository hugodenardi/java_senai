package org.example;

public class Main {
    public static void main(String[] args) {
        Carro automovel1 = new Carro("azul", "fusca", 10, true);
        //automovel1.acelerar();
        try {
            automovel1.acelerar();
            automovel1.acelerar();
            automovel1.frear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Carro automovel2 = new Carro("dourado", "chevette", 80, true);
        //automovel2.acelerar();
        automovel2.frear();

        Carro carro1 = new Carro("preto","gol",50,false);
        //carro1.acelerar();
        carro1.frear();
        carro1.verificarAirbag();

        Moto moto1 = new Moto("branca","Hornet", 80);
        moto1.empinar();

        Carro teste = new Carro("preto","gol",50,false);

        Automovel[] salao = {automovel1, carro1, moto1};

        for (Automovel auto: salao) {
            try {
                auto.acelerar();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }



        }
        System.out.println("Tudo lindo");
    }
}