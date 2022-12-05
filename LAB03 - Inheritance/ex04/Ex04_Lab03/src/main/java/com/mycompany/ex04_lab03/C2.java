package com.mycompany.ex04_lab03;

public class C2 extends C1{
    public int at1;
    private int at2;
    protected int at3;
    public C2(){
        super();
        //CHAMA O CONSTRUTOR DA CLASSE PROGENITORA
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }
    public C2(int at1, int at2, int at3){
        super();
        System.out.println("Classe C2: chamada do construtor com parametros");
        this.setAt1(at1);
        this.setAt2(at2);
        this.setAt3(at3);
    }  
    @Override
            //@Override POIS O MÉTODO ESTÁ SENDO SOBREPOSTO
    void mostrar_atributos(){
        System.out.println("" + this.getAt1());
        System.out.println("" + this.getAt2());
        System.out.println("" + this.getAt3());
        System.out.println("" + this.getAt1C2());
        System.out.println("" + this.getAt2C2());
        System.out.println("" + this.getAt3C2());
    }
    @Override
    void mostrar_atributos_super(){
        super.mostrar_atributos();
        //CHAMA O METODO DA CLASSE PROGENITORA
        System.out.println("" + this.getAt1());
        System.out.println("" + this.getAt2());
        System.out.println("" + this.getAt3());
    }

    public int getAt1C2() {
        return at1;
    }

    public void setAt1C2(int at1) {
        this.at1 = at1;
    }

    public int getAt2C2() {
        return at2;
    }

    public void setAt2C2(int at2) {
        this.at2 = at2;
    }

    public int getAt3C2() {
        return at3;
    }

    public void setAt3C2(int at3) {
        this.at3 = at3;
    }
    
}
