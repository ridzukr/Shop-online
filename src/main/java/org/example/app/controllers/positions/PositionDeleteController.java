package org.example.app.controllers.positions;

import org.example.app.entities.Position;
import org.example.app.services.positions.PositionDeleteService;
import org.example.app.utils.AppStarter;
import org.example.app.views.positions.PositionDeleteView;

public class PositionDeleteController {

    PositionDeleteService service;
    PositionDeleteView view;
    Position position;

    public PositionDeleteController(PositionDeleteService service, PositionDeleteView view) {
        this.service = service;
        this.view = view;
    }

    public void deletePosition() {
        // Получаем входные данные.
        position = view.getData();
        // Передаем данные на обработку, получаем результат.
        // Выводим результат.
        view.getOutput(service.deletePosition(position));
        // Перезапускаем приложение.
        AppStarter.startApp();
    }
}
