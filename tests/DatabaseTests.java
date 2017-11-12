import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import utils.SQLQueries;

public class DatabaseTests {

    //helper method
    public Connection startConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        SQLQueries.createDatabase(conn);
        return conn;
    }

}
