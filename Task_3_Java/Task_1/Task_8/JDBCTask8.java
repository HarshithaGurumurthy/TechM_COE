import java.sql.*;
import java.util.Scanner;

public class JDBCTask8 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/school_db";
    static final String USER = "root";  
    static final String PASS = "Jamuna@18"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Database!");

            while (true) {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Insert New Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select Rows");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertRows(conn, scanner);
                        break;
                    case 2:
                        updateRow(conn, scanner);
                        break;
                    case 3:
                        deleteRow(conn, scanner);
                        break;
                    case 4:
                        selectRows(conn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 1: Recursively insert multiple rows
    public static void insertRows(Connection conn, Scanner scanner) throws SQLException {
        String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);

        while (true) {
            System.out.print("Enter Student Name: ");
            String name = scanner.next();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Record Inserted!");

            System.out.print("Do you want to insert another record? (yes/no): ");
            String cont = scanner.next();
            if (!cont.equalsIgnoreCase("yes")) break;
        }
    }

    // Task 2: Update row dynamically
    public static void updateRow(Connection conn, Scanner scanner) throws SQLException {
        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(updateSQL);

        System.out.print("Enter Student ID to Update: ");
        int id = scanner.nextInt();
        System.out.print("Enter New Name: ");
        String name = scanner.next();
        System.out.print("Enter New Age: ");
        int age = scanner.nextInt();

        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setInt(3, id);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Record Updated Successfully!");
        } else {
            System.out.println("No Record Found with ID: " + id);
        }
    }

    // Task 3: Delete row using Scanner
    public static void deleteRow(Connection conn, Scanner scanner) throws SQLException {
        String deleteSQL = "DELETE FROM students WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);

        System.out.print("Enter Student ID to Delete: ");
        int id = scanner.nextInt();

        pstmt.setInt(1, id);

        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Record Deleted Successfully!");
        } else {
            System.out.println("No Record Found with ID: " + id);
        }
    }

    // Task 4: Select and display rows
    public static void selectRows(Connection conn) throws SQLException {
        String selectSQL = "SELECT * FROM students";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQL);

        System.out.println("\n--- Students Table ---");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                               ", Name: " + rs.getString("name") +
                               ", Age: " + rs.getInt("age"));
        }
        rs.close();
    }
}
