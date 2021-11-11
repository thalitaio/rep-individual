package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View2{
    public static void main(String[] args) {
        try {
            /* Quebrando a connection string para ficar mais claro
            */
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            String user = "postgres";
            String pwd = "123456";

            /* conectando ao banco*/
            
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}