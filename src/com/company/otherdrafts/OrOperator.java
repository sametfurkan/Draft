package com.company.otherdrafts;

import java.util.Iterator;
import java.util.List;

public class OrOperator {
    public static void main(String[] args) {
        boolean condition = true;

        if(condition || conditionFromMethod()){
            System.out.println("short");
        }
        if (condition | conditionFromMethod()){
            System.out.println("single or");
        }
    }

    private static boolean conditionFromMethod(){
        System.out.println("conditionFromMethod çalıştı");
        return false;
    }

    public static void exec(List<String> n, List<Integer> a) {
        Iterator<String> i = n.iterator();
        while (i.hasNext()) {
            System.out.println("-->" + i.next());
        }

        Iterator<Integer> i2 = a.iterator();
        while (i.hasNext()) {
            System.out.println("-->" + i2.next());
        }

    }
}


