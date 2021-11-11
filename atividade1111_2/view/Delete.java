package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Na classe4, delete um produto pelo id.
public class Delete {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
    
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            String user = "postgres";
            String pwd = "123456";
            
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM produto WHERE id = 6";
            statement.execute(sql);
            int exibeLinhas = statement.getUpdateCount();
            System.out.println(exibeLinhas);


            conn.close();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
