package com.mycompany.ex01;

public class UltrapassaTetoException extends IllegalStateException{
    public String mensagem;
    public UltrapassaTetoException(){
        this.mensagem = "Valor ultrapassa o teto";
    }
}
