package atv02.quest06;

import java.util.Scanner;
public class progrFuncionario{
    Scanner teclado = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    Double num1, num2, result;
    
    System.out.println("Informe dois números \n");
    num1 = teclado.nextDouble();
    num2 = teclado.nextDouble();
    
    String operacao;
    System.out.println("Qual operação você gostaria de fazer? (informe o símbolo: +, - , *, /) \n");
    operacao = teclado.next();

    if(operacao == "+"){
        result = calculadora.somar(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    else if(operacao == "-"){
        result = calculadora.subritrair(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    else if(operacao == "*"){
        result = calculadora.multiplicar(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + result);
    }

    else{
        result = calculadora.dividir(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
    
    teclado.close();
}