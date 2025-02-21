package atividade02.questao02;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao(32, 5, "Samsung", 110, 1, false);
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.diminuirVolume();
        tv.desligar();   

    }
}
