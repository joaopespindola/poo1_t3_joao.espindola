package com.mycompany.segundaprova;

public class Marcha {
    private int maxMarchas;
    private String marcaFabricante;
    private int marchaAtual;

    public Marcha(int maxMarchas, String marcaFabricante) {
        this.maxMarchas = maxMarchas;
        this.marcaFabricante = marcaFabricante;
        this.marchaAtual = 1;
    }
    
    public void incrementarMarcha(){
        if((this.marchaAtual + 1) <= maxMarchas){
            this.marchaAtual = marchaAtual + 1;
        }
        else{
            System.out.println("Não foi possível incrementar a marcha");
        }
    }
    
    public void decrementarMarcha(){
        if((this.marchaAtual - 1) >= 1){
            this.marchaAtual = marchaAtual - 1;
        }
        else{
            System.out.println("Não foi possível decrementar a marcha");
        }
    }


    public int getMaxMarchas() {
        return maxMarchas;
    }


    public String getMarcaFabricante() {
        return marcaFabricante;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    } 
}

