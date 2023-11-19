package com.meryem.odev6;

public class Hayvanlar {
    public String tur;
    public String ad;
    public String yasamAlani;
    public String beslenmeSekli;
    public int uzunluk;
    public int agirlik;

    public void beslenme(){
        System.out.println("Hayvan besleniyor.");
    }
    public void hareket(){
        System.out.println("Hayvan hareket ediyor.");
    }
    public void sesCikar(){
        System.out.println("Hayvan ses çıkarıyor.");
    }
    public void saldir(){
        System.out.println("hayvan saldırıyor");
    }

    public Hayvanlar() {
    }

    public Hayvanlar(String tur, String ad, String yasamAlani, String beslenmeSekli, int uzunluk, int agirlik) {
        this.tur = tur;
        this.ad = ad;
        this.yasamAlani = yasamAlani;
        this.beslenmeSekli = beslenmeSekli;
        this.uzunluk = uzunluk;
        this.agirlik = agirlik;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "tur='" + tur + '\'' +
                ", ad='" + ad + '\'' +
                ", yasamAlanı='" + yasamAlani + '\'' +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                '}';
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }

    public String getBeslenmeSekli() {
        return beslenmeSekli;
    }

    public void setBeslenmeSekli(String beslenmeSekli) {
        this.beslenmeSekli = beslenmeSekli;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
}
