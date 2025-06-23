package org.example;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariDataSource;

public class EmployeeSalaryChecker {

    static DataSource createDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/question1?serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("zombies@40rounds");
        ds.setMaximumPoolSize(10);
        return ds;
    }

    public static void showEmployeesWithAboveMinSalary(Connection conn) {
        String sql = """
            SELECT e.employee_id, e.first_name, e.salary, j.job_title
            FROM employees e
            JOIN jobs j ON e.job_id = j.job_id
            WHERE e.salary > j.min_salary
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (!rs.next()) {
                System.out.println("No data found.");
            } else {
                System.out.println("\n Employees earning above their job's minimum salary:\n");
                do {
                    int empId = rs.getInt("employee_id");
                    String name = rs.getString("first_name");
                    double salary = rs.getDouble("salary");
                    String job = rs.getString("job_title");

                    System.out.printf("ID: %d | Name: %-10s | Salary: %.2f | Job: %s%n",
                            empId, name, salary, job);

                } while (rs.next());
            }

        } catch (SQLException e) {
            System.err.println(" Error executing query: " + e.getMessage());
        }
    }

    public static void showDepartmentsWithMoreThanFiveEmployees(Connection conn) {
        String sql = """
        SELECT d.department_name, COUNT(e.employee_id) AS employee_count
        FROM Departments d
        JOIN Employees e ON d.department_id = e.department_id
        GROUP BY d.department_name
        HAVING COUNT(e.employee_id) > 5
    """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (!rs.next()) {
                System.out.println("\n No data found.");
            } else {
                System.out.println("\n Departments with more than 5 employees:\n");
                do {
                    String department = rs.getString("department_name");
                    int count = rs.getInt("employee_count");

                    System.out.printf("Department: %-20s | Employee Count: %d%n", department, count);

                } while (rs.next());
            }

        } catch (SQLException e) {
            System.err.println("Error executing department query: " + e.getMessage());
        }
    }

    public static void showEmptyDepartment(Connection conn){
        String sql = """
                SELECT d.department_name
                FROM departments d
                LEFT JOIN employees e ON d.department_id = e.department_id
                WHERE e.employee_id IS NULL
                """;

        try(PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

            if(!rs.next()){
                System.out.println("\n All departments have at least one employee");
            }
            else{
                System.out.println("\n Departments with no employees: ");

                do{
                    String departmentName = rs.getString("department_name");
                    System.out.println("- " + departmentName);
                }while(rs.next());
            }
        }
        catch (SQLException e){
            System.err.println(" Error executing department check query: " + e.getMessage());
        }
    }


    public static void EmployeeWithSalaryGreaterThanAverage(Connection conn){
        String sql = """
                SELECT employee_id,first_name,last_name,salary
                FROM employees
                WHERE salary > (
                    SELECT AVG(salary)
                    FROM employees
                );
                """;
        try(PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

            if(!rs.next()){
                System.out.println("\n No employee has salary greater than average salary ");
            }
            else{
                System.out.println("\n Employees with salary greater than average: ");

                do{
                    String id = rs.getString("employee_id");
                    String Fname = rs.getString("first_name");
                    String Lname = rs.getString("last_name");
                    int salary = rs.getInt("salary");

                    System.out.println("\n Id: " + id + " -- First name: " + Fname + " -- Last name: " + Lname + " --Salary:  " + salary);

                }while(rs.next());
            }

        }
        catch(SQLException e){
            System.err.println("Error executing the query: " + e.getMessage());
        }

    }

    public static void JobTitleWithAverageSalaryGreaterThan(Connection conn){
        String sql = """
                SELECT j.job_title,AVG(e.salary) AS average_salary
                FROM employees e
                JOIN jobs j ON e.job_id = j.job_id
                GROUP BY j.job_title
                HAVING AVG(e.salary) > 7000
                """;

        try(PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {
            if(!rs.next()){
                System.out.println("\n There are no job titles with average salary greater than 7000");
            }
            else{
                System.out.println("\n Job titles with average salary greater than 7000 are: ");
                do{

                    String title = rs.getString("job_title");

                    System.out.println(" Title : " + title);

                }while(rs.next());
            }

        }
        catch (SQLException e){
            System.err.println("Error executing the query: " + e.getMessage());
        }
    }

}
