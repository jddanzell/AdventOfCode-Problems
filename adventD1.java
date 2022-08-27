import java.util.ArrayList;

// Joshua Danzell
// Advent of Code Day 1 Program - Solved

/* Utilized:
 * ArrayList
 * 
 * 
 * 
 */

/*  Given Values
199 (N/A - no previous measurement)
200 (increased)
208 (increased)
210 (increased)
200 (decreased)
207 (increased)
240 (increased)
269 (increased)
260 (decreased)
263 (increased)
 */

public class adventD1 {
    public static void main(String[] args) {                        // main method
        ArrayList<Integer> numbers = new ArrayList<Integer>();      // creates an ArrayList to store the given Depth Values
        numbers.add(199);  // N/A - no previous                     // list of depth values to be added to the numbers ArrayList
        numbers.add(200);  // increased
        numbers.add(208);  // increased
        numbers.add(210);  // increased
        numbers.add(200);  // decreased
        numbers.add(207);  // increased
        numbers.add(240);  // increased
        numbers.add(269);  // increased
        numbers.add(260);  // decreased
        numbers.add(263);  // increased

        System.out.println("There were " + depthIncreaseCounter(numbers) + " recorded depth increases.");
        // runs depthIncreaseCounter method on the numbers ArrayList, returns the number of depth increases
    }

    public static int depthIncreaseCounter(ArrayList<Integer> numbers) {        // method to count # of increases
        int timesIncreased = 0;                                         // integer to record # of times increased
        for (int i = 0; i < numbers.size() - 1; i++) {                  // for loop to count through the #'s ArrayList
            if (numbers.get(i) < numbers.get(i + 1)) {                  // if next number is greater
               timesIncreased++;                                        // timesIncreased is incremented by 1
            }
        }
        return timesIncreased;                                          // default return statement
    }

}