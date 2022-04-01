package code2_2;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_2 {
    public static void main(String[] args) {

        String sentence1, sentence2;
        boolean equal = false, number = false, synbol = false;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a sentence : ");
        // Get first sentence
        sentence1 = input.nextLine();
        // Check sentence size
        if (sentence1.length() < 8) {
            // If Size lesser eight print this error
            System.err.println("You must use 8 character or more than 8 in first sentence");
            System.exit(-1);
        }
        // Call number method
        number(sentence1);
        // Get result of number
        number = number(sentence1);
        // If number result is false print this error
        if (number == false) {
            System.err.println("You must use a number in first sentence ");
            System.exit(-3);
        }
        // Call synbol method
        synbol(sentence1);
        // Get result of synbol
        synbol = synbol(sentence1);
        // If synbol result is false print this error
        if (synbol == false) {
            System.err.println("You must use a synbol in first sentence ");
            System.exit(-3);
        }
        System.out.print("Enter a sentence : ");
        // Get second sentence
        sentence2 = input.nextLine();
        // Check sentence size
        if (sentence2.length() < 8) {
            // If Size lesser eight print this error
            System.err.println("You must use 8 character or more than 8 in secend sentence");
            System.exit(-5);
        }
        // Call number method
        number(sentence2);
        // Get result of number
        number = number(sentence2);
        // If number result is false print this error
        if (number == false) {
            System.err.println("You must use a number in secend sentence");
            System.exit(-7);
        }
        // Call synbol method
        synbol(sentence2);
        // Get result of synbol
        synbol = synbol(sentence2);
        // If synbol result is false print this error
        if (synbol == false) {
            System.err.println("You must use a synbol in secend sentence  ");
            System.exit(-7);
        }
        // Call equal method
        equal(sentence1, sentence2);
        // Get result of equal
        equal = equal(sentence1, sentence2);
        // If equal result is false print this error
        if (equal == true) {
            System.out.println("sentence one equal sentence two ..! ");
        }
    }

    public static boolean number(String sentence) {
        boolean flag = false;
        // Check sentences for exist number
        for (int i = 0; i < sentence.length(); i++) {
            // If sentence has a number flag change to true
            if ((sentence.charAt(i) - 48 >= 0) && (sentence.charAt(i) - 48 <= 9)) {
                flag = true;
            }
        }
        // return flage
        return flag;
    }

    public static boolean synbol(String sentence) {
        boolean flag = false;
        // Check sentences for exist synbol
        for (int i = 0; i < sentence.length(); i++) {
            // If sentence has a synbol flag change to true
            if ((sentence.charAt(i) < 48) || (sentence.charAt(i) > 57) || (sentence.charAt(i) < 65)
                    || (sentence.charAt(i) > 90)) {
                if ((sentence.charAt(i) < 97) || (sentence.charAt(i) > 122) || (sentence.charAt(i) < 48)) {
                    if ((sentence.charAt(i) > 57)) {
                        flag = true;
                    }
                }
            }
        }
        // return flag
        return flag;
    }

    public static boolean equal(String sentence1, String sentence2) {
        boolean flag = true;
        // Check chracter sentence one and character sentence two
        for (int i = 0; i < sentence1.length(); i++) {
            if (sentence1.charAt(i) != sentence2.charAt(i)) {
                // If have a difference character flag change to false
                flag = false;
            }
        }
        // return flag
        return flag;
    }
}
