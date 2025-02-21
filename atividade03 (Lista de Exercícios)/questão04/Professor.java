package atv02.quest04;
public class Professor
{
        String nome;
	    String titulacao;
	    String formacao;
	    int cargaH;
	    double salario;
	    String descDisciplina;
    
    
    public Professor(String nome, String titulacao, String formacao, int cargaH, double salario, String descDisciplina){
       
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaH = cargaH;
        this.salario = salario;
        this.descDisciplina = descDisciplina;
    }
    
    public void alterar(String nome, String titulacao, String formacao, int cargaH, double salario, String descDisciplina){
        
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaH = cargaH;
        this.salario = salario;
        this.descDisciplina = descDisciplina;
     
    }
    
    public void listar(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Titutação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga horária: " + cargaH);
        System.out.println("Salário: " + salario);
        System.out.println("Descrição da disciplina: " + descDisciplina);
}

    public void alterarDescricao(String novaDesc){
        this.descDisciplina = novaDesc;
    }
	

    }