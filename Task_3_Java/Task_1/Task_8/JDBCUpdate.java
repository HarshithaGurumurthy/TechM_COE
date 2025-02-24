import java.sql.*;
import java.util.Scanner;

class JDBCUpdate {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("school_db", "root", "Jamuna@18");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to update:");
        int id = sc.nextInt();
        System.out.println("Enter new salary:");
        double salary = sc.nextDouble();
        String query = "UPDATE Employee SET salary = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setDouble(1, salary);
        ps.setInt(2, id);
        ps.executeUpdate();
        con.close();
    }
}
