package code2_6;

import java.util.Scanner;

/**
 *
 * @author Reza.J
 */
public class Code2_6 {
    public static void main(String[] args) {
        String sentence;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        // Get sentence
        sentence = inPut.nextLine();
        // Call method change
        change(sentence);
    }

    private static void change(String s) {
        String newS = "";
        int temp;
        for (int i = 1; i <= s.length(); i++) {
            int sum = i + 7;
            temp = sum % (s.length());
            newS += s.charAt(temp);
        }
        System.out.println("Sentence with change is : " + newS);
    }
}
