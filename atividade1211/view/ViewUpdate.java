package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {
    public static void main(String[] args) {

       try {
           //alteracoes
            String nome = "Alteração Better";
            String descricao = "para a atividade 48 melhorada";
            int id = 6;

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

            String sql1 = "UPDATE categoria SET nome=?, descricao=? WHERE id=?";

            PreparedStatement prepStatement1 = conn.prepareStatement(sql1);

            prepStatement1.setString(1, nome);
            prepStatement1.setString(2, descricao);
            prepStatement1.setInt(3, id);

            prepStatement1.execute();

            conn.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }

    }
}
