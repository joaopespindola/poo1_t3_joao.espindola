package com.mycompany.ex02_lab04;

public class Ex02_Lab04 {

    public static void main(String[] args) {
        Forma vetorDeFormas[] = new Forma[6];
        vetorDeFormas[0] = new Circulo(5);
        vetorDeFormas[1] = new Quadrado(5);
        vetorDeFormas[2] = new Triangulo(5, 10);
        vetorDeFormas[3] = new Esfera(10);
        vetorDeFormas[4] = new Cubo(5);
        vetorDeFormas[5] = new Tetraedro(5, 10);
        for(int i =0; i < 6; i++){
            vetorDeFormas[i].printInfo();
        }
    }
}
