public class Main {
    public static void main(String[] args) {
        /*
        Java Strings
        -- Strings are used for storing text
        -- Length of a string can be found on length()
        -- toUpperCase() & toLowerCase() converts text
        -- indexOf() returns the index of the first occurence of a
           specified text in a string
         */

        String gretting = "Roger";
        System.out.println(gretting);

        String txt = "QWERTYASDFG";
        System.out.println("The length if the txt string is: " + txt.length());

        String text = "Roger Garcia";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String text1 = "Please locate where 'Locate' occurs!";
        System.out.println(text1.indexOf("Locate"));


        //String Concatenation
        //The + operator can be used between strings to combine them
        String firstName = "Roger ";
        String lastname = "Garcia";
        System.out.println(firstName + " " + lastname);
        System.out.println(firstName.concat(lastname));

        /*
        Java Numbers
        2 numbers equals a number
        2 strings will equal a concatenation
        1 number and 1 string will be a string concatenation

         */

        //---------------------------------------------------Java Math
        /*
        Math.max(x,y) and Math.min(x,y) can be used to find the lowest vale of x and y
        Math.abs(x) returns the absolute(positive) value of x
        Math.random() returns a random number between 0 - 1
        Math.sqrt() returns square root
         */

        System.out.println(Math.min(5,30));
        System.out.println(Math.max(5,30));
        System.out.println(Math.sqrt(32));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());

        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);

        //-------------------------------------------------Java boolean
        /*
        boolean can only take true or false
         */

        int myAge = 25;
        int votingAge = 18;

        if(myAge >= votingAge){
            System.out.println("Old enough to vote");
        } else{
            System.out.println("Not old");
        }


    }
}