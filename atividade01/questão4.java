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
		
		System.out.println("Informe a temperatura do paciente");
		
		float temperatura = teclado.nextFloat();
		
		if (temperatura > 37){
		    System.out.println("O paciente está com febre");
		} else{
		    System.out.println("O paciente está com a temperatura normal");
		}
		
		
	}
}