package com.mycompany.ex05_lab03;
import java.util.Scanner;

public class Empresa{
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdChefes;
        qtdChefes = ler.nextInt();
        Funcionario[] chefes = new Funcionario[qtdChefes];
        int qtdVendedor;
        qtdVendedor = ler.nextInt();
        Funcionario[] vendedor = new Funcionario[qtdVendedor];
        int qtdOperario;
        qtdOperario = ler.nextInt();
        Funcionario[] operarios = new Funcionario[qtdOperario];
        int qtdHorista;
        qtdHorista = ler.nextInt();  
        Funcionario[] Horistas = new Funcionario[qtdHorista];
    }
}
