package atv02.quest5;

public class Funcionario
{
        String nome;
	    String dataNasc;
	    String rg;
	    String cpf;
	    String endereco;
        String naturalidade;
        Double salario;
        String profissao;
        String grauIntrucao;
        int matricula;   
        
    
    public Funcionario(String nome, String dataNasc, String rg, String cpf, String endereco, String naturalidade, Double salario, String profissao, String grauIntrucao, int matricula){
       
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauIntrucao = grauIntrucao;
        this.matricula = matricula;
    }
    
    public void cadastrarAlterar(String nome, String dataNasc, String rg, String cpf, String endereco, String naturalidade, Double salario, String profissao, String grauIntrucao, int matricula){
        
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauIntrucao = grauIntrucao;
        this.matricula = matricula; 
     
    }
    
    public void listar(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: " + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de instrução: " + grauIntrucao);
        System.out.println("Matrícula: " + matricula);
        
}
	
       }
       
    
