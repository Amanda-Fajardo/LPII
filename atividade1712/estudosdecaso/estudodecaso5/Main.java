package estudosdecaso.estudodecaso5;

import atividade1712.estudosdecaso.estudodecaso5.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Professor("Roberto", "159.753.852-79", "Biologia");
        Pessoa p2 = new Aluno ("Alice", "741.852.963-46", "123456");
        Pessoa p3 = new Aluno ("Pietro", "963.852.741-25", "654321");
        Pessoa p4 = new Professor ("Cecília", "123.789.456-00", "Química");

        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;

        for (int i = 0; i < pessoas.lenght; i++){
            pessoas[i].exibirDados();
        }
    }
}