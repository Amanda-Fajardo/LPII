package atividade1712.estudosdecaso.estudodecaso1;

public class Horista extends Funcionario {
    double valorHora, horasTrabalhadas;

    public Horista(String nome, String cpf, double valorHora, double horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    protected void  calcularPagamento() {
        super.salario = (valorHora * horasTrabalhadas);
    
    }
}

