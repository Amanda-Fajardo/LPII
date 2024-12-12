
package Funcionario;

public class Calculo {

    private double salarioTotal;

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void calcularSalario(double salarioBase, int horasTrabalhadas) {
        double salario = salarioBase * horasTrabalhadas;
        setSalarioTotal(salario);
    }
}