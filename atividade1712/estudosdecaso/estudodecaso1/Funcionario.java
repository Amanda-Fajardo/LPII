package atividade1712.estudosdecaso.estudodecaso1;

public class Funcionario{
    protected String nome, cpf;
    protected  double salario;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void imprimirSalario(){
        System.out.println("Salário: " + this.salario);
    }
    
    protected void calcularPagamento(){
        
    }
}