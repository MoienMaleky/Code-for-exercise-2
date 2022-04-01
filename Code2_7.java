package code2_7;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_7 {

    public static void main(String[] args) {
        String sentence1, sentence2;
        boolean flag;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter first sentence : ");
        // Get sentence one
        sentence1 = inPut.nextLine();
        System.out.print("Enter second sentence : ");
        // Get sentence two
        sentence2 = inPut.nextLine();
        // Delete space and replace capitol letters with small letters
        sentence1 = sentence1.replace(" ", "");
        sentence2 = sentence2.replace(" ", "");
        sentence1 = sentence1.toLowerCase();
        sentence2 = sentence2.toLowerCase();
        // Check sentences size if those are equals do for
        if (sentence1.length() == sentence2.length()) {
            for (int i = 0; i < sentence1.length(); i++) {
                // Section sentence one
                Character temp = sentence1.charAt(i);
                // Call find
                find(temp, sentence2);
                // Get boolean flag of find
                flag = find(temp, sentence2);
                // If flag is false print error and exit app
                if (flag == false) {
                    System.out.println("You can't ");
                    System.exit(-2);
                }
            }
            // If flag is true print this text
            if (flag = true) {
                System.out.println("You can");
            }
        } // If those are equals print error
        else {
            System.err.println("Your sentences aren't equals");
        }
    }

    public static boolean find(Character temp, String sent) {
        boolean flag = false;
        // Check chracter temp with sentence two
        for (int i = 0; i < sent.length(); i++) {
            if (flag == true) {

            }
            // If temp exist in sentence two return true
            if (sent.charAt(i) == temp) {
                flag = true;
                continue;
            }
        }
        return flag;
    }
}
