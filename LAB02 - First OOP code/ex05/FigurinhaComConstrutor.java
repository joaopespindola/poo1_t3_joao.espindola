package com.mycompany.figurinhacomconstrutor;


public class FigurinhaComConstrutor {

    public static void main(String[] args) {
        String[] jog = new String[11];
        Figurinha neymar = new Figurinha("Brasil");
        Figurinha vinijr = new Figurinha("Brasil");
        Figurinha pedro = new Figurinha("Brasil");
        Selecao brasil = new Selecao("Brasil", "RogerioCeni");
        Selecao argentina = new Selecao("Argentina", "Maradona");           
        neymar.statusFigurinhaPriv();
        vinijr.statusFigurinhaPriv();
        pedro.statusFigurinhaPriv();
        brasil.statusSelecao();
        argentina.statusSelecao();
    }
}
