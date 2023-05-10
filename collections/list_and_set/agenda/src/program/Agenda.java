package program;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

    private Set<String> contacts;

    public Agenda() {
        contacts = new HashSet<>();
    }

    public Agenda(Set<String> contacts) {
        this.contacts = contacts;
    }
    
    public void addContact(String contact) {
        this.contacts.add(contact);
    }

    public void deleteContact(String contact) {
        this.contacts.remove(contact);
    }

    public boolean verifyContact(String contact) {
        return this.contacts.contains(contact);
    }

    public int sizeOfTheAgenda() {
        return this.contacts.size();
    }
}
