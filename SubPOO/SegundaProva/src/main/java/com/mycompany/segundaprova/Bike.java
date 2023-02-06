package com.mycompany.segundaprova;

public class Bike extends veiculoDuasRodas{
    protected Marcha marcha;//alteracao para o exercicio 03
    protected double velocidade;
    
    public Bike(int numID, String nomeFabricante, double velocidadeInicial, int maxMarchas, String marcaFabricante){
        super(numID, nomeFabricante);
        marcha = new Marcha(maxMarchas, marcaFabricante);//alteracao para o exercicio 03
        velocidade = velocidadeInicial;
        //construtor alterado para se adequar a nova superclasse (veiculoDuasRodas)
        //alteracoes referentes ao exercicio 02
    }
    
    
    public void frear(int decremento){
        velocidade -= decremento;
    }
    
    public void acelerar(int incremento){
        velocidade += incremento;
    }
    
    public void imprimirDados(){
            System.out.println("\nBike está na marcha " + this.marcha + "e com velocidade de " + this.velocidade + " km/h");
        }
}