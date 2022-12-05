package com.mycompany.ex05_lab03;

public class Chefe extends Funcionario{
    private double salarioChefe;
    private String areaAtuante;
    
    public Chefe(String nome, String dataDeNascimento, double salario, String areaAtuante){
        super(nome, dataDeNascimento, salario);
        this.setAreaAtuante(areaAtuante);
    }
    
    void calcularSalario(){
        this.salarioChefe = getSalario();
        System.out.println(""+getSalarioChefe());
    }

    public double getSalarioChefe() {
        return salarioChefe;
    }

    public String getAreaAtuante() {
        return areaAtuante;
    }

    public void setAreaAtuante(String areaAtuante) {
        this.areaAtuante = areaAtuante;
    }
    

    public void setSalarioChefe(double salarioChefe) {
        this.salarioChefe = salarioChefe;
    }

    

}
