package org.example.app.utils;

import org.example.app.database.DBConn;
import org.example.app.entities.Employee;
import org.example.app.entities.Position;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdChecker {

    public static boolean idExistsEmployee(Employee employee) {
        try {
            String query = "SELECT COUNT(id) FROM " + Constants.TABLE_EMPLOYEES + " WHERE id = ?";
            PreparedStatement pst = DBConn.connect().prepareStatement(query);
            pst.setInt(1, employee.getId());

            try (ResultSet rs = pst.executeQuery()) {
                // Ожидаем только один результат
                if (rs.next()) {
                    return rs.getBoolean(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean idExistsPosition(Position position) {
        try {
            String query = "SELECT COUNT(id) FROM " + Constants.TABLE_POSITIONS + " WHERE id = ?";
            PreparedStatement pst = DBConn.connect().prepareStatement(query);
            pst.setInt(1, position.getId());

            try (ResultSet rs = pst.executeQuery()) {
                // Ожидаем только один результат
                if (rs.next()) {
                    return rs.getBoolean(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
