package code2_15;

import java.util.*;

/**
 *
 * @author Reza.J
 */
public class Code2_15 {
    public static void main(String[] args) {
        int size = 0;
        Scanner inPut = new Scanner(System.in);
        System.out.print("Enter a number for limited array : ");
        // Get number for limited the array
        size = inPut.nextInt();
        int[] number = new int[size];
        // Get array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number for array : ");
            number[i] = inPut.nextInt();
        }
        // Call number method
        System.out.println(Arrays.toString(outPut(number)));
    }

    private static int[] outPut(int[] num) {
        int[] temp = new int[num.length - 1];
        int count = 0;
        // If size temp equal 0 finish risult
        if (temp.length == 0) {
            return num;
        }
        // If size temp dot equal 0 do sum and recursive
        for (int i = 0; i < num.length - 1; i++) {
            temp[count] = num[i] + num[i + 1];
            count++;
        }
        System.out.println(Arrays.toString(num));
        return outPut(temp);
    }
}
