package com.mycompany.empresa;

public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        //Faz o casting do "tipo" Classificável para Servico
        Servico compara = (Servico) obj;
        if(this.preco < compara.preco){
            return true;
        }else{
            return false;
        }
        
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
