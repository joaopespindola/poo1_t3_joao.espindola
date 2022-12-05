package com.mycompany.ex05_lab03;

public class Vendedor extends Funcionario{
    private double salarioVendedor;
    private String ondeTrabalha;
    private int vendas;
    private int comissao;

    public Vendedor(String ondeTrabalha, int vendas, int comissao, String nome, String dataDeNascimento, Double salario) {
        super(nome, dataDeNascimento, salario);
        this.ondeTrabalha = ondeTrabalha;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    

    public double getSalarioVenededor() {
        return salarioVendedor;
    }

    public void setSalarioVenededor(double salarioVenededor) {
        this.salarioVendedor = salarioVenededor;
    }

    public String getOndeTrabalha() {
        return ondeTrabalha;
    }

    public void setOndeTrabalha(String ondeTrabalha) {
        this.ondeTrabalha = ondeTrabalha;
    }
    
    public void calcularSalario(){
        this.salarioVendedor = (getSalario() + (vendas * comissao));
    }
    
    
    
}
