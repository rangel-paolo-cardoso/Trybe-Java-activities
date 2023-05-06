package program;

import java.util.Locale;
import java.util.Scanner;

import program.exceptions.UnderAgeException;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        try {
            boolean isAllowed = Concert.allowEntry(age);
            if (isAllowed) {
                System.out.println("Entry allowed!");
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
