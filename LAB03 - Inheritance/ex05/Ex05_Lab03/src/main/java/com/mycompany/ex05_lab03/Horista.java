package com.mycompany.ex05_lab03;

public class Horista extends Funcionario{
    private double valorPorHora;
    private int totalDeHoras;
    private double SalarioHorista;

    public Horista(double valorPorHora, int totalDeHoras, String nome, String dataDeNascimento, Double salario) {
        super(nome, dataDeNascimento, salario);
        this.valorPorHora = valorPorHora;
        this.totalDeHoras = totalDeHoras;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setTotalDeHoras(int totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }
    
    public void calcularSalario(){
        this.SalarioHorista = valorPorHora * totalDeHoras;
    }

}
