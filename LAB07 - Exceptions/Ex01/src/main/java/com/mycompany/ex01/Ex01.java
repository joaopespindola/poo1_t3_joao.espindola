package com.mycompany.ex01;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario Joao = new Funcionario(40000);
        try{
            double x = sc.nextDouble();
            Joao.aumentarSalario(x);
        }
        catch(NegativoException e){
            System.out.println("" + e.mensagem);
        }
        catch(UltrapassaTetoException e){
            System.out.println("" + e.mensagem);
        }
        finally{
            Joao.getSalario();
        }
    }
}
