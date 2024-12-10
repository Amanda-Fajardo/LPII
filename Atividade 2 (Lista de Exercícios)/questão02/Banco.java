package atv02.quest02;
public class Banco
{
        String nomeCorrentista;
	    String rg;
	    String cpf;
	    double saldo;
	    int numero;
	    String agencia;
    
    public Banco(String nomeCorrentista, String rg, String cpf, double saldo, int numero, String agencia){
       
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, int numero, String agencia){
        
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
     
    }
    
    public void imprimirSaldo(){
        
        System.out.println("Saldo: R$" + saldo);
    }
}
