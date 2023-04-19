package org.example.app.repositories.employees;

import org.example.app.database.DBConn;
import org.example.app.entities.Employee;
import org.example.app.utils.Constants;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeDeleteRepository {

    public String deleteEmployee(Employee employee) {

        String sql = "DELETE FROM " + Constants.TABLE_EMPLOYEES + " WHERE id = ?";

        try (PreparedStatement stmt = DBConn.connect().prepareStatement(sql)) {
            // установка соответствующих параметров
            stmt.setInt(1, employee.getId());
            // выполнение запроса в БД
            stmt.executeUpdate();
            return Constants.DATA_DELETE_MSG;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
