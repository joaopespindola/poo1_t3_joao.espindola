package com.mycompany.ex05_lab03;

public class Operario extends Funcionario{
    private double valorPorProd;
    private int qtdProduzida;
    private double salarioVendedor;

    public Operario(double valorPorProd, int qtdProduzida, double salario, String nome, String dataDeNascimento) {
        super(nome, dataDeNascimento, salario);
        this.valorPorProd = valorPorProd;
        this.qtdProduzida = qtdProduzida;
    }

    public double getValorPorProd() {
        return valorPorProd;
    }

    public void setValorPorProd(double valorPorProd) {
        this.valorPorProd = valorPorProd;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public double getSalarioVendedor() {
        return salarioVendedor;
    }

    public void setSalarioVendedor(double salarioVendedor) {
        this.salarioVendedor = salarioVendedor;
    }


    
    public void calcularSalario(){
        this.salarioVendedor = valorPorProd * qtdProduzida;
    }
}
