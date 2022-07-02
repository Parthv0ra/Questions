package loopss.src;

import java.util.Scanner;

public class stringcumulativebuilder {
    public static void main(String args[]) {
        int n = 5; //0111
        int pos = 2; //0010
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
     }
   
}
