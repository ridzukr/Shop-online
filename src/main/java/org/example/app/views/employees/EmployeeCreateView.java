package org.example.app.views.employees;

import org.example.app.entities.Employee;
import java.util.Scanner;
import static org.example.app.utils.NumberInputValidator.validateDoubleInput;
import static org.example.app.utils.NumberInputValidator.validateIntInput;

public class EmployeeCreateView {

    public Employee getData() {

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter first name: ");
        employee.setFirstName(scanner.nextLine().trim());

        System.out.print("Enter last name: ");
        employee.setLastName(scanner.nextLine().trim());

        System.out.print("Enter birth date in format yyyy-mm-dd: ");
        employee.setBirthDate(scanner.nextLine().trim());

        System.out.print("Enter position id: ");
        employee.setPositionId(validateIntInput(scanner));
        scanner.nextLine();

        System.out.print("Enter phone in format xxx xxx-xxxx: ");
        employee.setPhone(scanner.nextLine().trim());

        System.out.print("Enter salary USD: ");
        employee.setSalary(validateDoubleInput(scanner));
        scanner.nextLine();

        return employee;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

}
