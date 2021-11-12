package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewDelete {
    public static void main(String[] args) {
       try {
            int idDeletado = 3;

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

            //SQL injection
            String sql = "DELETE FROM categoria WHERE id=?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);
            prepStatement.execute();

            int linhasDeletadas = prepStatement.getUpdateCount();
            System.out.printf("Foram deletadas %d linha(s)", linhasDeletadas);

            conn.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}
