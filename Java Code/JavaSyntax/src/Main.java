public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Java is not too bad");
        System.out.println("It's Awesome");
        System.out.println(4382);
        System.out.println(45+85);
        System.out.println(54*2);

       /*
       Types of variables in java
       - String (Stores text)
       - int (stores integers)
       - float (stores floating point numbers)
       - char (store single characters such as 'a' or 'b'
       - boolean
        */

        /* declaring variables in java specify type and assign a value to it
        tyoe variable = value; */
        String name = "Roger";
        System.out.println(name);

        int mynum = 32;
        System.out.println(mynum);

        int mynum2;
        mynum2 = 10;
        System.out.println(mynum2);

        int mynum3 = 20;
        mynum3 = 45; //mynum3 is now 45
        System.out.println(mynum3);

        //final int mynum4 = 32;
        //mynum4 = 64; //cannot find missing variable

        //displaying variables
        String lastName = "Garcia";
        System.out.println("Roger " + lastName);

        String carmodel = " GT500";
        int year = 2022;
        String model = year + carmodel;
        System.out.println(model);

        int x = 5;
        int z = 32;
        System.out.println(x+z);

        //declaring multiple variables
        int q = 5;
        int w = 5;
        int r = 5;
        System.out.println(q+w+r);

       //Shortcut to declare multiple variables
       int l = 5, k = 2, h = 15;
       System.out.println(l+k+h);

       //assigning same value to mutliple variables
        int u,i,o;
        u=i=o=50;
        System.out.println(u + i + o);
    }


}