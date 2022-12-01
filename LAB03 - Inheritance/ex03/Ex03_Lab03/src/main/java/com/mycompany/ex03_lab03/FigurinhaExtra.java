package com.mycompany.ex03_lab03;


public class FigurinhaExtra extends Figurinha{  
    private String categorias;
    private String cor;
    
    public FigurinhaExtra(Figurinha x, String categorias, String cor){//Este é o método construtor
        super(x.getNome(), x.getData(), x.getAltura(), x.getPeso(), x.getPosição(), x.getPaís());// o super chama o construtor da superclasse, sendo assim, devemos passar como parâmetro os atributos necessários para a superclasse
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
    
    @Override//indica que o método está sendo sobreposto, no caso, ao "MostrarFigurinha" da classe Figurinha
    void MostrarFigurinha(){
                super.MostrarFigurinha();
                System.out.println(this.getCategorias());
                System.out.println(this.getCor());
    }
    
    
}