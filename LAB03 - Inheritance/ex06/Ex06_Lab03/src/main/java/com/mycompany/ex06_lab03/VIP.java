package com.mycompany.ex06_lab03;

public class VIP extends Ingresso{
    private double valorAdicional;
    private double valorVIP;

    public VIP(double valorAdicional, double valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    
    
    public double retornaVIP(){
        this.valorVIP = getValor() + valorAdicional;
        System.out.println(""+this.valorVIP);
        return valorVIP;
    }

    public double getValorVIP() {
        return valorVIP;
    }

    public void setValorVIP(double valorVIP) {
        this.valorVIP = valorVIP;
    }
    

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
