package program.exceptions;

public class UnderAgeException extends Exception {
    
    public UnderAgeException() {
        super("Person under the age of 18!");
    }
}
