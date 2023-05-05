package program;

public class NullsTreatment {
    public static void main(String[] args) {
        NullGuard nullGuard = new NullGuard();

        System.out.println(nullGuard.printName(2));

        System.out.println(nullGuard.printName(3));
    }
}
