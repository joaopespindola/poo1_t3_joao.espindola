package com.mycompany.ex01_lab04;
import java.util.Scanner;

public class Empresa{
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i;
        //polimorfismo
        Funcionario[] funcionários = new Funcionario[4];
        funcionários[0] = new Chefe("Rosivaldo", "25/12/1978", 8500, "RH");
        funcionários[1] = new Vendedor("Loja 03", 50, 20, "Genisvaldo", "28/03/1981", 0);
        funcionários[2] = new Horista(50, 80, "Júnior", "13/08/1997", 0);
        funcionários[3] = new Operario(100, 50, 0, "Roberto", "21/09/2001");  
        
        FolhaPagamento x = new FolhaPagamento();
        x.calculaFolha(funcionários);
        
        }
}
