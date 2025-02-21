package atv02.quest02;

public class progrBanco{

public static void main(String[] args) {
   
    
    Banco teste = new Banco("Amanda Fajardo", "12.456.753-25", "123.456.789-05", 500, 15, "12345-x");
    teste.imprimirSaldo();

    teste.alterar("Amanda Silva", "32.654.987-01", "159.147.369-55", 100, 90, "75389-8");
    teste.imprimirSaldo();

}
}