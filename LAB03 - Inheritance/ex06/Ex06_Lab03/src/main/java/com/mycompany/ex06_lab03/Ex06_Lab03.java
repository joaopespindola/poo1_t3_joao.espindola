package com.mycompany.ex06_lab03;

public class Ex06_Lab03 {

    public static void main(String[] args) {
        Ingresso GusttavoLima = new Ingresso(500);
        GusttavoLima.escreveValor();
        VIP GusttavoVIP = new VIP(500, 50);
        GusttavoVIP.retornaVIP();
        CamaroteSuperior GusttavoVIPSuperior = new CamaroteSuperior(500, 100);
        GusttavoVIPSuperior.valorIngresso();
        CamaroteInferior GusttavoVIPInferior = new CamaroteInferior("Área g", 500, 100);
        GusttavoVIPInferior.imprimirLoc();
    }
}
