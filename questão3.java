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
		
		System.out.println("Informe sua idade");
		
		int idade = teclado.nextInt();
		
		if (idade >= 18){
		    System.out.println("Você pode tirar carteira");
		} else{
		    System.out.println("Você não pode tirar carteira");
		}
		
		
	}
}