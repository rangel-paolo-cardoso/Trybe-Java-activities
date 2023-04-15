package program;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) throws Exception {
        int number;
        while (true) {
            number = randomNumber();
            print(number);
            if (number == 4) {
                break;
            }
        }
    }

    static void print(int number) {
        System.out.println(number);
    }

    static int randomNumber() {
        return randomNumbers.betweenOneAndFive();
    }

    static RandomNumbers randomNumbers = new RandomNumbers();

    int betweenOneAndFive() {
        return new Random().nextInt(5) + 1;
    }
}
