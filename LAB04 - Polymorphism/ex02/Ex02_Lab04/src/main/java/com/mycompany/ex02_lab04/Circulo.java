package com.mycompany.ex02_lab04;

public class Circulo extends FormaBidimensional{
    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    @Override
    public double obterArea() {
        return Math.PI * r*r;
    }

    @Override
    public void printInfo() {
        System.out.println("A área do Círculo é: " + this.obterArea());
    }
}