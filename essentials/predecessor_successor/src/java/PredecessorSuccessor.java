package java;

import java.util.Scanner;

public class PredecessorSuccessor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = sc.nextInt();

        System.out.printf(
                "The number %d has %d as its predecessor, and %d and its successor.%n",
                number,
                number - 1,
                number + 1);

        sc.close();
    }
}
