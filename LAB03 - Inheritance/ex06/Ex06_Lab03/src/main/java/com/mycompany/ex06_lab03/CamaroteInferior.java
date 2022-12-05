package com.mycompany.ex06_lab03;

public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(String localizacao, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.localizacao = localizacao;
    }

    public void imprimirLoc(){
        System.out.println("A localização do ingresso é: " + this.localizacao);
    }
    
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
