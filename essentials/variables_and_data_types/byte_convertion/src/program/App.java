package program;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        byte value = sc.nextByte();
        sc.close();

        int bits = value * 8;

        System.out.printf("%d bytes equals %d bits %n", value, bits);
    }
}
