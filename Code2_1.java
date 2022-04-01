package code2_1;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_1 {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter your E-mail : ");
        String email;
        boolean flag = false;
        int point = 0, atSign = 0;
        // Get E-mail
        email = inPut.nextLine();
        // Check e-mail has '@'
        for (int i = 0; i < email.length(); i++) {
            boolean flag2 = false;
            if ((email.charAt(i) == '@')) {
                flag2 = true;
            }
            if ((i == email.length() - 1) && (flag2 == false)) {
                System.err.println("you must use '@' in E-mail");
                System.exit(0);
            }
        }
        for (int i = 0; i < email.length(); i++) {
            // Check e-mail Stasrt without '_'
            if ((email.charAt(0) == '_')) {
                System.err.println("you Can't use '_' for first character");
                System.exit(-1);
            }
            // Check e-mail Stasrt without number
            if ((email.charAt(0) - 48 <= 9) && (email.charAt(0) >= 48)) {
                System.err.println("you Can't use '0' to '9' for first character");
                System.exit(-3);
            } else if (email.charAt(i) == 46) {
                point = i;
            }
            if (email.charAt(i) == 64) {
                atSign = i;
            }
        }
        // Check count letters after point be 3
        if (email.length() - point > 4) {
            System.err.println("You must use maximum three character after point . ");
            System.exit(-9);
        }
        // Check letters after point be small
        for (int j = point + 1; j < email.length(); j++) {
            if ((email.charAt(j) >= 97) && (email.charAt(j) <= 122)) {
            } else {
                System.err.println("You must use small letters after point. ");
                System.exit(-7);
                flag = false;
            }
        }
        // Check At Sign be before point
        if (atSign > point) {
            System.err.println("You must use At Sign before point . ");
            System.exit(-5);
        }
        // print E-mail
        System.out.println(" Your E-mail address is correct : " + email);

    }

}
