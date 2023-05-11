package program;

import java.util.HashMap;
import java.util.Map;

public class AgendaMap {

    private Map<String, String> contacts;

    public AgendaMap() {
        this.contacts = new HashMap<>();
    }

    public AgendaMap(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, String telefone) {
        this.contacts.put(name, telefone);
    }

    public void deleteContact(String name) {
        this.contacts.remove(name);
    }

    public boolean verifyContact(String name) {
        return this.contacts.containsKey(name);
    }

    public int agendaSize() {
        return this.contacts.size();
    }

    public void updateTelefone(String name, String telefone) {
        this.contacts.put(name, telefone);
    }

    public String getTelefone(String name) {
        return this.contacts.get(name);
    }

}
