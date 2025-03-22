import java.util.ArrayList;
import java.util.List;

public class Colecao {

    private List <Livro> livros = new ArrayList<Livro>();

    public void adicionarLivro(Livro livro){
        if(!livros.contains(livro)){
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("Livro já cadastrado!");
        }
    }

    public void removerLivro(Livro livro){
        livros.remove(livro);
        System.out.println("Livro removido com sucesso!");
    }

    public void imprimirLista(){
        if (livros.isEmpty()){
            System.out.println("Lista vazia!");
        } else {
            for (Livro livro : livros){
                System.out.println("ISBN: " + livro.getIsbn());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("---------------------------");
            }
        }
    }

    public boolean verificarLivro(Livro livro){
        return livros.contains(livro);
    }

    public void obterLivro(int isbn, String titulo){
        for (Livro livro : livros){
            if(livro.getIsbn() == isbn || livro.getTitulo() == titulo){
                System.out.println("Livro encontrado: " + livro.getTitulo());
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public boolean verificarListaVazia(){
        return livros.isEmpty();
    }

}   