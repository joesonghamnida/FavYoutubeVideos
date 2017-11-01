import org.h2.tools.Server;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args)throws SQLException{

        //deals with h2 db server
        Server.createWebServer().start();
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");

    }
}
