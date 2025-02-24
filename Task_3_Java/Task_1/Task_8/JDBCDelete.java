import java.sql.*;
import java.util.Scanner;

public class JDBCDelete {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/school_db";
        String USER = "root";
        String PASS = "Jamuna@18";
        String query = "DELETE FROM student_db WHERE id = ?";

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee with ID " + id + " was successfully deleted.");
            } else {
                System.out.println("No Employee found with ID " + id + ".");
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}
