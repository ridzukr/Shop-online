package org.example.app.services.employees;

import org.example.app.entities.Employee;
import org.example.app.exceptions.EmployeeCreateException;
import org.example.app.repositories.employees.EmployeeCreateRepository;
import org.example.app.utils.BirthDateValidator;
import org.example.app.utils.Constants;
import org.example.app.utils.NameValidator;
import org.example.app.utils.PhoneValidator;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCreateService {

    EmployeeCreateRepository repository;

    public EmployeeCreateService(EmployeeCreateRepository repository) {
        this.repository = repository;
    }

    public String createEmployee(Employee employee) {

        // Map для сбора ошибок
        Map<String, String> errors = new HashMap<>();

        if (NameValidator.isNameValid(employee.getFirstName()))
            errors.put("firstName", Constants.WRONG_FIRSTNAME_MSG);

        if (NameValidator.isNameValid(employee.getLastName()))
            errors.put("lastName", Constants.WRONG_LASTNAME_MSG);

        if (BirthDateValidator.isBirthDateValid(employee.getBirthDate()))
            errors.put("birthDate", Constants.WRONG_DATE_MSG);

        if (employee.getPositionId() == 0)
            errors.put("positionId", Constants.INPUT_REQ_MSG);

        if (PhoneValidator.isPhoneValid(employee.getPhone()))
            errors.put("phone", Constants.WRONG_PHONE_MSG);

        if (employee.getSalary() == 0)
            errors.put("salary", Constants.INPUT_REQ_MSG);

        if (errors.size() > 0) {
            try {
                throw new EmployeeCreateException("Check inputs", errors);
            } catch (EmployeeCreateException e) {
                return e.getErrors(errors);
            }
        }

        return repository.createEmployee(employee);
    }
}
