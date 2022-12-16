package com.mycompany.ex03_lab04;

public class EstudantePosGrad extends Estudante {
    private String formacao; // curso  de graduação que o estudante formou
    private String linhadDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhadDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhadDePesquisa = linhadDePesquisa;
    }


    public void print() {
        super.print();
        System.out.println("Pós-graduação" + '\n' + "Formação: " + getFormacao() + '\n' + "linhadDePesquisa: " + getLinhadDePesquisa());
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhadDePesquisa() {
        return linhadDePesquisa;
    }

    public void setLinhadDePesquisa(String linhadDePesquisa) {
        this.linhadDePesquisa = linhadDePesquisa;
    }
}
