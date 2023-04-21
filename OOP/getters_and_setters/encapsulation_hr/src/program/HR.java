package program;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Scanner;

public class HR {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's name: ");
        String name = sc.nextLine();

        System.out.print("Enter the employee's CPF (e.g: 000.000.000-00): ");
        String cpf = sc.nextLine();

        System.out.print("Enter the employee's address: ");
        String address = sc.nextLine();

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(name, cpf, address, salary);

        System.out.println("CPF: " + employee.getCpf());
        System.out.println("Salary: " + employee.getSalary());

        System.out.print("Enter a new salary: ");
        employee.setSalary(sc.nextDouble());
        sc.close();

        System.out.println("Salary: " + employee.getSalary());
    }
}
