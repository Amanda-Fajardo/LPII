package atividade1712.estudosdecaso.estudodecaso2;

public class DVD extends ItemBiblioteca {
    protected String duracao;

    public DVD(String titulo, int codigo, String duracao){
        super(titulo, codigo);
        this.duracao = duracao;
    }
    
    protected void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Duração: " + duracao);
    }
    
}