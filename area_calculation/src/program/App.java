package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side measurement of a square: ");
        double squareSide = sc.nextDouble();
        sc.close();

        System.out.printf("The are of the square with side %.2f is equals to %.2f%n",
                squareSide,
                (squareSide * squareSide));
    }
}
