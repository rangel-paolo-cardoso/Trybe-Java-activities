package program;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("What's your age in years, months and days? ");
        System.out.print("Years: ");
        int years = sc.nextInt();

        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.print("Days: ");
        int days = sc.nextInt();

        Person person = new Person();
        int ageInDays = person.calculateAgeInDays(years, months, days);

        System.out.printf("Hello %s, your age in days is %d%n", name, ageInDays);

        sc.close();
    }
}
