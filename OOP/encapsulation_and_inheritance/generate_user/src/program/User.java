package program;

public class User extends Person {

    public User(String firstName, String lastName) {
        super.firstName = firstName;
        super.lastName = lastName;
    }

    public String getUser() {
        if (super.firstName.equals("")
                || super.firstName == null
                || super.lastName.equals("")
                || super.lastName == null) {
            return "Invalid user!";
        }
        return super.firstName.concat(".").concat(super.lastName);
    }
}
