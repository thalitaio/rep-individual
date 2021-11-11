package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {
    public static void main(String[] args) {
        try{
            //conectando ao banco
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = conn.createStatement();
            
            // Statement - query SQL
            statement.execute("SELECT * FROM PRODUTO");
            // Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            //imprimir resultado
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nomezaum");
                String descricao = result.getString("descricao");
                System.out.printf("%d %s %s \n",id, nome, descricao);
            }

            conn.close();
        } catch(SQLException e){
            //System.out.println("Nâo foi possível conectar.");
            e.printStackTrace();
        }
        
    }
}
