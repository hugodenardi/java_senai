package org.example;

public class Moto extends Automovel {


    public Moto(String cor, String modelo, int velocidade) {
        super(cor, modelo, velocidade);
    }


    public void empinar() {
        System.out.println("Empinando a moto " + getModelo());
    }

    @Override
    public void acelerar() throws Exception {
            aumentarVelocidade(10);
        System.out.println("Estou pisando fundo no meu " + getModelo());
    }
}
