package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AgendaMap agenda = new AgendaMap();

        String name;
        String contact;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the name of the %dº contact: ", (i + 1));
            name = sc.next();
            System.out.printf("Enter the number of the %dº contact: ", (i + 1));
            contact = sc.next();
            agenda.addContact(name, contact);
        }

        System.out.print("Enter the name of the contact to be verified: ");
        printVerifiedContact(agenda.verifyContact(sc.next()));

        System.out.print("Enter the name of the contact to be deleted: ");
        agenda.deleteContact(sc.next());

        System.out.print("Enter the name of the contact to be verified: ");
        printVerifiedContact(agenda.verifyContact(sc.next()));
        sc.close();

        System.out.print("Number of contacts in the agenda: ");
        System.out.println(agenda.agendaSize());
    }

    private static void printVerifiedContact(boolean exists) {
        System.out.println(
                exists
                        ? "This contact exists in the agenda"
                        : "This contact does not exist in the agenda");
    }
}
