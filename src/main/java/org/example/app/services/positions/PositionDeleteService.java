package org.example.app.services.positions;

import org.example.app.entities.Position;
import org.example.app.repositories.positions.PositionDeleteRepository;
import org.example.app.utils.Constants;
import org.example.app.utils.IdChecker;

public class PositionDeleteService {

    PositionDeleteRepository repository;

    public PositionDeleteService( PositionDeleteRepository repository) {
        this.repository = repository;
    }

    public String deletePosition(Position position) {
        // Проверяем на наличие id в БД.
        // ДА - работаем с данными.
        // НЕТ - уведомление об отсутствии id.
        if (IdChecker.idExistsPosition(position)) {
            return repository.deletePosition(position);
        } else {
            return Constants.ID_NO_EXISTS_MSG;
        }
    }
}
