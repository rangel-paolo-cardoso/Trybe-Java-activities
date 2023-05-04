package program;

public final class Divider {
    
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0 ;
        }
    }
}
