package com.mycompany.ex01;

public class Funcionario {

    private String CPF;
    private String nome;
    private double salario;
    private double tetoSalarial;

    
    public Funcionario(double salario){
        this.tetoSalarial = 40000;
        this.salario = salario;
    }
    
    public void atribuirTeto(double novoTeto){
        this.tetoSalarial = novoTeto;
    }
    
    public void consultarTeto(){
        System.out.println("O TETO SALARIAL ÉH DE " + this.tetoSalarial);
    }
    
    public void aumentarSalario(double aAumentar) throws NegativoException, UltrapassaTetoException{//o "throws" indica que, na classe, talvez eu precise
        //usar tais exceptions
        if((aAumentar * salario) > tetoSalarial){
            throw new UltrapassaTetoException();
        }
        if(aAumentar < 0){
            throw new NegativoException();
        }
        else{
        this.salario = salario*aAumentar;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        System.out.println(""+this.salario);
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    
    
}
