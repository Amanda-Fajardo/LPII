/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quantos km serão percorridos e o preço do litro da gasolina");
		
		double distancia = teclado.nextDouble();
		double preco = teclado.nextDouble();
		double litro = distancia/12;
		double custo = litro*preco;
		
		System.out.println("Você irá gastar R$" + custo + " em " + litro + " gasolina");
	}
}