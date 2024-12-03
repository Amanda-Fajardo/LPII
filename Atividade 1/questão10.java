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
		
		System.out.println("Informe dois números");
		
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		double soma = num1+num2;
		
		if (soma > 10){
		    System.out.println("A soma dos dois números é igual a " + soma);
		} else{
		    System.out.println("O resultado da soma é menor que 10");
		}
	
	}
}