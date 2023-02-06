package com.mycompany.segundaprova;
        
public class SegundaProva {

    public static void main(String[] args) {
        int n;
        
        Bike[] bicicletas = new Bike[3];
        bicicletas[0] = new Bike(1111, "Specialized", 10, 21, "Shimano");
        //construtor da bike já com as alterações do exercicio 03, ou seja, passando atributos para instanciar a marcha
        bicicletas[1] = new SpeedBike(23, 1112, "Caloi", 10);
        bicicletas[2] = new MountainBike(10, 3, "Hidraulica");
        
        for(int i = 0; i < 3; i++){
            bicicletas[i].acelerar(1);
        }
    }
    //Responda abaixo quais métodos podem ser chamados a partir do vetor criado?
    //Podemos chamar todos os métodos da classe Bike(superclasse), pois suas subclasses herdarao eles
}
