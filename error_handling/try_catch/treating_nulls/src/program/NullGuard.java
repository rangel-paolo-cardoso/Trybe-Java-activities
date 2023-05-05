package program;

public class NullGuard {
    
    public String printName(int divider) {
        NullGenerator nullGenerator = new NullGenerator();
        String name;
        try {
            name = nullGenerator.getName(divider);
        } catch (NullPointerException e) {
            name = "Null name";
        }
        return name;
    }
}
