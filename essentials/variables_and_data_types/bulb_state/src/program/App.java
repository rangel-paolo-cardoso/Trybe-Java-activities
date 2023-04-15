package program;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to turn on the bulb? (Y: on, N: off) ");
        char answer = sc.next().toLowerCase().charAt(0);
        sc.close();

        boolean state = answer == 'y' || false;
        System.out.println("The bulb is turn on? " + state);
    }
}
