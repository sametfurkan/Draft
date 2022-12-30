package com.company.otherdrafts;

import java.util.Scanner;

public class FiizBuzz {


    public static void fizzBuzz(){

        Scanner sayi = new Scanner(System.in);
        int sinir = sayi.nextInt();

        for(int i = 0; i<sinir ; i++){

            if(i%3 == 0 && i%5 == 0){

                String sonuc = (i==0) ? String.valueOf(i) : "FizzBuzz";
                System.out.println(sonuc);
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else
                System.out.println(i);


        }

    }

    public static void main(String[] args) {
        FiizBuzz game = new FiizBuzz();
        game.fizzBuzz();

    }
}
