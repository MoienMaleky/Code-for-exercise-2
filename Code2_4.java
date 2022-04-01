package code2_4;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.print(" Enter your sentence : ");
        // Get a sentence
        sentence = input.nextLine();
        // Call binaryPart
        binaryPart(sentence);
    }

    public static void binaryPart(String sentence) {
        int temp = 0, max = 0, maxO = 0, baseTMax = 0, countA = 0;
        // Find and calculate one and zero
        for (int j = 0, i = sentence.length() - 1; i > 0; i--) {
            // If we have one and zero make number in base two
            if ((sentence.charAt(i) - 48 == 1) || (sentence.charAt(i) - 48 == 0)) {
                if (sentence.charAt(i) - 48 == 1) {
                    temp += 1 * Math.pow(10, j);
                }
                j++;
                if ((sentence.charAt(i - 1) != 49) && (sentence.charAt(i - 1) != 48)) {
                    if (temp > max) {
                        max = temp;
                    }
                    temp = 0;
                    j = 0;
                }
            }
        }
        // If first charater be one use this part and make a other number in base two
        if (sentence.charAt(0) - 48 == 1) {
            temp = 0;
            for (int a = 0; a < sentence.length() - 1; a++) {
                if ((sentence.charAt(a + 1) != 48) && (sentence.charAt(a + 1) != 49)) {
                    countA = a;
                }
            }
            int countAC = countA;
            for (int r = 0; r <= countA; r++, countAC--) {
                if (sentence.charAt(r) - 48 == 1) {
                    temp += 1 * Math.pow(10, countAC);
                }
            }
            // Find big number
            if (temp > maxO) {
                maxO = temp;
                temp = 0;
            }
        }
        if (maxO > max) {
            max = maxO;
        }
        // change base big gest number of two to ten
        for (int k = 0; max != 0; k++) {
            temp = max % 10;
            max /= 10;
            baseTMax += temp * Math.pow(2, k);
        }
        // print this text
        System.out.println("max is : " + baseTMax);
    }
}
