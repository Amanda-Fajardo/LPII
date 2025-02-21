package atividade1712.estudosdecaso.estudodecaso2;

public class Main {
    public static void main(String[] args) {
        ItemBiblioteca livro = new Livro("O Senhor dos Anéis", 1, "J.R.R. Tolkien", 1000);
        ItemBiblioteca revista = new Revista("Vogue", 2, 100);
        ItemBiblioteca dvd = new DVD("O Poderoso Chefão", 3, "3 horas");
        ItemBiblioteca livro2 = new Livro("Harry Potter", 4, "J.K. Rowling", 500);
        ItemBiblioteca revista2 = new Revista("Veja", 5, 200);
        ItemBiblioteca dvd2 = new DVD("Titanic", 6, "2 horas");

        ItemBiblioteca[] itens = new ItemBiblioteca[6];

        itens[0] = livro;
        itens[1] = revista; 
        itens[2] = dvd;
        itens[3] = livro2;
        itens[4] = revista2;
        itens[5] = dvd2;

        for (int i = 0; i < itens.length; i++) {
            itens[i].exibirInformacoes();
        }
}