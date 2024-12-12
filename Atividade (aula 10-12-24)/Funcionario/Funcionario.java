package Funcionario;

public class Funcionario {
    String nome, cpf, rg, dataContratacao;
    private double salario;
    private double salarioBase;
    private int horasTrabalhadas;
    private int matricula;
    private static int contadorMatricula = 0;

    Calculo calculo = new Calculo();

    public Funcionario(String nome, String cpf, String rg, String dataContratacao, int horasTrabalhadas, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataContratacao = dataContratacao;
        gerarMatricula();
        setHorasTrabalhadas(horasTrabalhadas);
        this.horasTrabalhadas = getHorasTrabalhadas();
        setSalarioBase(salarioBase);
        this.salarioBase = getSalarioBase();
    }

    private void gerarMatricula() {
        contadorMatricula++;
        this.matricula = contadorMatricula;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
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

    public void calcularSalario() {
        calculo.calcularSalario(salarioBase, horasTrabalhadas);
        this.salario = calculo.getSalarioTotal();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Data da contratação: " + this.dataContratacao);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Salário total: " + this.salario);
        System.out.println("Salário base: " + this.salarioBase);
        System.out.println("Número de matrícula: " + this.matricula);
        System.out.println("----------------------------------");
    }
}
