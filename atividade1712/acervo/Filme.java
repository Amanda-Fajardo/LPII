package atividade1712.acervo;

public class Filme extends Publicacao{
    private String diretor, atorPrincipal, sinopse, tempoDuracao;
    
    public Filme(String titulo, String autor, String genero, String editora, int anoPublicacao, int quantDisponivel, 
    String diretor, String atorPrincipal, String sinopse, String tempoDuracao){
        super(String titulo, String autor, String genero, String editora, int anoPublicacao, int quantDisponivel);
        this.diretor = this.diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    protected void imprimirDados(){
        super.imprimirDados();
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ator Principal: " + this.atorPrincipal);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Tempo de duração: " + this.tempoDuracao);
    }
}
