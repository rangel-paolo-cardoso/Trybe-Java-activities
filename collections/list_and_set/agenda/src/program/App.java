package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the name of the %dº contact: ", (i + 1));
            agenda.addContact(sc.next());
        }

        System.out.print("Enter the name of the contact to be verified: ");
        printVerifiedContact(agenda.verifyContact(sc.next()));

        System.out.print("Enter the name of the contact to be deleted: ");
        agenda.deleteContact(sc.next());

        System.out.print("Enter the name of the contact to be verified: ");
        printVerifiedContact(agenda.verifyContact(sc.next()));
        sc.close();

        System.out.print("Number of contacts in the agenda: ");
        System.out.println(agenda.sizeOfTheAgenda());
    }

    private static void printVerifiedContact(boolean exists) {
        System.out.println(
                exists
                        ? "This contact exists in the agenda"
                        : "This contact does not exist in the agenda");
    }
}
