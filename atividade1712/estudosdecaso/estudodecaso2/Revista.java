package atividade1712.estudosdecaso.estudodecaso2;

public class Revista extends ItemBiblioteca {
    protected int edicao;

    public Revista(String titulo, int codigo, int edicao) {
        super(titulo, codigo);
        this.edicao = edicao;
    }
    
    protected void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Edição: " + edicao);
    }
}