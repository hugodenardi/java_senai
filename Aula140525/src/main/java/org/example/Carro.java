package org.example;

public class Carro extends Automovel {

    private boolean airbag;

    public Carro(String cor, String modelo, int velocidade,  boolean airbag) {
        super(cor, modelo, velocidade);
        this.airbag = airbag;
    }

    public void verificarAirbag () {
        if (this.airbag) {
            System.out.println("Tem airbag");
        }
        else {
            System.out.println("Não tem airbag");
        }

    }


    @Override
    public void acelerar() throws Exception {
        aumentarVelocidade(10);
        System.out.println("Estou pisando fundo no meu " + getModelo() + " e estou a " + getVelocidade());
    }

}
