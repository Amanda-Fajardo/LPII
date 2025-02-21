package atividade02.questao02;

public class Televisao {
    double polegadas;
    int volume;
    String marca;
    int voltagem;
    int canal;
    boolean ligada;
}

public Televisao(double polegadas, int volume, String marca, int voltagem, int canal, boolean ligada){
    this.polegadas = polegadas;
    this.volume = volume;
    this.marca = marca;
    this.voltagem = voltagem;
    this.canal = canal;
    this.ligada = ligada;
}

public void ligar(){
    if(this.ligada == false){
        this.ligada = true;
        System.out.println("Televisão ligada. O seu consumo é de: " + (this.voltagem * this.polegadas) + "W");
    } else {
        System.out.println("A televisão já está ligada.O seu consumo é de: " + (this.voltagem * this.polegadas) + "W");
    }
}

public void desligar(){
    if(this.ligada == true){
        this.ligada = false;
        System.out.println("Televisão desligada");
    } else {
        System.out.println("A televisão já está desligada");
    }
}

public void aumentarVolume(){
    if(this.ligada == true && this.volume < 100){
        this.volume++;
        System.out.println("Volume atual: " + this.volume);
    } else {
        System.out.println("O volume já está no máximo");
    }
}

public void diminuirVolume(){
    if(this.ligada == true && this.volume > 0){
        this.volume--;
        System.out.println("Volume atual: " + this.volume);
    } else {
        System.out.println("O volume já está no mínimo");
    }
}

public void aumentarCanal(){
    if(this.ligada == true && this.canal < 10){
        this.canal++;
        System.out.println("Canal atual: " + this.canal);
    }
}

public void diminuirCanal(){
    if(this.ligada == true && this.canal > 0){
        this.canal--;
        System.out.println("Canal atual: " + this.canal);
    }
}

