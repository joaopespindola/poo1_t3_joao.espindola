package com.mycompany.segundaprova;

public class SpeedBike extends Bike{
    //In millimeters (mm)
    private int espessuraPneu;

    public SpeedBike(int espessuraPneu, int numID, String nomeFabricante, double velocidadeInicial) {
        super(numID, nomeFabricante, velocidadeInicial);
        this.espessuraPneu = espessuraPneu;
        //construtor alterado para se adequar a nova superclasse (veiculoDuasRodas)
        //alteracoes referentes ao exercicio 02
    }
    
    public int getEspessuraPneu() {
        return espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }
    
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A SpeedBike tem pneus de " + getEspessuraPneu() + " MM. ");
    }
    
}
