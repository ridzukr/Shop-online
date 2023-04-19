package org.example.app.repositories.employees;

import org.example.app.database.DBConn;
import org.example.app.entities.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeReadRepository {

    List<Employee> list;

    public List<Employee> readEmployees() {

        try (Statement stmt = DBConn.connect().createStatement()) {

            list = new ArrayList<>();

            String sql = "SELECT empl.id, lastName, firstName, birthDate, pos.name, phone, salary " +
                    "FROM employees empl " +
                    "INNER JOIN positions pos ON empl.positionId = pos.id";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("lastName"),
                        rs.getString("firstName"),
                        rs.getString("birthDate"),
                        rs.getString("pos.name"),
                        rs.getString("phone"),
                        rs.getDouble("salary") ));
            }
            // Возвращаем коллекцию данных
            return list;
        } catch (SQLException e) {
            // Если ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
}
