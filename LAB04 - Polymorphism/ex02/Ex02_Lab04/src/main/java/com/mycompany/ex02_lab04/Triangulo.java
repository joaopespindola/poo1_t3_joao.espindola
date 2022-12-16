package com.mycompany.ex02_lab04;

public class Triangulo extends FormaBidimensional{
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void printInfo() {
        System.out.println("A área do Triângulo é: " + this.obterArea());
    }
}

