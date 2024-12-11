package Funcionario;

// import Calculo.Calculo.calcularSalario;

public class Funcionario {
    String nome, cpf, rg, dataContratacao;
    private double salario;
    private double salarioBase;
    private int horasTrbalhadas;
    private static int matricula = 0;

    Calculo calculo = new Calculo();

    public Funcionario(String nome, String cpf, String rg, String dataContratacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataContratacao = dataContratacao;
    }

    private static void gerarMatricula() {
        matricula++;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrbalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrbalhadas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalario() {
        calculo.calcularSalario(salarioBase, horasTrbalhadas);
        salario = calculo.getTotalSalario();
    }

public void imprimirDados() {
    System.out.println(this.nome);
    System.out.println(this.cpf);
    System.out.println(this.rg);
    System.out.println(this.dataContratacao);
    System.out.println(this.horasTrbalhadas);
    System.out.println(this.salario);
    System.out.println(this.salarioBase);
    System.out.println(this.matricula);
}
}
