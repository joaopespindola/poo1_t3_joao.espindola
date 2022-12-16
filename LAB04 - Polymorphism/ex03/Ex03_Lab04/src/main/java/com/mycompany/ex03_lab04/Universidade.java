package com.mycompany.ex03_lab04;
    
public class Universidade {
    String nomeUniversidade;
    String dataDeFundacao;

    public Universidade(String nomeUniversidade, String dataDeFundacao) {
        this.nomeUniversidade = nomeUniversidade;
        this.dataDeFundacao = dataDeFundacao;
    }
    
    //(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui (para facilitar, é permitido instanciar os alunos no próprio código)
    public void quantosEstudantes(Estudante alunos[]){
        int graduacao = 0;
        int mestrado = 0;
        int doutorado = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                //instanceof verifica se determinado objeto é de determinada classe
                if(alunos[i] instanceof EstudanteGraduacao){
                    graduacao++;
                }
                if(alunos[i] instanceof EstudanteMestrado){
                    mestrado++;
                }
                if(alunos[i] instanceof EstudanteDoutorado){
                    doutorado++;
                }
            }
        }
        System.out.println("Graduandos: "+ graduacao + '\n' + "Mestrandos: " + mestrado + '\n' + "Doutorandos: " + doutorado);
    }
    
    //(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente o título da tese a linha de pesquisa
    public void mostrarInfoDeTodos(Estudante alunos[]){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                alunos[i].print();
            }
        }
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }
    
    //(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto - 
    //não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos.
    public Estudante[] posGraduandos(Estudante alunos[]){
        int j = 0;
        Estudante vetorDePos[] = new Estudante[100];
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                if(alunos[i] instanceof EstudantePosGrad){
                    vetorDePos[j] = alunos[i];
                    j++;
                }
            }
        }
        return vetorDePos;
    }
}
