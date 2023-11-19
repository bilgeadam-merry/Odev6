package com.meryem.odev6;

public class Runner {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        Balik balik = new Balik();
        Kus kus = new Kus();
        Yilan yilan = new Yilan();

        // Hayvanlar hakkında bilgileri gösterelim
        System.out.println("Kedi türü: " + kedi.getTur());
        kedi.sesCikar();
        kedi.beslenme();
        kedi.hareket();

        System.out.println("\nBalık türü: " + balik.getTur());
        balik.sesCikar();
        balik.beslenme();
        balik.hareket();

        System.out.println("\nKuş türü: " + kus.getTur());
        kus.sesCikar();
        kus.beslenme();
        kus.hareket();

        System.out.println("\nYılan türü: " + yilan.getTur());
        yilan.sesCikar();
        yilan.beslenme();
        yilan.hareket();
    }
}
