package com.mycompany.ex01;

public class NegativoException extends IllegalStateException{
    public String mensagem;
    public NegativoException(){
        this.mensagem = "Valor inválido de salário";
    }
}
