package com.meryem.odev6;

public class Balik extends Hayvanlar{
    public Balik(){
        super();
    }

    @Override
    public void sesCikar() {
        System.out.println("blup blup!");
    }

    @Override
    public void hareket(){
        System.out.println("balık yüzüyor");
    }
}
