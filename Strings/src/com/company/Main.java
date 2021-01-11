package com.company;

public class Main {

    public static void main(String[] args) {
	     // byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String mystring = "I like JAVA";
        System.out.println("My first string is =" +mystring);
        mystring = mystring+",also like to do programming";
        System.out.println("My 2nd string is ="+mystring);
        mystring = mystring + "\u00A9";
        System.out.println("My 3rd string is ="+mystring);

        String myFirstname  = "Madhavi";
        String myLastname = "Jaival";
        String add = myFirstname + myLastname;
        System.out.println("My name is ="+add);

        int mynumber = 201;
        String newstring = "311";
        String myTotal= newstring + mynumber;
        System.out.println("My 4th String is =" +myTotal);

        double doublenumber = 262.30d;
        myTotal = myTotal + doublenumber;
        System.out.println("The last String is ="+myTotal);


    }
}
