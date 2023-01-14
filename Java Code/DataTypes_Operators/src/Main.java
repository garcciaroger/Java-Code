public class Main {
    public static void main(String[] args) {
        /*
        2 groups of data types
        -- Primiative Data type
            --- btye, short, int, long, float, double, boolean ect
        -- non-primative data
            --- String, Arrays, Classes
        */

        //examples
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //floating point typles
        float num = 5.75f;
        System.out.println(myNum);

        //double example
        double num2 = 55.99d;
        System.out.println(num2);

        //scientific number
        float e1 = 45e2f;
        double w1 = 7e5d;
        System.out.println(e1);
        System.out.println(w1);

        //boolean type --Either true or false
        boolean isJavaFun = true;
        boolean PAonPizza = false;
        System.out.println(isJavaFun);
        System.out.println(PAonPizza);

        /*
        Java Characters

        Char data type is used to store a SINGLE character. Use only
        single quotations ''
        */
        char myGrade = 'B';
        System.out.println(myGrade);

        //String
        String gretting = "Hello Roger!";
        System.out.println(gretting);

        /*
        Non-Primiative Data types
        --created by the programmer and used to call methods to perfrom
        certian operations that primative types cant.
        --Starts with lower case letter and always has a value
        */


        /*
        Widening Casting
        --Done automatically when passing a smalller size type to a large
        size type
         */
        int myInt = 9;
        double myDouble = myInt; //Auto casting int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        /*
        Narrowing Casting
        --Must be done manually by placing the type in parentheses
        in front of the value
         */
        double meDouble = 9.50d;
        int meInt = (int) meDouble; //Manual casting: double to int

        System.out.println(meDouble);
        System.out.println(meInt);

        //Java Operators
        int q = 50 + 30;
        System.out.println(q);

        int sum1 = 50 + 50;
        int sum2 = sum1 + 100;
        int sum3 = sum2 + sum1;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        //Assignment Operators
        int y = 25;
        y += 5; //Adds a value to a variable
        System.out.println(y);

        // logical && - returns true if both statements are true
        // logical || - returns true if one of the statements is true
        // logical ! - reverse the result, return false if the result is true





    }
}