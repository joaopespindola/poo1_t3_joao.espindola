package com.mycompany.empresa;

public class Empresa {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        Cliente[] clientes = new Cliente[3];
        Servico[] servicos = new Servico[3];
        
        produtos[0] = new Produto(12111);
        produtos[1] = new Produto(14571);
        produtos[2] = new Produto(8971);
        
        clientes[0] = new Cliente("João");
        clientes[1] = new Cliente("Alberto");
        clientes[2] = new Cliente("Bruna");
        
        servicos[0] = new Servico(55.99);
        servicos[1] = new Servico(41);
        servicos[2] = new Servico(12);
        
        Classificador.ordena(servicos);
        Classificador.ordena(clientes);
        Classificador.ordena(produtos);
        
        for(int i = 0; i < 3; i++){
            System.out.println("" + produtos[i].getCodigo());
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println("" + clientes[i].getNome());
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println("" + servicos[i].getPreco());
        }
    }
}
