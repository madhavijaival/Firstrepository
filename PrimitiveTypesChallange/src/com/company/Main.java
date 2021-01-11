package com.company;

public class Main {

    public static void main(String[] args) {

        byte Bytevalue = 4;
        short Shortvalue = 21;
        int Intvalue = 100;
        //int mySum = 10 * (Bytevalue + Shortvalue + Intvalue);
        //long myResultvalue = 50000L + mySum;
        long myTotal = 50000L + 10L * (Bytevalue + Shortvalue + Intvalue);
        System.out.println("My Long Result value is =" + myTotal);

        short myShortTotal = (short)(1000 + 10 * (Bytevalue + Shortvalue + Intvalue));

    }
}
