package view2;
//delete as ultimas categorias cadastradas.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try {
            //conectando ao banco
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            String user = "postgres";
            String pwd = "123456";
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            //conectado
            Statement statement = conn.createStatement();
            
            String sql = "DELETE FROM categoria WHERE id=8 OR id=7";
            statement.execute(sql);
            System.out.print("Deletado com sucesso");

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}
