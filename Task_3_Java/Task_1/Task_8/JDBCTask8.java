import java.sql.*;

class JDBCTask8 {
    static void insertEmployee(Connection con, int id, String name, double salary, int years) throws SQLException {
        String query = "INSERT INTO Employee (id, name, salary, years) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, salary);
        ps.setInt(4, years);
        ps.executeUpdate();
    }

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("your_database_url", "your_username", "your_password");
        insertEmployee(con, 1, "Danial", 7586000, 2);
        insertEmployee(con, 2, "Harry", 1000000, 8);
        con.close();
    }
}
