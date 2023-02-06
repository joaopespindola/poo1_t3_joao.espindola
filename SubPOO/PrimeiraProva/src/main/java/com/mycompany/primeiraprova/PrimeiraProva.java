package com.mycompany.primeiraprova;
import java.util.Scanner;

public class PrimeiraProva {

    public static void main(String[] args) {
        int n;
        int x1, x2, y1, y2;
        Ponto p1, p2;
        double maiorArea;
        int aux = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE RETÂNGULOS QUE DESEJA LER ");
        n = sc.nextInt();
        Retangulo[] retangulos = new Retangulo[n];
        
        for(int i = 0; i < n; i++){
            System.out.printf("DIGITE AS COORDENADAS DO PRIMEIRO PONTO DO RETANGULO %d ", (i+1));
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            p1 = new Ponto(x1, y1);
            
            System.out.printf("DIGITE AS COORDENADAS DO SEGUNDO PONTO DO RETANGULO %d ", (i+1));
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            p2 = new Ponto(x2, y2);
            
            retangulos[i] = new Retangulo(p1, p2); 
        }
        
        for(int i = 0; i < n; i++){
            System.out.println("Ponto 1(x)" + retangulos[i].getP1().getX());
            System.out.println("Ponto 1(y)" + retangulos[i].getP1().getY());
            System.out.println("Ponto 2(x)" + retangulos[i].getP2().getX());
            System.out.println("Ponto 2(y)" + retangulos[i].getP2().getY());
        }
        
        maiorArea = retangulos[0].CalcArea();
        for(int i = 0; i < n; i++){
            if(maiorArea < retangulos[i].CalcArea()){
                aux = i;
                maiorArea = retangulos[i].CalcArea();
            }
            
        }
        System.out.printf("Área formada por (%d, %d) e (%d, %d) é (%.2f)", retangulos[aux].getP1().getX(), retangulos[aux].getP1().getY(), retangulos[aux].getP2().getX(), retangulos[aux].getP2().getY(), maiorArea);
    }
    //Questão 2 - O operador new serve para instanciar um novo objeto em Java.
    //Aloca a memória necessária para criação do objeto e faz a chamada do construtor.
}
