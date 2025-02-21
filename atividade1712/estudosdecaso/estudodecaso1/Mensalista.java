package atividade1712.estudosdecaso.estudodecaso1;

public class Mensalista extends Funcionario{
    protected double salarioFixo;

    public Mensalista(String nome, String cpf, double salarioFixo){
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }
    
    protected void calcularPagamento(){
        super.salario = this.salarioFixo;
    }
}

