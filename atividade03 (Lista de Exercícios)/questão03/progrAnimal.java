package atv02.quest03;

public class progrAnimal{

public static void main(String[] args) {

    Animal teste = new Animal("Leâo", "06/05/2020", "Scar", "321654-02", "Etiópia");
    teste.listar();

    teste.alterar("Onça-pintada", "12/03/2022", "Sr.Bigodes", "1234567-89", "Brasil")
    teste.listar();
}

}