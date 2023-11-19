package com.meryem.odev6;

public class Kus extends Hayvanlar {
    public Kus() {
        super();
    }

    @Override
    public void sesCikar() {
        System.out.println("cik cik!");
    }

    @Override
    public void saldir() {
        System.out.println("kuş gagasını vuruyor");
    }

    @Override
    public void hareket() {
        System.out.println("kuş kanatlarını açıp uçuyor.");
    }
}
