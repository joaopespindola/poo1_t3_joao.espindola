package com.mycompany.empresa;

public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        //Faz o casting do "tipo" Classificável para Cliente
        Cliente compara = (Cliente) obj;
        //usando o compareTo para comparar as strings, ele retornará "< 0"
        //se a string a esquerda for menor que a string da direita, "> 0"
        //se a string a esquerda for maior que a string da direita, "= 0"
        //se as strings forem iguais
        int comp = this.nome.compareTo(compara.nome);
        //só retornará true se for menor, os outros casos não me importam
        if(comp < 0){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
