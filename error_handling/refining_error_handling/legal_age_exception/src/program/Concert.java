package program;

import program.exceptions.UnderAgeException;

public class Concert {
    
    public static boolean allowEntry(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else {
            return true;
        }
    }
}
