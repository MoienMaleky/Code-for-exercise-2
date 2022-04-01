package code2_8_decryption;
import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_8_Decryption {
    public static void main(String[] args) {
        String pin;
        int aski;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter your pin : ");
        // Get pin
        pin = inPut.nextLine();
        // Sever for do change
        for (int i = 0, j = 0; i < pin.length(); i++) {
            // Change character to integer
            Character temp = pin.charAt(i);
            aski = (int) temp;
            // make change
            if ((aski >= 100) && (aski <= 122)) {
                aski -= 3;
            } else if ((aski >= 68) && (aski <= 90)) {
                aski -= 3;
            } else if ((aski >= 97) && (aski <= 99)) {
                aski += 23;
            } else if ((aski >= 65) && (aski <= 67)) {
                aski += 23;
            }
            // change integer to character
            temp = (char) aski;
            // Replace character in string
            pin = pin.replace(pin.charAt(i), temp);
        }
        // print pin with change
        System.out.println("your pin with change is : " + pin);
    }
    
}
