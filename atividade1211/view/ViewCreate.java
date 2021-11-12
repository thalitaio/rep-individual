package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewCreate {
    public static void main(String[] args) {
        try {
            String nome = "Computador";
            String descricao = "Topper";

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


            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria(nome, descricao)VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

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
