package program;

public class EmployeeNaturalPerson extends Employee {

    private final double INCOME_TAX_RATE = 20 / 100.0;

    @Override
    public double calculateNetSalary() {
        return grossSalary - grossSalary * INCOME_TAX_RATE;
    }
}
