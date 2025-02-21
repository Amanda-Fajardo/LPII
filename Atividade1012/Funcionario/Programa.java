package Funcionario;

//pode usar o scanner pra aumentar a reusabilidade do código

public class Programa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Zé", "12345678999", "12555693", "12/12/2012", 44, 40);

        // Esse trecho é possivel pois os dados tem acesso default

        f1.rg ="12345678";
        f1.cpf = "123456789101";

        // f1.salario = 380;
        // f1.matricula = 123;
        // Esse trecho é impossivel pois os atributos são privados

        f1.calcularSalario();
        f1.imprimirDados();

        
        Funcionario f2 = new Funcionario("Maria", "987654321012", "87654321", "01/01/2001", 40, 35);
        f2.calcularSalario();
        f2.imprimirDados();
    }
}
