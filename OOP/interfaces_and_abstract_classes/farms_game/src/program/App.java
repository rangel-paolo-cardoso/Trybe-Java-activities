package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import program.areas.Circle;
import program.areas.Rectangle;
import program.areas.Square;
import program.areas.Triangle;
import program.domain.PlayerResult;
import program.interfaces.Farm;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many players do you want? ");
        int numberOfPlayers = sc.nextInt();
        List<PlayerResult> players = new ArrayList<>();

        int player = 1;
        double base;
        double height;
        String name;
        while (true) {
            print("PLAYER " + player);
            print("Enter your name: ");
            name = sc.next();
            print("Enter the mesurement for your square shaped farm: ");
            System.out.print("Side mesurement: ");
            Square square = new Square(sc.nextDouble());

            print("Enter the mesurements for your triangle shaped farm: ");
            System.out.print("Base mesurement: ");
            base = sc.nextDouble();
            System.out.print("Height mesurement: ");
            height = sc.nextDouble();
            Triangle triangle = new Triangle(base, height);

            print("Enter the mesurements for your rectangle shaped farm: ");
            System.out.print("Base mesurement: ");
            base = sc.nextDouble();
            System.out.print("Height mesurement: ");
            height = sc.nextDouble();
            Rectangle rectangle = new Rectangle(base, height);

            print("Enter the mesurement for your circle shaped farm: ");
            System.out.print("Radius mesurement: ");
            Circle circle = new Circle(sc.nextDouble());

            Farm[] farms = { square, triangle, rectangle, circle };
            players.add(new PlayerResult(name, farms));

            if (player == numberOfPlayers) {
                printResults(players);
                break;
            }
            player += 1;
        }

    }

    static void print(String messsage) {
        System.out.println(messsage);
    }

    static void printResults(List<PlayerResult> players) {
        String winner = "";
        double highestScore = 0.0;
        double score;
        print("Final result!");
        for (PlayerResult player : players) {
            print("======================");
            print(player.toString());
            score = player.score();
            if (score > highestScore) {
                winner = player.getPlayerName();
                highestScore = score;
            }
        }
        print("\nThe winner is " + winner);
    }
}
