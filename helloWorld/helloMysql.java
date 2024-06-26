import java.sql.*;


public class helloMysql {
    static final String DB_URL = "jdbc:mysql://localhost/javaMysql";
    static final String USER = "nader";
    static final String PASS = "2060";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";
 
    public static void main(String[] args) {
       // Open a connection
       try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) {
          // Extract data from result set
          while (rs.next()) {
             // Retrieve by column name
             System.out.print("ID: " + rs.getInt("id"));
             System.out.print(", Age: " + rs.getInt("age"));
             System.out.print(", First: " + rs.getString("first"));
             System.out.println(", Last: " + rs.getString("last"));
          }
       } catch (SQLException e) {
          e.printStackTrace();
       } 
    }
 }
