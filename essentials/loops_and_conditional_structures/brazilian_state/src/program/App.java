package program;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] fUs = { "CE", "SC", "AM" };
        int pos = new Random().nextInt(fUs.length);

        showFderatedUnitName(fUs[pos]);
    }

    static void showFderatedUnitName(String fU) {
        switch (fU) {
            case "CE":
                System.out.println("CEARA");
                break;
            case "SC":
                System.out.println("SANTA CATARINA");
                break;
            case "AM":
                System.out.println("AMAZONAS");
                break;
        }
    }

    static void print(String stateName) {
        System.out.println(stateName);
    }
}
