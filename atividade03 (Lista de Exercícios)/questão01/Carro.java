package atv02.quest01;
public class Carro
{
        int codigo;
	    String marca;
	    String cor;
	    String modelo;
	    int anoFab;
	    int numPortas;
	    String tipoCombust;
	    double preco;
	    String novoBasico;
    
    public Carro(int codigo, String marca, String cor, String modelo, int anoFab, int numPortas, String tipoCombust, double preco, String novoBasico){
       
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.tipoCombust = tipoCombust;
        this.preco = preco;
        this.novoBasico = novoBasico;
    }
    
    public void alterar(int codigo, String marca, String cor, String modelo, int anoFab, int numPortas, String tipoCombust, double preco, String novoBasico){
        
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.tipoCombust = tipoCombust;
        this.preco = preco;
        this.novoBasico = novoBasico;
     
    }
    
    public void listar(){
        
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFab);
        System.out.println("Número de Portas: " + numPortas);
        System.out.println("Tipo de Combustível: " + tipoCombust);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + novoBasico);
    }
}