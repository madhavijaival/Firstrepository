package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 2 + 1;
        System.out.println("2 + 1 ="+result);
        int previousresult = result;
        System.out.println("Previous Result = "+previousresult);

        result = result - 1; //3 -1 = 2
        System.out.println("3 - 1 = "+result);
        System.out.println("Previous Result = "+previousresult);
        result = result * 40 ; //2 * 40 = 80
        System.out.println("2 * 40 = " +result);
        result = result / 4; //80 / 4 =20
        System.out.println("80 / 4 = " +result);
        result = result % 12;
        System.out.println("20 % 12 = "+result);


        //********Abbreviating Operators*******//

        //result= result + 1
        result++;//8 + 1 = 9
        System.out.println("8 + 1 = "+result);
        //result= result - 1
        result--; //9 - 1 = 8
        System.out.println("9 - 1 = "+result);
        //result= result + 2
        result += 2; //8+2=10
        System.out.println("8 + 2 = "+result);
        //result= result * 3
        result *= 3; //10*3 =30
        System.out.println("10 * 3 = "+result);
        //result= result/ 6
        result /= 6; //30/6=5
        System.out.println("30 / 6 = "+result);
        //result= result - 4
        result -= 4;
        System.out.println("5 - 4 = "+result);


        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And am scared of aliens");
        }

        int topscore = 80;
        if(topscore < 100) {
            System.out.println("You got the high score!");
        }
        int secondtopscore = 60;
        if ((secondtopscore < topscore) && (topscore < 100)) {
            System.out.println("Top score is greater than second top score and less than 100  ");
        }
        if((topscore > 90) || (secondtopscore <=90)) {
            System.out.println("Either or both condition are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is Correct value");
        }

        boolean isCar = false;
        if(isCar)
         //if(!isCar)
        //if(isCar != true)
            {
            System.out.println("This is not suppose to happen");
        }
       //Ternary Operator//
       isCar = true;
        boolean wasCar =isCar ? true:false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenorOver =ageOfClient == 20 ? true:false;
        if(isEighteenorOver)
        {
            System.out.println("isEighteenorOver is true");
        }



    }
}
