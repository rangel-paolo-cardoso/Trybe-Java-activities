package program;

import java.util.Locale;
import java.util.Scanner;

public class HumanResources {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeeNaturalPerson naturalPerson = new EmployeeNaturalPerson();
        System.out.print("Enter the first employee's gross salary: ");
        naturalPerson.setGrossSalary(sc.nextDouble());
        System.out.println("The net salary of the natural person is: " + naturalPerson.calculateNetSalary());

        EmployeeLegalPerson legalPerson = new EmployeeLegalPerson();
        System.out.print("Enter the second employee's gross salary: ");
        legalPerson.setGrossSalary(sc.nextDouble());
        sc.close();
        System.out.println("The net salary of the legal person is: " + legalPerson.calculateNetSalary());
    }
}
