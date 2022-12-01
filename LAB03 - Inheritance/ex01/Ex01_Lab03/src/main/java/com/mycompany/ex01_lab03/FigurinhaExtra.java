package com.mycompany.ex01_lab03;


public class FigurinhaExtra {
    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posição;
    private String país;   
    private String categorias;
    private String cor;
    
    public FigurinhaExtra(String nome, String data, float altura, float peso, String posição, String país, String categorias, String cor){//Este é o método construtor
        this.setNome(nome);
        this.setData(data);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setPosição(posição);
        this.setPaís(país);
        this.setCategorias(categorias);
        this.setCor(cor);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
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