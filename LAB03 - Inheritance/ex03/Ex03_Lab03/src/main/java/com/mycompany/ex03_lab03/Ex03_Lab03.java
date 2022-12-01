package com.mycompany.ex03_lab03;

public class Ex03_Lab03 {

    public static void main(String[] args) {
        Figurinha a = new Figurinha("Roberto Carlos", "25/08/1972", 2, 80, "Ala armador", "Brasil");
        a.MostrarFigurinha();
        FigurinhaExtra aExtra = new FigurinhaExtra(a, "Rookie", "Bordô");
        aExtra.MostrarFigurinha();
    }
}
