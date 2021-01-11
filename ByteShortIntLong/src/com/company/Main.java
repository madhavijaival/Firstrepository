package com.company;

public class Main {

    public static void main(String[] args) {


        int myValue = 10000;
        int myIntminvalue = Integer.MIN_VALUE;
        int myIntmaxvalue =	Integer.MAX_VALUE;

        System.out.println("Minimum value of Integer ="+myIntminvalue);
        System.out.println("Maximum value of Integer ="+myIntmaxvalue);
        System.out.println("Busted maximum value ="+(myIntmaxvalue+1));
        System.out.println("Busted minimum value ="+(myIntminvalue-1));

        int maxIntTest = 2_147_483_647;

        byte myByteminvalue = Byte.MIN_VALUE ;
        byte myBytemaxvalue = Byte.MAX_VALUE ;

        System.out.println("Byte Minimum value =" +myByteminvalue);
        System.out.println("Byte Maximum value ="+myBytemaxvalue);

        short myShortminvalue = Short.MIN_VALUE;
        short myShortmaxvalue = Short.MAX_VALUE;
        System.out.println("Short minimum value ="+myShortminvalue);
        System.out.println("Short maximum value ="+myShortmaxvalue);

        long myLongvalue = 100L;

        long myLongminvalue = Long.MIN_VALUE;
        long myLongmaxvalue = Long.MAX_VALUE;
        System.out.println("Long minimum value ="+myLongminvalue);
        System.out.println("Long maximum value ="+myLongmaxvalue);

        long bigLongliteralvalue = 2_147_483_6473421L;
        System.out.println(bigLongliteralvalue);

        short bigLiteralvalue = 32767;

        int myTotal = (myIntminvalue / 2);
        byte myNewBytevalue = (byte)(myByteminvalue / 2);
        short myNewShortvalue = (short)(myShortminvalue / 2);



    }

}
