package atividade1712.estudosdecaso.estudodecaso4;

public class Transporte {
    protected int capacidade;

    public Transporte(int capacidade){
    this.capacidade = capacidade;
    }

    protected void mostrarDetalhes(){
    System.out.println("Capacidade: " + this.capacidade);
    }
}