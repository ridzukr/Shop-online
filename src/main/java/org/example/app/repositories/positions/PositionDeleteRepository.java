package org.example.app.repositories.positions;

import org.example.app.database.DBConn;
import org.example.app.entities.Position;
import org.example.app.utils.Constants;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PositionDeleteRepository {

    public String deletePosition(Position position) {

        String sql = "DELETE FROM " + Constants.TABLE_POSITIONS + " WHERE id = ?";

        try (PreparedStatement stmt = DBConn.connect().prepareStatement(sql)) {
            // установка соответствующих параметров
            stmt.setInt(1, position.getId());
            // выполнение запроса в БД
            stmt.executeUpdate();
            return Constants.DATA_DELETE_MSG;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
