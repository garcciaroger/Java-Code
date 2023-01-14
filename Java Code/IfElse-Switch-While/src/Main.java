public class Main {
    public static void main(String[] args) {
        /*
        Javascript if/else
        ------------------
         */

        //using if statement
        if(454>50){
            System.out.println("454 Is greater than 50");
        }

        int x = 10;
        int y = 15;
        if(y>x){
            System.out.println("y is less than x");
        }

        //using else statement
        int time = 2100;
        if(time < 1200){
            System.out.println("Good Morning");
        } else{
            System.out.println("Good Afternoon");
        }

        //else if else
        if(time < 1200){
            System.out.println("Good Morning");
        } else if(time<1800){
            System.out.println("Good Evening");
        } else{
            System.out.println("Good day");
        }

        //else if short hand
        int hour = 8;
        String result = (hour<12) ? "Good Morning": "Good Afternoon";
        System.out.println(result);

        //-------------------------------Java Switch-------------

        /*
        -switch statement is evaluated once
        -value expression is compared once, match is executed
        -break stops the block from executing
         */

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("What day u talkin about?");
        }

        //-------------------------------Java while loop----------
        // loops through while condition is true
        int i = 0;
        while (i <10){
            System.out.println(i);
            i++;
        }

        /* do/while will test the code block once before checking
           if true
        */
        int q = 0;
        do{
            System.out.println(q);
            q++;
        }
        while(q<25);
        //--------------------------------For Loop---------------
        for (int m = 0; m < 10; m++){
            System.out.println(m);
        }

        for(int p = 0; p <= 10; p = p + 2){
            System.out.println(p); // This code will print even values between 0-10
        }

        //Nested Loops
        for(int v = 1;v<=2;v++){
            System.out.println("Outer: " + v);
        }
            for(int g=1;g<=3;g++){
                System.out.println("Inner: " + g);
            }

        //For-Each Loop
        //Used to loop through elements from arrays
        String[] cars={"Ford", "Chevy", "Nissan", "Audi"};
            for(String t : cars){
                System.out.println(t);
            }
    }
}