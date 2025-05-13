package org.example;

public class Moto extends Automovel {


    public Moto(String cor, String modelo, int velocidade) {
        super(cor, modelo, velocidade);
    }

    @Override
    public void Acelerar() {
        System.out.println("Estou acelerando com a mão minha " + getModelo());
    }
}
