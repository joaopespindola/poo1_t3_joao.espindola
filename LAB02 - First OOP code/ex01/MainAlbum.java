package com.mycompany.mainalbum;

public class MainAlbum {

    public static void main(String[] args) {
        Figurinha neymar = new Figurinha();
            neymar.nome = "Neymar";
            neymar.data = "12/10/1990";
            neymar.altura = 1.80f;
            neymar.peso = 75.5f;
            neymar.posição = "ponta esquerda";
            neymar.país = "Brasil";
        Figurinha vinijr = new Figurinha();
            vinijr.nome = "Vynicius Jr";
            vinijr.data = "12/10/1990";
            vinijr.altura = 1.80f;
            vinijr.peso = 75.5f;
            vinijr.posição = "ponta esquerda";
            vinijr.país = "Brasil";
        Figurinha pedro = new Figurinha();
            pedro.nome = "Pedro";
            pedro.data = "12/10/1990";
            pedro.altura = 1.80f;
            pedro.peso = 75.5f;
            pedro.posição = "centroavante";
            pedro.país = "Brasil";
            
        vinijr.statusFigurinha();
        neymar.statusFigurinha();
        pedro.statusFigurinha();
            
    }
}
