package program;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

    /**
     * Main Method.
     * The @param args is used to pass information into the program.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account holder name: ");
        String holder = sc.next();
        // sc.nextLine();

        System.out.print("Enter the initial deposit: ");
        double initialDeposit = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(holder, initialDeposit);
        System.out.println(savingsAccount.showBalance());

        System.out.print("Enter a value to deposit: ");
        savingsAccount.deposit(sc.nextDouble());

        System.out.println(savingsAccount.showBalance());

        System.out.print("Enter a value to withdraw: ");
        savingsAccount.withdraw(sc.nextDouble());

        System.out.println(savingsAccount.showBalance());
        sc.close();

        System.out.print("Account holder: ");
        System.out.println(savingsAccount.showAccountHolder());
    }
}
