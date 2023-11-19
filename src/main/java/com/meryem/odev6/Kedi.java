package com.meryem.odev6;

public class Kedi extends Hayvanlar{
    public Kedi() {
        super();
    }

    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
    @Override
    public void saldir(){
        System.out.println("kedi pençelerini çıkarıyor.");
    }
    @Override
    public void hareket(){
        System.out.println("kedi ayaklarıyla yürüyor");
    }
}
