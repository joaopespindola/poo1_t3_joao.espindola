package com.mycompany.ex03_lab04;

public class Ex03_Lab04 {

    public static void main(String[] args) {
        Universidade UFU = new Universidade("UFU", "14/08/1969");
        Estudante[] alunos = new Estudante[100];
        alunos[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        alunos[1] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        alunos[4] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        alunos[5] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        alunos[2] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        alunos[3] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        UFU.quantosEstudantes(alunos);
        UFU.mostrarInfoDeTodos(alunos);
        Estudante[] vetorDePos = UFU.posGraduandos(alunos);
        UFU.mostrarInfoDeTodos(vetorDePos);
       
    }
}
