package atv02.quest04;
public class Professor{

public static void main(String[] args) {
    
    Professor teste = new Professor("Marcos", "Mestre", "Engenharia de Computação", 44, 4.500, "Lógica de programação, Cálculo I");

    teste.listar();

    teste.alterar("Rebecca", "Mestre", "Sistemas de Informação", 44, 4.500, "Linguagem de programação 1, Linguagem de programação 2");
    
    teste.listar();
   
    }
}