package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.printf("Your BMI is %.4f%n", (weight / (height * height)));
    }
}
