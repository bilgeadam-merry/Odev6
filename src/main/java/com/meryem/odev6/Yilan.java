package com.meryem.odev6;

public class Yilan extends Hayvanlar{
    public Yilan(){
        super();
    }

    @Override
    public void sesCikar() {
        System.out.println("tısss!");
    }
    @Override
    public void saldir(){
        System.out.println("yılan dişlerini çıkarıyor.");
    }
    @Override
    public void hareket(){
        System.out.println("yılan kıvrıla kıvrıla sürünüyor");
    }
}
