package org.example.app.controllers.positions;

import org.example.app.entities.Position;
import org.example.app.services.positions.PositionCreateService;
import org.example.app.utils.AppStarter;
import org.example.app.views.positions.PositionCreateView;

public class PositionCreateController {

    PositionCreateView view;
    Position position;
    PositionCreateService service;

    public PositionCreateController(PositionCreateService service, PositionCreateView view) {
        this.service = service;
        this.view = view;
    }

    public void createPosition() {
        // Получаем входные данные.
        position = view.getData();
        // Передаем данные на обработку и получаем сообщение.
        String str = service.createPosition(position);
        // Выводим уведомление.
        view.getOutput(str);
        // Перезапускаем приложение.
        AppStarter.startApp();
    }
}
