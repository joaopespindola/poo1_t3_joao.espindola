package com.mycompany.ex01_lab04;

public class FolhaPagamento{
    Funcionario[] func = new Funcionario[4];

    public FolhaPagamento() {
    }
    
    public double calculaFolha(Funcionario vetor[]){  
        double folha=0;
        for(int i = 0; i < vetor.length; i++){
            folha += vetor[i].calcularSalario();    
        }
        System.out.println(""+folha);
        return folha;
        }
    
    }
    
