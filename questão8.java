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
		
		System.out.println("Informe o valor do raio");
		
		double raio = teclado.nextDouble();
		double area = 3.14 * (raio*raio);
		
		System.out.println("O valor da área é: " + area);
		
	}
}