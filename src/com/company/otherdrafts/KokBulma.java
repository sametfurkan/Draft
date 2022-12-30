package com.company.otherdrafts;

public class KokBulma {
    private static boolean denklemTuru;
    private static double delta;

    public static double deltaBulma(int a, int b, int c){
        delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }


    public KokBulma() {
        System.out.println("Bu Denklemin Gerçek Kökü Yoktur !");
    }

    public KokBulma(int a, int b, int c){
        System.out.println("İkinci Dereceden Denklememimiz = "+a+"x^2+"+b+"x+"+c+"=0");
        double x1 = 0, x2 = 0;

        if(delta>0) {
            x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
            x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
        }
        else{
            x1 = x2 = (-1)*b/(2*a);
        }
        System.out.print("Birinci kök: "+ x1 +"\n İkinci kök: "+ x2);
    }



    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;
        deltaBulma(a,b,c);
        if(delta>0 || delta == 0) {
            new KokBulma(a, b, c);
        }
        else
            new KokBulma();

    }
}
