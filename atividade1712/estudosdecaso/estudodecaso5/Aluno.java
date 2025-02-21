package atividade1712.estudosdecaso.estudodecaso5;

public class Aluno extends Pessoa{
    int matricula;
    
    public Aluno(String nome, String cpf, int matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    protected void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matrícula: " + this.matricula);
    }   
}