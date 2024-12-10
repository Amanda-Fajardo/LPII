package atv02.quest01;
public class Carro{

public static void main(String[] args) {
    
    Carro teste = new Carro(3, "Fiat", "Preto", "Mobi", 2020, 4, "Gasolina",  50.000, "completo");
    
        teste.listar();

        teste.alterar(5, "Chevrolet", "Preto", "Onix", 2020, 4, "Gasolina",  102.000, "completo");
    
        teste.listar();

}
}