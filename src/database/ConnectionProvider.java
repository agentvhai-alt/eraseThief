package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getCon() throws SQLException, ClassNotFoundException {
        if (con == null || con.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            System.out.println("✅ Database Connected Successfully");
        }
        return con;
    }
}

