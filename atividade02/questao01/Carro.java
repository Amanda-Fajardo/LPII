package atividade2.questao01;

public class Carro{
    String modelo;
    double velocidade;
    double aceleracao;
    int marcha;
    boolean ligado;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha, boolean ligado){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = ligado;
    }

    public void ligar(){
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("Carro ligado");
    } else {
        System.out.println("Carro já está ligado");
    }
    }

    public void desligar(){
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Carro já está desligado");
        }
    }

    public void acelerar(){
        if(this.ligado == true){
            this.velocidade += this.aceleracao;
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            System.out.println("Carro desligado");
        }
    }

    public void desacelerar(){
        if(this.ligado == true){
            this.velocidade -= this.aceleracao;
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            System.out.println("Carro desligado");
        }
    }

    public void virarDireita(){
        System.out.println("Virando à direita");
    }

    public void virarEsquerda(){
        System.out.println("Virando à esquerda");
    }

    public void marchaCima(){
        if(this.marcha < 5){
            this.marcha++;
            System.out.println("Marcha atual: " + this.marcha);
        } else {
            System.out.println("Marcha máxima atingida");
        }
    }

    public void marchaBaixo(){
        if(this.marcha > 0){
            this.marcha--;
            System.out.println("Marcha atual: " + this.marcha);
        } else {
            System.out.println("Marcha mínima atingida");
        }
    }
}