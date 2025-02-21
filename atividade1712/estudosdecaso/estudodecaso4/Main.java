package atividade1712.estudosdecaso.estudodecaso4;

public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Bicicleta(1, 3);
        Transporte t2 = new Carro(5, "Gasolina");
        Transporte t3 = new Onibus(40, 101);

        Transporte[] transportes = new Transporte[3];

        transportes[0] = t1;
        transportes[1] = t2;
        transportes[2] = t3;

        for(int i = 0; i < transportes.length; i++){
            transportes[i].mostrarDetalhes();
        }
    }
}
