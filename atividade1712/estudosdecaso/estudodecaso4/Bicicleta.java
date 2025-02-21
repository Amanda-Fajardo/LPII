package atividade1712.estudosdecaso.estudodecaso4;

public class Bicicleta extends Transporte{
    int marcha;

    public Bicicleta(int capacidade, int marcha){
        super(capacidade);
        this.marcha = marcha;
    }

    protected void mostrarDetalhes(){
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Marchas: " + this.marcha);
    }
}