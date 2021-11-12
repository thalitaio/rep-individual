package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {
    public static void main(String[] args) {

       try(Connection conn = new ConnectionFactory().getConnection()) 
       {
            String nome = "Alteração Connection";
            String descricao = "COnnection Factory";
            int id = 6;

            String sql = "UPDATE categoria SET nome=?, descricao=? WHERE id=?";
            try (PreparedStatement prepStatement = conn.prepareStatement(sql);) {
                prepStatement.setString(1, nome);
                prepStatement.setString(2, descricao);
                prepStatement.setInt(3, id);
                prepStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }

    }
}
