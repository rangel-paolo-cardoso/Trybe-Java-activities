package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = sc.next();

        System.out.println("Enter the grade of the assessments:");
        System.out.print("Assessments 1: ");
        float assessment1 = sc.nextFloat();

        System.out.print("Assessments 2: ");
        float assessment2 = sc.nextFloat();

        System.out.print("Assessments 3: ");
        float assessment3 = sc.nextFloat();

        System.out.print("Assessments 4: ");
        float assessment4 = sc.nextFloat();
        sc.close();

        Grade grade = new Grade();
        float average = grade.calculateAverage(
                assessment1, assessment2, assessment3, assessment4);
        
        System.out.printf("Hello, %s, your average is %.2f%n", name, average);
    }
}
