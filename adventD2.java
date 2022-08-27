import java.util.Scanner;



public class adventD2 {

    public static void main(String args[]) {
        int horizontal = 0;
        int depth = 0;
        int switchCounter = 0;;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the direction of movement " + "\n" +
                            "\"forward\" for forwards movement, " + 
                            "\"up\" for upwards movement, " +
                            "\"down\" for downwards movement");

        
        String userInputDirection = scan.nextLine();
       
        switch (userInputDirection) {
            case "forward":
            System.out.println("Enter the number of units for forward movement ");
            int userInputHorizontal = scan.nextInt();
            System.out.println("The sub's horizontal position is " + forward(userInputHorizontal, horizontal) + "\n" +
                               "The sub's vertical depth is " + depth);
            break;

            case "up":
            System.out.println("Enter the number of units for upwards movement ");
            int userInputUpwards = scan.nextInt();
            System.out.println("The sub's horizontal position is " + horizontal + "\n" +
                               "The sub's vertical depth is " + up(userInputUpwards, depth));
            break;

            case "down":
            System.out.println("Enter the number of units for downwards movement ");
            int userInputDownwards = scan.nextInt();
            System.out.println("The sub's horizontal position is " + horizontal + "\n" +
                               "The sub's vertical depth is " + down(userInputDownwards, depth));
            break;

            default: 
            System.out.println("Invalid input! ");
            break;
            
        }

    }


    public static int forward(int input, int horizontal) {
           int newHorizontal = 0; 
           newHorizontal = input + horizontal;
           return newHorizontal;

    }



    public static int up(int input, int depth) {
           int newDepth = 0; 
           newDepth = input - depth;
           return newDepth;

    }

    public static int down(int input, int depth) {
        int newDepth = 0; 
        newDepth = input + depth;
        return newDepth;

 }
 
    

    


}