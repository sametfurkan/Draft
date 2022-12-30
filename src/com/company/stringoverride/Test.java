package com.company.stringoverride;

public class Test {
    public static void main(String[] args) {
        toStringOverride test = new toStringOverride();
        test.make = "Move";
        test.model = "TOGG";
        test.year = "2024";
        test.speed = 180;
        test.distance = 1000;

        System.out.println(test);
        System.out.println(test.toString());

    }
}
