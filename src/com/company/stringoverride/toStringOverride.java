package com.company.stringoverride;

public class toStringOverride {

    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;



    public String toString(){
        String s = new String();
        s += "Car Info\n";
        s += "Make:"+ make +"\n";
        s += "Model:"+ model +"\n";
        s += "Year:"+ year +"\n";
        s += "Speed:"+ speed +"\n";
        s += "Distance:"+ distance +"\n";
        return s;
    }


}
