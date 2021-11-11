package view;
// Na classe1, liste todos os dados de todas as colunas da tabela produto.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Read {
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
            

            statement.execute("SELECT * FROM PRODUTO");
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                int cat_id = result.getInt("catid");
                String nome = result.getString("nomezaum");
                String descricao = result.getString("descricao");
                Float preco = result.getFloat("preco");

                
                System.out.printf("%d - % d - %s - %s - %.2f \n", id, cat_id, nome, descricao, preco);
            }

            conn.close();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
