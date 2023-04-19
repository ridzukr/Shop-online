package org.example.app.repositories.positions.employees;

import org.example.app.entities.Employee;
import org.example.app.services.employees.EmployeeDeleteService;
import org.example.app.utils.AppStarter;
import org.example.app.views.employees.EmployeeDeleteView;

public class EmployeeDeleteController {

    EmployeeDeleteService service;
    EmployeeDeleteView view;
    Employee employee;

    public EmployeeDeleteController( EmployeeDeleteService service, EmployeeDeleteView view) {
        this.service = service;
        this.view = view;
    }

    public void deleteEmployee() {
        // Получаем входные данные.
        employee = view.getData();
        // Передаем данные на обработку, получаем результат.
        // Выводим результат.
        view.getOutput(service.deleteEmployee(employee));
        // Перезапускаем приложение.
        AppStarter.startApp();
    }
}
