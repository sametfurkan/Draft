package com.company.personalshema;

public class Main {

    public static void main(String[] args){
        // Çalışan Ekleyelim:
        Employe e1 = new Employe("Faruk","Yıldız");
        GeneralManager g1 = new GeneralManager("Emre","Çelen");
        // Ekrana Yazdırma Komutları:
        System.out.println("--------------\n-> Personel Oluşturuldu\n--------------");
        e1.printInfo();
        System.out.println("--------------\n-> Genel Müdür Oluşturuldu\n--------------");
        g1.printInfo();
        System.out.println("--------------");
    }
}
