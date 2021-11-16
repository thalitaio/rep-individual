package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewDelete {
    public static void main(String[] args) {
       try(Connection conn = new ConnectionFactory().getConnection()) {
            int idDeletado = 2;
            String sql = "DELETE FROM categoria WHERE id=?";
            try(PreparedStatement prepStatement = conn.prepareStatement(sql);)
            {
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute();
                int linhasDeletadas = prepStatement.getUpdateCount();
                System.out.printf("Foram deletadas %d linha(s)", linhasDeletadas);
            }catch(SQLException e){
                e.printStackTrace();
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}
