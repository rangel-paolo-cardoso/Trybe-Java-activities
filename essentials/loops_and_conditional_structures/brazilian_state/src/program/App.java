package program;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] fUs = { "CE", "SC", "AM" };
        int pos = new Random().nextInt(fUs.length);

        showFderatedUnitName(fUs[pos]);
    }

    static void showFderatedUnitName(String fU) {
        if (fU.equalsIgnoreCase("ce")) {
            print("CEARA");
        } else if (fU.equalsIgnoreCase("sc")) {
            print("SANTA CATARINA");
        } else {
            print("AMAZONAS");
        }
    }

    static void print(String stateName) {
        System.out.println(stateName);
    }
}
