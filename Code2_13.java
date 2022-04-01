package code2_13;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_13 {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        // Get number one
        numberOne = inPut.nextInt();
        // if number one isn't positive print error
        if (numberOne < 0) {
            System.err.println("You must enter positive number");
        }
        System.out.print("Enter a positive number : ");
        // Get number two
        numberTwo = inPut.nextInt();
        // If number to isn't positive print error
        if (numberTwo <= 0) {
            System.err.println("You must enter positive number");
        }
        // Call carmen
        carmen(numberOne, numberTwo);
        // print result
        System.out.println("result = " + carmen(numberOne, numberTwo));
    }

    private static int carmen(int numO, int numT) {
        // If numO equals 0 return result
        if (numO == 0) {
            numT++;
            return numT;
        }
        // If numT equals 0 do calculate
        else if (numT == 0) {
            numO--;
            numT = 1;
        }
        // If numO and numT positive do calculate and recursive
        else if ((numO > 0) && (numT > 0)) {
            return carmen((numO - 1), carmen(numO, numT - 1));
        }
        return carmen(numO, numT);
    }
}
