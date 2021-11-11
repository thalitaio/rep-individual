package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42. OK
//Faça o download do driver JDBC para o postgres e configure no seu projeto. OK
public class View {
    
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
        conn.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
 }
    
}