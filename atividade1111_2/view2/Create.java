package view2;
//Na classe2, insira uma nova Categoria e imprima o id gerado.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
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
            String sql = "INSERT INTO categoria(nome, descricao)VALUES('Quinta-feira', 'o dia antes de sexta')";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}
