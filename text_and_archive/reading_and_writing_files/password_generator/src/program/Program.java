package program;

import java.io.File;

public class Program {
    private static String path = "/home/rangel/java-projects/java-tests/files";
    private static int PASS_NUMBERS = 10;

    /**
     * Main Method.
     * @param args used to pass information into the program.
     * @throws Exception any type of exception that may arise.
     */
    public static void main(String[] args) throws Exception {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        for (byte i = 0; i < PASS_NUMBERS; i += 1) {
            File file = new File(path + File.separator + "ARCHIVE_" + i + ".txt");
            String password = passwordGenerator.generatePassword(i);

            passwordGenerator.writePasswordToTheFile(password, file);
        }
    }
}
