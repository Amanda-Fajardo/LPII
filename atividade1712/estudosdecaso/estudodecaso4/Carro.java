package atividade1712.estudosdecaso.estudodecaso4;

public class Carro extends Transporte{
    String combustivel;
    
    public Carro(int capacidade, String combustivel){
        super(capacidade);
        this.combustivel = combustivel;
    }

    protected void mostrarDetalhes(){
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Combustível: " + this.combustivel);
    }
}