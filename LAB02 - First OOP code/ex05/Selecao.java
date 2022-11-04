package com.mycompany.figurinhacomconstrutor;

public class Selecao {
    private String nomeSelecao;
    private String nomeTecnico;
    private int copasDoMundo;
    String[] jog = new String[11];
    int i;

    public Selecao(String nomeSelecao, String nomeTecnico) {
        this.nomeSelecao = nomeSelecao;
        this.nomeTecnico = nomeTecnico;
        for(i = 0; i < 11; i++){
            //instanciando o vetor de jogadores
            jog[i] = new String();
        }
    }

    public String getSelecao() {
        return nomeSelecao;
    }

    public String getTecnico() {
        return nomeTecnico;
    }
        
    void statusSelecao(){
        System.out.println(this.getSelecao());
        System.out.println(this.getTecnico());
        
    }
}
