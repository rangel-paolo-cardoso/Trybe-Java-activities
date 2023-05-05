package program;

public class NullGenerator {

    public String getName(int number) throws NullPointerException {
        Person person;
        if (number % 2 == 0) {
            person = new Person("bob");
        } else {
            person = new Person(null);
        }
        return person.getUpperCaseName();
    }
}
