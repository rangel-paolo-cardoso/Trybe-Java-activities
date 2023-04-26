package program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class PasswordGenerator {

    /**
     * Write a password to the file specified on the path.
     * @param password A generated password as a String.
     * @param file a File instance (from java.io.File) that handles the file path.
     */
    public void writePasswordToTheFile(String password, File file) {
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(password);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeWritingResource(writer, bufferedWriter);
        }
    }

    private void closeWritingResource(FileWriter writer, BufferedWriter bufferedWriter) {
        try {
            writer.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates a password according to a pattern.
     * @param number A number used to get the proper pattern.
     * @return the password as a String.
     */
    public String generatePassword(int number) {
        return getPattern(number) + getPattern(number + 1);
    }

    /**
     * Obtains the proper pattern.
     * @param digit a digit to get a certain pattern.
     * @return the pattern as a String.
     */
    private static String getPattern(int digit) {
        if (digit < 10) {
            return Pattern.valueOf(Pattern.class, "NUMBER_" + digit).get();
        }
        return "####";
    }
}
