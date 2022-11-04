package com.mycompany.albumselecao;

public class Selecao {
    private String nomeSelecao;
    private String nomeTecnico;
    private int copasDoMundo;
    private String jog1;
    private String jog2;
    private String jog3;
    private String jog4;
    private String jog5;
    private String jog6;
    private String jog7;
    private String jog8;
    private String jog9;
    private String jog10;
    private String jog11;
    
    public void setnomeSeleção(String nomeSelecao){
        this.nomeSelecao = nomeSelecao;
    }
    public void setnomeTecnico(String nomeTecnico){
        this.nomeTecnico = nomeTecnico;
    }
    public void setCopasDoMundo(int x){
        this.copasDoMundo = x;
    }
    public void setnomeJog(String jog1){
        this.jog1 = jog1;
    }
    public void setnomeJog2(String jog2){
        this.jog2 = jog2;
    }
    public void setnomeJog3(String jog3){
        this.jog3 = jog3;
    }
    public void setnomeJog4(String jog4){
        this.jog4 = jog4;
    }
    public void setnomeJog5(String jog5){
        this.jog5 = jog5;
    }
    public void setnomeJog6(String jog6){
        this.jog6 = jog6;
    }
    public void setnomeJog7(String jog7){
        this.jog7 = jog7;
    }
    public void setnomeJog8(String jog8){
        this.jog8 = jog8;
    }
    public void setnomeJog9(String jog9){
        this.jog9 = jog9;
    }
    public void setnomeJog10(String jog10){
        this.jog10 = jog10;
    }
    public void setnomeJog11(String jog11){
        this.jog11 = jog11;
    }
    public String getSeleção(){
        return this.nomeSelecao;
    }
    public String getTecnico(){
        return this.nomeTecnico;
    }
    public int getCopas(){
        return this.copasDoMundo;
    }
    public String getjog1(){
        return this.jog1;
    }
    public String getjog2(){
        return this.jog2;
    }
    public String getjog3(){
        return this.jog3;
    }
    public String getjog4(){
        return this.jog4;
    }
    public String getjog5(){
        return this.jog5;
    }
    public String getjog6(){
        return this.jog6;
    }
    public String getjog7(){
        return this.jog7;
    }
    public String getjog8(){
        return this.jog8;
    }
    public String getjog9(){
        return this.jog9;
    }
    public String getjog10(){
        return this.jog10;
    }
    public String getjog11(){
        return this.jog11;
    }
    void statusSelecao(){
        System.out.println(this.getSeleção());
        System.out.println(this.getTecnico());
        System.out.println(this.getCopas());
        System.out.println(this.getjog1());
        System.out.println(this.getjog2());
        System.out.println(this.getjog3());
        System.out.println(this.getjog4());
        System.out.println(this.getjog5());
        System.out.println(this.getjog6());
        System.out.println(this.getjog7());
        System.out.println(this.getjog8());
        System.out.println(this.getjog9());
        System.out.println(this.getjog10());
        System.out.println(this.getjog11());
    }
}
