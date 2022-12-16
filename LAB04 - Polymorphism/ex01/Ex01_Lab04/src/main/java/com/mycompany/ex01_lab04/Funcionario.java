package com.mycompany.ex01_lab04;

public abstract class Funcionario {//classe abstrata pois nenhum funcionário deve ser instanciado
    private String nome;
    private String dataDeNascimento;
    private double salario;

    public Funcionario(String nome, String dataDeNascimento, double salario) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public abstract double calcularSalario();
    
    
}
