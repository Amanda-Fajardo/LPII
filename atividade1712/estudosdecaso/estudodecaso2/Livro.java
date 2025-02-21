package atividade1712.estudosdecaso.estudodecaso2;

public class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;  
    
    public Livro(String titulo, int codigo, String autor, int numeroPaginas) {
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }  
            
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}