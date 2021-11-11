package view2;
//Na classe1, liste id e nome de todas as linhas da tabela Categoria.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
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
            statement.execute("SELECT * FROM CATEGORIA");
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("ID: %d - NOME: %s \n", id, nome);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}
