import java.sql.*;
import java.util.Scanner;

public class JDBCMenu {
    public static void main(String[] args) throws Exception {
        String DB_URL = "jdbc:mysql://localhost:3306/school_db";
        String USER = "root";
        String PASS = "Jamuna@18";

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("1. Insert\n2. Update\n3. Delete\n4. Select\n5. Exit");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Enter ID, Name, Salary, Years:");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double salary = sc.nextDouble();
                    int years = sc.nextInt();
                    String query = "INSERT INTO student_db (id, name, salary, years) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement ps = con.prepareStatement(query)) {
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setDouble(3, salary);
                        ps.setInt(4, years);
                        ps.executeUpdate();
                        System.out.println("Record inserted successfully.");
                    }
                } else if (choice == 2) {
                    System.out.println("Enter ID to update and new Salary:");
                    int id = sc.nextInt();
                    double salary = sc.nextDouble();
                    String query = "UPDATE student_db SET salary = ? WHERE id = ?";
                    try (PreparedStatement ps = con.prepareStatement(query)) {
                        ps.setDouble(1, salary);
                        ps.setInt(2, id);
                        ps.executeUpdate();
                        System.out.println("Record updated successfully.");
                    }
                } else if (choice == 3) {
                    System.out.println("Enter ID to delete:");
                    int id = sc.nextInt();
                    String query = "DELETE FROM student_db WHERE id = ?";
                    try (PreparedStatement ps = con.prepareStatement(query)) {
                        ps.setInt(1, id);
                        ps.executeUpdate();
                        System.out.println("Record deleted successfully.");
                    }
                } else if (choice == 4) {
                    String query = "SELECT * FROM student_db";
                    try (PreparedStatement ps = con.prepareStatement(query);
                         ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " +
                                               rs.getDouble("salary") + " " + rs.getInt("years"));
                        }
                    }
                } else if (choice == 5) {
                    System.out.println("Exiting program.");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
