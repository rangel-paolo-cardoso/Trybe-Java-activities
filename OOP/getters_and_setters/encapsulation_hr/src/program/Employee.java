package program;

public class Employee {
    private String completeName;
    private String cpf;
    private String address;
    private double salary;

    public Employee(String completeName, String cpf, String address, double salary) {
        this.completeName = completeName;
        this.cpf = cpf;
        this.address = address;
        this.salary = salary;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
