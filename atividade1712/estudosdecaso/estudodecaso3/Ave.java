package atividade1712.estudosdecaso.estudodecaso3;

public class Ave extends Animal{
    private String tipo;

    public Ave(String nome, int idade, String tipo){
        super(nome, idade);
        this.tipo = tipo;
    }
    
    protected void emitirSom(){
        System.out.println("Canto");
    }
}

