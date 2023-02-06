package com.mycompany.segundaprova;

public class MountainBike extends Bike{
    private String tipoSuspensao;
    
    public MountainBike(double velocidadeInicial, int marchaInicial, String tipoSuspensao){
        super(velocidadeInicial, marchaInicial);
        this.setTipoSuspensao(tipoSuspensao);
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("A " + "MountainBike possui" + "suspensão do tipo " + getTipoSuspensao());
    }  
}
