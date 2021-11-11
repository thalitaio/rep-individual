package view2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas
public class Update {
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

            
            String sql1 = "UPDATE categoria SET nome ='Categoria Nova' WHERE id = 1";
            String sql2 = "UPDATE categoria SET nome ='Categoria Nova2' WHERE id = 2";
            statement.execute(sql1, statement.RETURN_GENERATED_KEYS);
            int linhasAlteradas1 = statement.getUpdateCount();
            statement.execute(sql2, statement.RETURN_GENERATED_KEYS);
            int linhasAlteradas2 = statement.getUpdateCount();
            System.out.print(linhasAlteradas1 + linhasAlteradas2);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}
