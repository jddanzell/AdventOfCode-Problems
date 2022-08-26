import java.util.Scanner;



public class adventD2 {

    public static void main(String args[]) {
        int horizontal = 0;
        int depth = 0;
   

        System.out.println(horizontal);

        horizontal = forward(15, horizontal);
        
        System.out.println(horizontal);

        horizontal = forward(15, horizontal);
        
        System.out.println(horizontal);

        horizontal = forward(15, horizontal);
        
        System.out.println(horizontal);
        
        Scanner scan = new Scanner(System.in);
        
       
        switch (depth) {
            case 1: 

            case 2:

            default:
            
        }

        switch (horizontal) {
            case 1: 

            case 2:

            default:
            
        }

        


    }


    public static int forward(int input, int horizontal) {
           int newHorizontal = 0; 
           newHorizontal = input + horizontal;
           return newHorizontal;

    }

    public static int up(int input) {
        input = 0;
        

        return input;

    }

    public static int down(int input) {
        input = 0;
    

    return input;

    }
 
    

    


}