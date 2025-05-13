package org.example;

public class Automovel {

    private String cor;

    private String modelo;

    private int velocidade;

    public Automovel(String cor, String modelo, int velocidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void Acelerar() {
        if (this.velocidade < 100) {
            this.velocidade += 10;
        } else {
            System.out.println("Está no limite máximo");
        }
        System.out.println("Acelerando nosso " + modelo + " " + cor + " e estamos a " + velocidade);

    }


    public void Frear() {
        System.out.println("Freando o " + modelo + " " + cor);
    }

    public String getModelo(){
    return this.modelo;
    }

}
