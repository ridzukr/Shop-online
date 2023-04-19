package org.example.app.repositories.positions.employees;

import org.example.app.entities.Employee;
import org.example.app.services.employees.EmployeeCreateService;
import org.example.app.utils.AppStarter;
import org.example.app.views.employees.EmployeeCreateView;

public class EmployeeCreateController {

    EmployeeCreateView view;
    Employee employee;
    EmployeeCreateService service;

    public EmployeeCreateController(EmployeeCreateService service, EmployeeCreateView view) {
        this.service = service;
        this.view = view;
    }

    public void createEmployee() {
        // Получаем входные данные.
        employee = view.getData();
        // Передаем данные на обработку, получаем результат.
        String str = service.createEmployee(employee);
        // Выводим результат.
        view.getOutput(str);
        // Перезапускаем приложение.
        AppStarter.startApp();
    }
}
