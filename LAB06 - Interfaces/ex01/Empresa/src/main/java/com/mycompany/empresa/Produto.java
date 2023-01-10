package com.mycompany.empresa;

public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public boolean eMenorQue(Classificavel obj) {
        //Faz o casting do "tipo" Classificável para Produto
        Produto compara = (Produto) obj;
        //acessando só o atributo codigo
        if(this.codigo < compara.codigo){
            return true;
        }
        else{
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
