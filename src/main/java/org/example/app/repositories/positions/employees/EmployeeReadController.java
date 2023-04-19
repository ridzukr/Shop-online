package org.example.app.repositories.positions.employees;

import org.example.app.services.employees.EmployeeReadService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.employees.EmployeeReadView;

public class EmployeeReadController {

    EmployeeReadService service;
    EmployeeReadView view;

    public EmployeeReadController(EmployeeReadService service, EmployeeReadView view) {
        this.service = service;
        this.view = view;
    }

    public void readEmployees() {
        // Передаем запрос и получаем ответ.
        String str = service.readEmployees();
        // Проверяем возврат чтения данных.
        // Если что-то не так, выводим сообщение об этом, и закрываем приложение.
        // Иначе выводим сообщение и перезапускаем приложение.
        if (str.equals(Constants.SMTH_WRONG_MSG)) {
            // Выводим уведомление.
            view.getOutput(str);
            // Закрываем приложение.
            System.exit(0);
        } else {
            // Выводим уведомление или данные.
            view.getOutput("\n__ Employees ___________\n" + str);
            // Перезапускаем приложение.
            AppStarter.startApp();
        }
    }
}
