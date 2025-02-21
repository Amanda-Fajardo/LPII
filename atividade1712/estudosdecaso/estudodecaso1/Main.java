package atividade1712.estudosdecaso.estudodecaso1;

public class Main {
    public static void main(String[] args) {
        Funcionario mensalista01 = new Mensalista("Bianca", "147.258.369-00", 1500.00);
        Funcionario mensalista02 = new Mensalista("Pedro", "789.456.123-33", 1450.00);
        
        Funcionario horista01 = new Horista("Carlos", "258.369.147.00", 100, 15.00);
        Funcionario horista02 = new Horista("Alicia", "456.123.789.33", 120, 20.00);

        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = horista01;
        funcionarios[1] = mensalista01;
        funcionarios[2] = horista02;
        funcionarios[3] = mensalista02;
    
        for(int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].calcularPagamento();
            funcionarios[i].imprimirSalario();
        }
    }
}
