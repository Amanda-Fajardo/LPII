package atividade1712.estudosdecaso.estudodecaso4;

public class Onibus extends Transporte{
    int linha;
}

public Onibus(int capacidade, int linha){
    super(capacidade);
    this.linha = linha;
}

protected void mostrarDetalhes(){
    System.out.println("Capacidade: " + this.capacidade);
    System.out.println("Linha: " + this.linha);
}