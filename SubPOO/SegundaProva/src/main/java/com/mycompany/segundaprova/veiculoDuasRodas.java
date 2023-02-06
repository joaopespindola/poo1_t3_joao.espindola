package com.mycompany.segundaprova;

public abstract class veiculoDuasRodas {
    private int numID;
    private String nomeFabricante;

    public veiculoDuasRodas(int numID, String nomeFabricante) {
        this.numID = numID;
        this.nomeFabricante = nomeFabricante;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
    
    public abstract void imprimirDados();
}
