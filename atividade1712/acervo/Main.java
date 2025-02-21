package atividade1712.acervo;

public static void main(String[] args){
    Publicacao livro = new Livro ("Quarta Asa", "Rebecca Yarros", "Fantasia", "Planeta Minotauro", 2023, 15, "Edição de luxo", "174VX")

    Publicacao filme = new Filme("Deadpool", "Rob Liefeld", "Ação", "Editora MKFilms", 2016, 10, "Tim Miller", "Ryan Reynolds",
    "Wade Wilson é um ex-agente especial que passou a trabalhar como mercenário.", "1h 48min");

    publicacoes[0] = livro;
    publicacoes [1] = filme;

    for (int i = 0; i < publicacao.lenght; i++){
        publicacoes[i].imprimirDados();
    }

}