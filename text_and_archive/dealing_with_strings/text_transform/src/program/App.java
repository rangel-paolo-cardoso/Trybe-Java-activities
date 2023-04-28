package program;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text to be transformed: ");
        String text = sc.nextLine();
        
        System.out.println(tranformText(text));
    }

    static String tranformText(String text) {
        String replacedPlusSign = text.replace("+", " ");
        if (replacedPlusSign.indexOf('a') % 2 == 0) {
            return replacedPlusSign.toUpperCase();
        }
        return replacedPlusSign.split(" ")[0];
    }
}
