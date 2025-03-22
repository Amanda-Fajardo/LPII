public class Main{
    public static void main(String[] args) {
        Colecao c = new Colecao();
        c.adicionarLivro(new Livro (1234, "Sara J. Maas", "Galera Record", "Trono de Vidro"));
        c.adicionarLivro(new Livro (5678, "George R. R. Martin", "Suma", "As Crônicas de Gelo e Fogo"));
        c.adicionarLivro(new Livro (9101, "J. K. Rowling", "Rocco", "Harry Potter"));
        c.adicionarLivro(new Livro (5678, "George R. R. Martin", "Suma", "As crônicas de gelo e fogo"));

        c.imprimirLista();
        c.removerLivro(new Livro(5678, "George R. R. Martin", "Suma", "As Crônicas de Gelo e Fogo"));
        c.imprimirLista();
    }
}