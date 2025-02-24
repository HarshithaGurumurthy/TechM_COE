import java.sql.*;
import java.lang.ClassNotFoundException;
public class JDBCCrudExample {

    // Database connection details
    static final String DB_URL = "jdbc:mysql://localhost:3306/school";
    static final String USER = "your_username";  // Replace with your DB username
    static final String PASS = "your_password";  // Replace with your DB password

    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC Driver (Optional for modern drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to Database!");

            // Step 3: Create Statement Object
            Statement stmt = conn.createStatement();

            // --- CREATE ---
            String insertSQL = "INSERT INTO students (id, name, age) VALUES (1, 'John Doe', 20)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Record Inserted!");

            // --- READ ---
            String selectSQL = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("\nStudents Table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            // --- UPDATE ---
            String updateSQL = "UPDATE students SET age = 21 WHERE id = 1";
            stmt.executeUpdate(updateSQL);
            System.out.println("\nRecord Updated!");

            // Display updated data
            rs = stmt.executeQuery(selectSQL);
            System.out.println("\nUpdated Students Table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            // --- DELETE ---
            String deleteSQL = "DELETE FROM students WHERE id = 1";
            stmt.executeUpdate(deleteSQL);
            System.out.println("\nRecord Deleted!");

            // Display after deletion
            rs = stmt.executeQuery(selectSQL);
            System.out.println("\nFinal Students Table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            // Step 4: Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("\nConnection Closed!");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
