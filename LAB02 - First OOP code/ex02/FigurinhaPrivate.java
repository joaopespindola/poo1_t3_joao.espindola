package com.mycompany.albumprivate;


public class FigurinhaPrivate {
    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posição;
    private String país;   
    
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
    
    void statusFigurinhaPriv(){
                System.out.println(this.getNome());
                System.out.println(this.getData());
                System.out.println(this.getAltura());
                System.out.println(this.getPeso());
                System.out.println(this.getPosição());
                System.out.println(this.getPaís());
    }
}
