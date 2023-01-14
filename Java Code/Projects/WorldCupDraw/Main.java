import org.apache.commons.lang.ArrayUtils;

public class Main{
    public static void main(String[] args){
        
        //World cup qualifications for 48 teams
        String[] UEFA = {"Germany", "England", "France", "Spain", "Portugal", "Sweden"
                        ,"Belgium", "Netherlands", "Denmark", "Cezeh Republic", "Ukraine"
                        ,"Russia", "Croatia", "Italy", "Finland", "Poland"};
        String[] CAF = {"Egypt", "Senegal", "Morocco", "Nigeria", "Ghana", "Algeria", 
                       "South Africa", "DRC", "Mali"};
        String[] AFC = {"Japan", "South Korea", "China", "Australia", "Saudi Arabia", "Iran"
                        ,"North Korea", "Vietnam"};
        String[] CONCACAF = {"USA", "Mexico", "Canada", "Jamaica", "Salvador", "Guatemala"};
        String[] CONMEBOL = {"Argentina", "Brazil", "Uruguay", "Chile", "Colombia", "Peru"};
        String[] OFC = {"New Zeland", "Tahiti", "Soloman Islands"};

        //Setting the teams into 6 pots with 8 teams in each
        String[] pot1 ={};
        String[] pot2 ={};
        String[] pot3 ={};
        String[] pot4 ={};
        String[] pot5 ={};
        String[] pot6 ={};
    
        //Group Stages (12 groups)
        String[] groupA ={};
        String[] groupB ={};
        String[] groupC ={};
        String[] groupD ={};
        String[] groupE ={};
        String[] groupF ={};
        String[] groupG ={};
        String[] groupH ={};
        String[] groupI ={};
        String[] groupJ ={};
        String[] groupK ={};
        String[] groupL ={};

        //Combining arrays into one
        String[] combined = ArrayUtils.addAll(UEFA, CAF);
        System.out.println(combind);





    }        
}

