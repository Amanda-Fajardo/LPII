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
		
		System.out.println("Informe as horas trabalhadas");
		
		int h_trab = teclado.nextInt();
		float salario = h_trab*20;
		
		System.out.println("Seu salário pelas horas trabalhadas é: R$" + salario);
	}
}