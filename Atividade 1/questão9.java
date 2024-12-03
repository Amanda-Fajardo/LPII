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
		
		System.out.println("Informe o valor da hora aula, as horas trabalhadas e o percentual do INSS");
		
		double h_aula = teclado.nextDouble();
		double h_trab = teclado.nextDouble();
		double inss = teclado.nextDouble();
		
		double s_bruto = h_aula*h_trab;
		double desconto = s_bruto * (inss/100);
		double s_liquido = s_bruto - desconto;
		
	    System.out.println("Seu salário líquido é de R$" + s_liquido);
	}
}