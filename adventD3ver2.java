import java.util.ArrayList;


/* 
 * 
 * 
 * 00100
 * 11110
 * 10110
 * 10111
 * 10101
 * 01111
 * 00111
 * 11100
 * 10000
 * 11001
 * 00010
 * 01010
 * Read all the arrays, push each value into a unique stack, compare frequency of stack 1 0, save it as first # in new array, pop off stack, compare next, at the end
 * save that array then create new array with each value switched
 * 
 * 
*/

public class adventD3ver2 {
    public static void main(String[] args) {                         // main method

        int finalNumber = 0;


        ArrayList<Integer> binaries = new ArrayList<Integer>();      // creates an ArrayList to store the given Binary Values
        binaries.add(00100); //64
        binaries.add(11110); 
        binaries.add(10110);
        binaries.add(10111);
        binaries.add(10101);
        binaries.add(01111); //585
        binaries.add(00111); //73
        binaries.add(11100);
        binaries.add(10000);
        binaries.add(11001);
        binaries.add(00010); //8
        binaries.add(01010); //520

        System.out.println(00100);

        System.out.println(binaries);
        
        System.out.println(frequencyCounter(binaries));

       

    }

    public static int frequencyCounter(ArrayList<Integer> binaries) {

                int oneCounter = 0;
                int zeroCounter = 0;

                int totalOneCounter = 0;
                int totalZeroCounter = 0;

                int substringOne = 0;
                int substringTwo = 1;

                int firstDigit = 0;


                for (int i = 0; i < 5; i++) {

                    for (int j = 0; j < binaries.size(); j++) {
          
                        int numberPassedIn = binaries.get(j);
                        String s = Integer.toString(binaries.get(j));  

                        if (s.length() < 5) {
                            zeroCounter++;
                        } else {
                            firstDigit = Integer.parseInt(Integer.toString(numberPassedIn).substring(substringOne, substringTwo));
                        }

                                                          
                        if (firstDigit == 1) {
                            oneCounter++;
                        } else {
                            zeroCounter++;
                        }                  
            
                    }
                    if (oneCounter > zeroCounter) {
                        totalOneCounter++;
                    } else {
                        totalZeroCounter++;
                    }
                    
                    substringOne++;
                    substringTwo++;

                    oneCounter = 0;
                    zeroCounter = 0;

                }

           return totalOneCounter;
    }
    
    public static int finalFrequencyCalculator(ArrayList<Integer> binaries) {
        int returnValue = 0;

        
        return returnValue;
    }
}





