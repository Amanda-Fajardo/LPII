package aula1712.acervo;

public class Publicacao{
    //atributos
    private String titulo, autor, genero, editora;
    private int anoPublicacao, qntDisponivel;

    
public Publicacao() {
    //construtor
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.genero = genero;
    this.editora = editora;
    this.qntDisponivel = qntDisponivel;
    }

//getters

public String getTitulo() {
    return this.titulo;
}

public String getAutor() {
    return this.autor;
}

public String getGenero() {
    return this.genero;
}

public String getEditora() {
    return this.editora;
}

public int getAnoPublicacao() {
    return this.anoPublicacao;
}

public int getQntDisponivel() {
    return this.qntDisponivel;
}

protected void imprimirDados(){
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Gênero: " + this.genero);
    System.out.println("Editora: " + this.editora);
    System.out.println("Ano de publicação: " + this.anoPublicacao);
    System.out.println("Quantidade disponível: " + this.qntDisponivel);
}

}
