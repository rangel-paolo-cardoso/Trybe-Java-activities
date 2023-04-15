package program;

import java.util.Scanner;

public class App {

    /**
     * Main Method.
     * The @param args is used to pass information into the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[3];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter a whole number: ");
            myArray[i] = sc.nextInt();
        }

        int sum = myArray[0] + myArray[myArray.length - 1];
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}
