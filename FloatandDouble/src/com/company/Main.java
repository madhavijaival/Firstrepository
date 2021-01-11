package com.company;

public class Main {

    public static void main(String[] args) {

        float myFloatminvalue = Float.MIN_VALUE;
        float myFloatmaxvalue = Float.MAX_VALUE;
        System.out.println("Float minimum value =" +myFloatminvalue);
        System.out.println("Float maximum value =" +myFloatmaxvalue);

        double myDoubleminvalue = Double.MIN_VALUE;
        double myDoublemaxvalue = Double.MAX_VALUE;
        System.out.println("Double minimum value" +myDoubleminvalue);
        System.out.println("Double maximum value" +myDoublemaxvalue);

        int myIntvalue = 5 / 3 ;
        float myFloatvalue = 5f / 3f;
        double myDoublevalue = 5.00 / 3.00;
        System.out.println("MyIntvalue =" +myIntvalue);
        System.out.println("MyFloatvalue = " +myFloatvalue);
        System.out.println("MyDoublevalue =" +myDoublevalue);

        double numberofpound = 200d;
        double convertedkilograms = numberofpound * 0.45359237d;

        System.out.println("The number of Pounds  = " +numberofpound );
        System.out.println("Converted Pound to Kilogram is  =" +convertedkilograms);

        double pi = 3.1415927d;
        double anotherNumber = 300_00_7.4_1_3_50d;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
