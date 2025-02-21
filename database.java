import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:makeup.db";

    public static void connect() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            System.out.println("Connected to SQLite");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS products (id INTEGER PRIMARY KEY, name TEXT, category TEXT, shade TEXT, brand TEXT)";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
