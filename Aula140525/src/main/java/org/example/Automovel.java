package org.example;

public abstract class Automovel {

    private String cor;

    private String modelo;

    private int velocidade;

    public Automovel(String cor, String modelo, int velocidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar() throws Exception  {
        if (this.velocidade < 100) {
            this.velocidade += 10;
        } else {
            throw new Exception("Não posso mais acelerar");
        }
        System.out.println("Acelerando nosso " + modelo + " " + cor + " e estamos a " + velocidade);

    }


    public void frear() {
        System.out.println("Freando o " + modelo + " " + cor);
    }

    public String getModelo(){
    return this.modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void aumentarVelocidade(int velocidade) throws Exception {
        if (this.velocidade < 130) {
            this.velocidade += 15;
        } else {
            throw new Exception("Não posso mais acelerar");
        }
    }
}
