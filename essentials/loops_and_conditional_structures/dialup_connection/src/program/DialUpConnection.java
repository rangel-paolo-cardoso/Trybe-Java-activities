package program;

import java.util.Random;

public class DialUpConnection {
    /**
     * Main Method.
     * The @param args is used to pass information into the program.
     */
    public static void main(String[] args) {
        int attempts = 0;
        do {
            if (connected()) {
                break;
            }
            attempts += 1;
        } while (attempts < 3);
    }

    static boolean connected() {
        return dialUpConnection.trueOrFalse();
    }

    static DialUpConnection dialUpConnection = new DialUpConnection();

    boolean trueOrFalse() {
        return new Random().nextInt(2) == 1;
    }
}
