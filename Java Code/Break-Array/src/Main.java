public class Main {
    public static void main(String[] args) {
        //Break can be used to jump out of a loop
        for(int i = 0; i < 15; i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        //continue statement breaks one interation of the loop if true (Skips)
        for(int i = 0; i < 15; i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        //Example of Break/Continue in while loop
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
            if (x == 4) {
                break;
            }
        }

        //---------------------------Arrays---------------------//
        String[] fordModels = {"GT500","GT350","GT","MACH1","BULLET"};
        System.out.println(fordModels[0]); //create array with strings

        int[] myNum = {5,10,15,20,25,30};
        System.out.println(myNum[0]); //create array with number

        //acessing elements of array
        String[] fordf150 = {"Lariat","Raptor","Platinum","Tremor","XLT"};
        System.out.println(fordf150[3]); //output is tremor

        //changing array element
        String[] chevyModel = {"Camaro","Corvette","Malibu","Silverado"};
        chevyModel[1] = "traverse";
        System.out.println(chevyModel[1]);

        //get the length of the array
        System.out.println(fordModels.length);

        //-----------------------Looping through array
        String[] food = {"Pizza", "Hamburger", "Soup", "Steak"};
        for (int m = 0; m < food.length; m++) {
            System.out.println(food[m]);
        }

        //for-each
        String[] countires = {"Germany", "Argentina", "Italy", "Brazil"};
        for(String f : countires){
            System.out.println(f);
        }

        //--------------------Multidimensional Arrays
        //useful for creating things such as tables and rows
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        System.out.println(myNumbers[1][2]);// output is 7 

        //changing the value of the elements
        int[][] myints = {{2,4,6,8}, {10,12,14}};
        myints[1][2] = 9;
        System.out.println(myints[1][2]);

        //looping through a mutli array
        int[][] nums = {{1,2,3,4,5}, {6,7,8,9}};
        for(int i = 0; i<nums.length; ++i){
            for(int j = 0; j < nums[i].length; ++j){
                System.out.println(nums[i][j]);
            }
        }
    }
}