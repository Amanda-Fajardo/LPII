import java.lang.classfile.AnnotationValue.OfInteger;

public class Livro {
    private int isbn;
    private String autor, editora, titulo;

    public Livro(int isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return this.isbn == livro.isbn;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(isbn);
    }
}