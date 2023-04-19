package org.example.app.services.employees;

import org.example.app.entities.Employee;
import org.example.app.repositories.employees.EmployeDeleteRepository;
import org.example.app.utils.Constants;
import org.example.app.utils.IdChecker;

public class EmployeeDeleteService {
    EmployeDeleteRepository repository;

    public EmployeeDeleteService(EmployeDeleteRepository repository) {
        this.repository = repository;
    }

    public String deleteEmployee(Employee employee) {
        // Проверяем на наличие id в БД.
        // ДА - работаем с данными.
        // НЕТ - уведомление об отсутствии id.
        if (IdChecker.idExistsEmployee(employee)) {
            return repository.deleteEmployee(employee);
        } else {
            return Constants.ID_NO_EXISTS_MSG;
        }
    }
}
