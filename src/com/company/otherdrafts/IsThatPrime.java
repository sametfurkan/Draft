package com.company.otherdrafts;

import java.util.Scanner;

public class IsThatPrime {


    public static void main(String[] args) {
        IsThatPrime pn = new IsThatPrime();
        System.out.println("Asal olduğunu düşündüğünüz pozitif bir sayı giriniz:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pn.isPrime(n);


    }


    boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 0; i < n; i++) {

            if (n % i == 0) {
                prime = false;
                break;

            }
        }

        if (prime)
            System.out.println(n + " is prime!");
        else
            System.out.println("This is not prime");

    return prime;
    }
}
