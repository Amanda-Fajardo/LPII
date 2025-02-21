package atividade02.questao01;

public class main{
    public static void main(String[] args) {
        Carro carro1 = new Carro ("Fusca", 0, 10, 0, false);
        carro1.ligar();
        carro1.acelerar();
        carro1.marchaCima();   
        carro1.virarEsquerda();
        carro1.virarDireita();
        carro1.desacelerar();
        carro1.marchaBaixo();
        carro1.desligar();
    }
}