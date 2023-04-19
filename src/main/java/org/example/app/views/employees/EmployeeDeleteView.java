package org.example.app.views.employees;

import org.example.app.entities.Employee;

import java.util.Scanner;

public class EmployeeDeleteView {

          public Employee getData() {

            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee();

            System.out.print("Enter employee's ID: ");
              employee.setId(scanner.nextInt());

            return employee;
        }

        public void getOutput(String output) {
            System.out.println(output);
        }
    }

