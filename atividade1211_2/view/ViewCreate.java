package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewCreate {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection())
        {
            String nome = "Computador3";
            String descricao = "Topper3";
            String sql = "INSERT INTO categoria(nome, descricao)VALUES(?, ?)";

           try (PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
                prepStatement.setString(1, nome);
                prepStatement.setString(2, descricao);

                prepStatement.execute();
                ResultSet ids = prepStatement.getGeneratedKeys();
            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.println(id);
            }
           } catch (SQLException e) {
                e.printStackTrace();
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    
    }

}
