package com.mycompany.albumcomvetor;
import java.util.Scanner;

public class AlbumComVetor{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroDeJogadores, i;
        int metamorfose;
        String metamorfose2;
        System.out.println("Digite o número de jogadores que vai querer instanciar");
        numeroDeJogadores = ler.nextInt();
        Figurinha[] vetorDeFig = new Figurinha[numeroDeJogadores];
        //laço para instanciar o vetorDeFig
        for(i = 0; i < numeroDeJogadores; i++){
            vetorDeFig[i] = new Figurinha();
        }
        //laço para instanciar os jogadores com suas características
        for(i = 0; i < numeroDeJogadores; i++){
            System.out.println("Digite o nome do jogador: ");
            metamorfose2 = ler.next();
            vetorDeFig[i].setNome(metamorfose2);
            System.out.println("Data de Nascimento: ");
            metamorfose2 = ler.next();
            vetorDeFig[i].setData(metamorfose2);
            System.out.println("Altura do jogador: ");
            metamorfose = ler.nextInt();
            vetorDeFig[i].setAltura(metamorfose);
            System.out.println("Peso do jogador: ");
            metamorfose = ler.nextInt();
            vetorDeFig[i].setPeso(metamorfose);
            System.out.println("Posição do Jogador: ");
            metamorfose2 = ler.next();
            vetorDeFig[i].setPosição(metamorfose2);
            System.out.println("País do jogador: ");
            metamorfose2 = ler.next();
            vetorDeFig[i].setPaís(metamorfose2);
        }
        //laço para printar as características dos jogadores
        for(i = 0; i < numeroDeJogadores; i++){
            vetorDeFig[i].statusFigurinhaPriv();
        }
        
    }
}