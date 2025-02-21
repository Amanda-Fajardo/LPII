package atividade1712.estudosdecaso.estudodecaso3;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }
    
    protected void emitirSom(){
        System.out.println("Au au");
    }
}

