package com.mycompany.ex04_lab03;

public class Ex04_Lab03 {

    public static void main(String[] args) {
        C1 c1 = new C1();
        C1 c1ComConstrutor = new C1(1,1,1);
        C2 c2 = new C2();
        C2 c2ComConstrutor = new C2(2,2,2);
        C3 c3 = new C3();
        C3 c3ComConstrutor = new C3(3,3,3);
        
        c1.mostrar_atributos();
        c1ComConstrutor.mostrar_atributos();
        c2.mostrar_atributos();
        c2ComConstrutor.mostrar_atributos();
        c3.mostrar_atributos();
        c3ComConstrutor.mostrar_atributos();
        
        c1.mostrar_atributos_super();
        c1ComConstrutor.mostrar_atributos_super();
        c2.mostrar_atributos_super();
        c2ComConstrutor.mostrar_atributos_super();
        c3.mostrar_atributos_super();
        c3ComConstrutor.mostrar_atributos_super();
    }
}
