package com.mycompany.ex02_lab04;

public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6*lado*lado;
    }

    @Override
    public double obterVolume() {
        return lado*lado*lado;
    }

    public void printInfo() {
        System.out.println("O volume do cubo é: " + this.obterVolume());
    }
}
