package org.example.app.services.employees;

import org.example.app.entities.Employee;
import org.example.app.repositories.employees.EmployeeReadRepository;
import org.example.app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeReadService {

    EmployeeReadRepository repository;

    public EmployeeReadService(EmployeeReadRepository repository) {
        this.repository = repository;
    }

    public String readEmployees() {

        // Получаем данные в коллекцию.
        List<Employee> list = repository.readEmployees();

        // Если коллекция не null, формируем вывод.
        // Иначе уведомление об отсутствии данных.
        if (list != null) {
            // Если коллекция не пуста, формируем вывод.
            // Иначе уведомление об отсутствии данных.
            if (!list.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach((prop) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") id: ")
                                .append(prop.getId())
                                .append("; Name: ")
                                .append(prop.getLastName())
                                .append(" ")
                                .append(prop.getFirstName())
                                .append("; Position: ")
                                .append(prop.getPosition())
                                .append("; Birth date: ")
                                .append(prop.getBirthDate())
                                .append("; Phone: ")
                                .append(prop.getPhone())
                                .append("; Salary USD: ")
                                .append(prop.getSalary())
                                .append("\n")
                );
                return stringBuilder.toString();
            } else return Constants.DATA_ABSENT_MSG;
        } else return Constants.DATA_ABSENT_MSG;
    }
}
