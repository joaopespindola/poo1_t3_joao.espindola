package com.mycompany.ex02_lab03;


public class FigurinhaExtra extends Figurinha{  
    private String categorias;
    private String cor;
    
    public FigurinhaExtra(String nome, String data, float altura, float peso, String posição, String país, String categorias, String cor){//Este é o método construtor
        super(nome, data, altura, peso, posição, país);// o super chama o construtor da superclasse, sendo assim, devemos passar como parâmetro os atributos necessários para a superclasse
        this.setCategorias(categorias);
        this.setCor(cor);
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    void MostrarFigurinha(){
                System.out.println(this.getNome());
                System.out.println(this.getData());
                System.out.println(this.getAltura());
                System.out.println(this.getPeso());
                System.out.println(this.getPosição());
                System.out.println(this.getPaís());
                System.out.println(this.getCategorias());
                System.out.println(this.getCor());
    }
    
    
}