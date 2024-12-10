package atv02.quest03;

public class Animal
{
        String especie;
	    String dataNasc;
	    String nome;
	    int numReg;
	    String locNasc;    
    
    
    public Animal(String especie, String dataNasc, String nome, int numReg, String locNasc){
       
        this.especie = especie;
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.numReg = numReg;
        this.locNasc = locNasc;
    }
    
    public void alterar(String especie, String dataNasc, String nome, int numReg, String locNasc){
        
        this.especie = especie;
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.numReg = numReg;
        this.locNasc = locNasc;
     
    }
    
    public void listar(){
        
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numReg);
        System.out.println("Local de nascimento: " + locNasc);
}
	
}