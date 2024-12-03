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
		
		System.out.println("Informe seu peso e altura");
		
		double peso = teclado.nextDouble();
		double altura = teclado.nextDouble();
		double imc = peso / (altura*altura);
		
		if (imc > 30){
		    System.out.println("Você está obeso");
		} else{
		    System.out.println("Você não está obeso");
		}
		
		
	}
}