package com.mycompany.primeiraprova;

public class Retangulo {
    private Ponto p1;
    private Ponto p2;
    private double base;
    private double altura;

    public Retangulo(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Retangulo(Ponto p2) {
        this.p1 = new Ponto(0, 0);
        this.p2 = p2;
    }
    
    public double CalcArea(){
        base = p2.getX() - p1.getX();
        altura = p2.getY() - p1.getY();
        return base*altura;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
   
}
