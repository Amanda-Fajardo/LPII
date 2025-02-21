package atividade1712.estudosdecaso.estudodecaso3;

public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Cachorro("Rex", 5, "Vira-lata");
        Animal animal02 = new Gato("Mingau", 3, "Persa");
        Animal animal03 = new Ave("Blue", 1, "Arara Azul");

        Animal[] animais = new Animal[3];

        animais[0] = animal01;
        animais[1] = animal02;
        animais[2] = animal03;

        for (int i = 0; i < animais.length; i++){
            animais[i].emitirSom();
        }
    } 
}