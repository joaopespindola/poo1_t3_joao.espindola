package com.mycompany.ex02_lab03;


public class Figurinha {
    protected String nome;
    protected String data;
    protected float altura;
    protected float peso;
    protected String posição;
    protected String país;   
    
    public Figurinha(String nome, String data, float altura, float peso, String posição, String país){//Este é o método construtor
        this.setNome(nome);
        this.setData(data);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setPosição(posição);
        this.setPaís(país);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    public float getAltura(){        
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){        
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public String getPosição(){        
        return this.posição;
    }
    public void setPosição(String posicao){
        this.posição = posicao;
    }
    public String getPaís(){        
       return this.país; 
    }
    public void setPaís(String pais){
        this.país = pais;
    }
    
    void MostrarFigurinha(){
                System.out.println(this.getNome());
                System.out.println(this.getData());
                System.out.println(this.getAltura());
                System.out.println(this.getPeso());
                System.out.println(this.getPosição());
                System.out.println(this.getPaís());
    }
}