package com.mycompany.ex01_lab03;

public class Ex01_Lab03 {

    public static void main(String[] args) {
        Figurinha a = new Figurinha("Roberto Carlos", "25/08/1972", 2, 80, "Ala armador", "Brasil");
        a.MostrarFigurinha();
        FigurinhaExtra Lukaku = new FigurinhaExtra("Lukaku", "28/03/1983", 2, 82, "Falso 9", "Bélgica", "Rookie", "Bordô");
        Lukaku.MostrarFigurinha();
    }
}
