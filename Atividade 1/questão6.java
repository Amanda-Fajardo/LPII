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
		
		System.out.println("Informe as notas das duas provas e a nota do trabalho");
		
		double prova1 = teclado.nextDouble();
		double prova2 = teclado.nextDouble();
		double trab = teclado.nextDouble();
		
		double media = (prova1+prova2+trab)/3;
		
		if (media > 7){
		    System.out.println("A média é " + media +"\nAluno aprovado");
		} else{
		    System.out.println("A média é " + media +"\nAluno reprovado");
		}
		
		
	}
}