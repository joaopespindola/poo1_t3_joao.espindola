package com.mycompany.ex02_lab04;

public class Tetraedro extends FormaTridimensional{
    private double lado, altura;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return lado*lado*Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        return (lado*lado*Math.sqrt(3)*altura)/3;
    }

    public void printInfo() {
        System.out.println("O volume do tetraedro é: " + this.obterVolume());
    }
}
