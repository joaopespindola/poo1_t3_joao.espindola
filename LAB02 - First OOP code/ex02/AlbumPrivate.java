package com.mycompany.albumprivate;

public class AlbumPrivate {

    public static void main(String[] args) {
        FigurinhaPrivate neymar = new FigurinhaPrivate();
            neymar.setNome("Neymar");
            neymar.setData("12/10/1990");
            neymar.setAltura(1.80f);
            neymar.setPeso(75.5f);
            neymar.setPosição("ponta esquerda");
            neymar.setPaís("Brasil");
        FigurinhaPrivate vinijr = new FigurinhaPrivate();
            vinijr.setNome("Vynicius Jr");
            vinijr.setData("12/10/1990");
            vinijr.setAltura(1.80f);
            vinijr.setPeso(75.5f);
            vinijr.setPosição("ponta esquerda");
            vinijr.setPaís("Brasil");
        FigurinhaPrivate pedro = new FigurinhaPrivate();
            pedro.setNome("Pedro");
            pedro.setData("12/10/1990");
            pedro.setAltura(1.80f);
            pedro.setPeso(75.5f);
            pedro.setPosição("centroavante");
            pedro.setPaís("Brasil");
            
        neymar.statusFigurinhaPriv();
        vinijr.statusFigurinhaPriv();
        pedro.statusFigurinhaPriv();
        
    }
}
