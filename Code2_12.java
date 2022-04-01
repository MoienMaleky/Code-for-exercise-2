package code2_12;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_12 {

    public static void main(String[] args) {

        int number1, number2;
        int max = 0, low = 0, result = 0;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter first number : ");
        // Get first number
        number1 = inPut.nextInt();
        System.out.print(" Enter second number : ");
        // Get Second number
        number2 = inPut.nextInt();
        // Find biggest number
        if (number1 > number2) {
            max = number1;
            low = number2;
        } else if (number1 < number2) {
            max = number2;
            low = number1;
        }
        // Send max and low to lcm
        lcm(max, low);
        result = lcm(max, low);
        // print LMC
        System.out.println("LMC = " + result);
    }

    public static int lcm(int max, int low) {
        // If low number equals zero return LCM
        if (low == 0) {
            return max;
        }
        // If low number doesn't zero do calculation and call itself
        int result = max % low;
        max = low;
        low = result;
        return lcm(max, low);
    }
}
