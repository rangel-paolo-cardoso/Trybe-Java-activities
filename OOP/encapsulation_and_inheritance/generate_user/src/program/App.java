package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the user's first name: ");
        String firstName = sc.next();

        System.out.print("Enter the user's last name: ");
        String lastName = sc.next();

        User user = new User(firstName, lastName);

        System.out.println(user.getUser());

        sc.close();
    }
}
