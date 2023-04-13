package program;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate the factorial: ");
        int number = sc.nextInt();
        sc.close();

        int factorial = 1;

        for (int i = number; i > 1; i -= 1) {
            factorial *= i;
        }

        System.out.printf("The factorial of %d is %d%n", number, factorial);
    }
}
