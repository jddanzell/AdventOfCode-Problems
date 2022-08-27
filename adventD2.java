import java.util.Scanner;

// Joshua Danzell
// Advent of Code Day 2 Program - Solved

/* Utilized:
 * Switch / Case Statements
 * Looping Swtich / Case Statement 
 * Scanner Class
 * User Input
 * 
 * TODO: 
 * 
 * Fix default case staement, If invalid input, state the input is invalid and ask for a valid input
 *  Currently: The default case staement will print "Enter the next input " regardless of validity
 * 
 * Account for edge cases
 *  Negative inputs, invalid inputs, input type errors, etc.
 * 
 * 
 * 
 */

public class adventD2 {

    public static void main(String args[]) {        // Main                                                                           
        int horizontal = 0;                         // Creates two integers to store the values for horizontal and depth of the sub
        int depth = 0;
        
        Scanner scan = new Scanner(System.in);      // Creates a scanner to record user input

        System.out.println("Enter the direction of movement: " + "\n" +         // Directions for user on how to control the subs position through the terminal
                            "(\"forward\" for forwards movement, " + 
                            "\"up\" for upwards movement, " +
                            "\"down\" for downwards movement)" + "\n" + 
                            "To calculate the final position, type \"end\".");


        loop:               // loop for the case statements, allows user to input as many 
        while (true) {      // keeps track of whether the loop will be exited or not

        String userInputDirection = scan.nextLine();    // creates the String that records user Input
            switch (userInputDirection) {               // starts the switch statement

                case "forward":                                                                    // forward case statement
                System.out.println("Enter the number of units for forward movement ");          // asks for, then takes value to move the sub forwards given by user (in int)
                int userInputHorizontal = scan.nextInt();

                horizontal = forward(userInputHorizontal, horizontal);                             /*  sets the horizontal value to the user input using hte foward method
                                                                                                    will account for user inputing "foward" consecutively, won't overwrite previous inputs*/

                System.out.println("The sub's horizontal position is now " + horizontal + "\n" +   // prints the current horizontal and depth position of the sub for the user then breaks
                                "The sub's vertical depth is " + depth);
                break;


                case "up":                                                                          // up case statement
                System.out.println("Enter the number of units for upwards movement ");           // asks for, then takes value to move the sub upwards given by user (in int)
                int userInputUpwards = scan.nextInt();

                depth = up(userInputUpwards, depth);                                               /*  sets the depth value to the user input using the foward method
                                                                                                    will account for user inputing "up" consecutively, won't overwrite previous inputs*/

                System.out.println("The sub's horizontal position is " + horizontal + "\n" +       // prints the current horizontal and depth position of the sub for the user then breaks
                                "The sub's vertical depth is now " + depth);
                break;


                case "down":                                                                        // down case statement
                System.out.println("Enter the number of units for downwards movement ");         // asks for, then takes value to move the sub downwards given by user (in int)
                int userInputDownwards = scan.nextInt();

                depth = down(userInputDownwards, depth);                                            /*  sets the horizontal value to the user input using the foward method
                                                                                                     will account for user inputing "down" consecutively, won't overwrite previous inputs*/


                System.out.println("The sub's horizontal position is " + horizontal + "\n" +        // prints the current horizontal and depth position of the sub for the user then breaks
                                "The sub's vertical depth is " + depth);                            
                break;


                case "end":                                                                                      // end case statement, breaks the loop and sends program to the end 
                System.out.println("The subs final position is " + calculateFinalPosition(horizontal, depth));  // prints the final position of the sub using the calculateFinalPosition method
                break loop;


                default:                                           // default case statement
                System.out.println("Enter the next input ");    // tells user to enter the next input (currently not finished)
                break;
            }
        }

    }

    

    public static int forward(int input, int horizontal) {        // forward method
        int newHorizontal = 0;                                    // creates new int to store the new horizontal position after the method is ran
        newHorizontal = input + horizontal;                       // sets newHorizontal to the user's input added to the current horizontal position
        return newHorizontal;                                     // returns the new horizontal position

    }

    public static int up(int input, int depth) {                  // up method
        int newDepth = 0;                                         // creates new int to store the new depth after the method is ran
        newDepth = depth - input;                                 // sets newDepth to the user's input subtracted from the current depth (subtracted because depth is lowered after rising)
        return newDepth;                                          // returns the new depth

    }

    public static int down(int input, int depth) {                // down method
        int newDepth = 0;                                         // creates new int to store the new depth after the method is ran
        newDepth = input + depth;                                 // sets newDepth to the user's input added to the current depth
        return newDepth;                                          // returns the new depth

    }

    public static int calculateFinalPosition(int horizontal, int depth) {       // calculateFinalPosition method, the final position is current horizontal position * current depth
        int finalPosition = 0;                                                  // creates new int to store the final position after the method is run
        finalPosition = horizontal * depth;                                     // sets final position to current horizontal position * current depth
        return finalPosition;                                                   // returns the final position

    }

}