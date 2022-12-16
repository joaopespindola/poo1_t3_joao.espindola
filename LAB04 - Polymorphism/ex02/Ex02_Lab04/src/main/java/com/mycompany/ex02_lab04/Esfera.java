package com.mycompany.ex02_lab04;

public class Esfera extends FormaTridimensional{
    private double r;

    public Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obterArea() {
        return 4*(Math.PI*r*r);
    }

    @Override
    public double obterVolume() {
        return ((Math.PI*r*r*r)*4/3);


    }
    @Override
    public void printInfo() {
        System.out.println("O volume da esfera é: " + this.obterVolume());
    }
}
