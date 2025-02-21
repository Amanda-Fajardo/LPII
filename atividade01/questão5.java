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
		
		if (num1 > num2){
		    System.out.println(num1 + " é o maior entre os dois");
		} else{
		    System.out.println(num2 + " é o maior entre os dois");
		}
		
		
	}
}