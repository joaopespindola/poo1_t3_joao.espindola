package com.mycompany.ex02_lab04;

public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void printInfo() {
        System.out.println("A área do Quadrado é: " + this.obterArea());
    }
}

