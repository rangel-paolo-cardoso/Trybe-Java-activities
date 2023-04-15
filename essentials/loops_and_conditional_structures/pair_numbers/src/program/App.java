package program;

public class App {

    /**
     * Main Method.
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 4; i <= 20; i += 1) {
            if (i % 2 == 0) {
                print(i);
            }
        }
    }

    public static void print(int number) {
        System.out.println(number);
    }
}
