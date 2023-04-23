package program;

public class EmployeeLegalPerson extends Employee {

    private final double INCOME_TAX_RATE = 10 / 100.0;    

    @Override
    public double calculateNetSalary() {
        return grossSalary - grossSalary * INCOME_TAX_RATE;
    }
}
