public class main {
    public static void main(String[] args){

        //Student grades
        int studentGrades[]={97,91,92,93,98,92};
        int sum = 0;
        double averageGrade = 0;

        //Calculating average grades
        for(int i=0;i<studentGrades.length;++i){
           sum += studentGrades[i];
           averageGrade = sum/studentGrades.length;
        }
        
        //Calculating Letter Grade
        if(averageGrade > 90){
            System.out.println("A");
        }else if(averageGrade < 89 && averageGrade >80){
            System.out.println("B");
        }else if(averageGrade < 79 && averageGrade >70){
            System.out.println("C");
        }else if(averageGrade < 69 && averageGrade >60){
            System.out.println("D");
        }
        else if(averageGrade < 59){
            System.out.println("You Failed");
        }
    }
}
