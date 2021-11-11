package view;
//Na classe2, insira um novo produto na tabela e imprima o id gerado.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
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
            String sql = "INSERT INTO PRODUTO(nomezaum, descricao, preco, catid)VALUES('Produto Novíssimo3', 'adicionado com java', 50.00, 7)";
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
