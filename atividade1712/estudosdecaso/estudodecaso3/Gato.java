package atividade1712.estudosdecaso.estudodecaso3;

public class Gato extends Animal{
    private String pelagem;

    public Gato(String nome, int idade, String pelagem){
        super(nome, idade);
        this.pelagem = pelagem;
    }

    protected void emitirSom(){
        System.out.println("Miau");
    } 
}

