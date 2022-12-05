package com.mycompany.ex04_lab03;

public class C1 {
    public int at1;
    private int at2;
    protected int at3;
    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }
    public C1(int at1, int at2, int at3){
        System.out.println("Classe C1: chamada do construtor com parametros");
        this.setAt1(at1);
        this.setAt2(at2);
        this.setAt3(at3);
    }  
    void mostrar_atributos(){
        System.out.println("" + this.getAt1());
        System.out.println("" + this.getAt2());
        System.out.println("" + this.getAt3());
    }
    void mostrar_atributos_super(){
        System.out.println("" + this.getAt1());
        System.out.println("" + this.getAt2());
        System.out.println("" + this.getAt3());
    }

    public int getAt1() {
        return at1;
    }

    public void setAt1(int at1) {
        this.at1 = at1;
    }

    public int getAt2() {
        return at2;
    }

    public void setAt2(int at2) {
        this.at2 = at2;
    }

    public int getAt3() {
        return at3;
    }

    public void setAt3(int at3) {
        this.at3 = at3;
    }
    
}
