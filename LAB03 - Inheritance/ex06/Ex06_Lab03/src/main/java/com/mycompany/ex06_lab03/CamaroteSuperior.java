package com.mycompany.ex06_lab03;

public class CamaroteSuperior extends VIP{

    public CamaroteSuperior(double valor, double custoVIP) {
        super(valor, custoVIP);
    }
    
    private double valorAdicional;
    private double VIPComCamarote;
    
    public double valorIngresso(){
        this.VIPComCamarote = retornaVIP() + valorAdicional;
        System.out.println(""+this.VIPComCamarote);
        return VIPComCamarote;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
