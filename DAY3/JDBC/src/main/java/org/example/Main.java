package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;

import static org.example.EmployeeSalaryChecker.*;

public class Main {

    public static void main(String[] args) {
        DataSource ds = createDataSource();

        try (Connection conn = ds.getConnection()) {

            showEmployeesWithAboveMinSalary(conn);

            showDepartmentsWithMoreThanFiveEmployees(conn);

            showEmptyDepartment(conn);

            EmployeeWithSalaryGreaterThanAverage(conn);

            JobTitleWithAverageSalaryGreaterThan(conn);

        } catch (SQLException e) {
            System.err.println(" Connection error: " + e.getMessage());
        }
    }
}