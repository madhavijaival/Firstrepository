package com.company;

public class Main {

    public static void main(String[] args) {
	double Firstvalue = 20.00d;
	double Secondvalue = 80.00d;
	double Resultvalue = 100.00d * (Firstvalue + Secondvalue);
        System.out.println("The Resultvalue is ="+Resultvalue);
	double Remainder = Resultvalue % 40.00d;
        System.out.println("The Remainder is ="+Remainder);


        boolean isNoRemainder = Remainder == 0 ? true: false;
        System.out.println("isNoRemainder = "+isNoRemainder);
        //if(isNoRemainder)
        if(!isNoRemainder)
        {
            System.out.println("Got some Remainder");
        }


    }
}
