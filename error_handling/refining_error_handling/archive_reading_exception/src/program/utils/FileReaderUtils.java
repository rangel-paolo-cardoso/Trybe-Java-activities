package program.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtils {

    public static String getLines() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file_does_not_exist.txt"));
        } catch (FileNotFoundException e) {
            return "File does not exist";
        }
        try {
            return reader.lines().findFirst().get();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
