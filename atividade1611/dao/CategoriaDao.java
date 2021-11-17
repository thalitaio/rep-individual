package dao;
//_  Crie uma cópia das classes criadas durante a atividade ATP50. OK
//_  Altere aplicação para separar a camada de acesso ao banco da camada de visualização.
//_  Crie uma camada DAO e nela uma classe CategoriaDAO que irá realizar as operações de CRUD no banco com JDBC.
//_  Ajuste as classes de view para utilizarem a classe CategoriaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;
import view.ConnectionFactory;

public class CategoriaDao {
    //Create
    public void create(Categoria model) {
        try (Connection conn = new ConnectionFactory().getConnection())
        {
            String sql = "INSERT INTO categoria(nome, descricao)VALUES(?, ?)";

           try (PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
                prepStatement.setString(1, model.getNome());
                prepStatement.setString(2, model.getDescricao());

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
    //Read
    public ArrayList<Categoria> read() {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet resultado = prepStatement.getResultSet();
            
            while (resultado.next()) {
                Categoria model = new Categoria();
                model.setId(resultado.getInt("id"));
                model.setNome(resultado.getString("nome"));
                model.setDescricao(resultado.getString("descricao"));
                lista.add(model);
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return lista;
    }

    //Update
    public  void update(Categoria model) {
        try(Connection conn = new ConnectionFactory().getConnection()) 
           {
                String sql = "UPDATE categoria SET nome=?, descricao=? WHERE id=?";
                try (PreparedStatement prepStatement = conn.prepareStatement(sql);) {
                    prepStatement.setString(1, model.getNome());
                    prepStatement.setString(2, model.getDescricao());
                    prepStatement.setInt(3, model.getID());
                    prepStatement.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }
    //Delete
    public int delete(Categoria model) {
        int linhasDeletadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {
                int idDeletado = model.getID();
                String sql = "DELETE FROM categoria WHERE id=?";
                try(PreparedStatement prepStatement = conn.prepareStatement(sql);)
                {
                    prepStatement.setInt(1, idDeletado);
                    prepStatement.execute();
                    linhasDeletadas = prepStatement.getUpdateCount();
                }catch(SQLException e){
                    e.printStackTrace();
                }
           } catch (SQLException e) {
               e.printStackTrace();
           }
        return linhasDeletadas;
    }

}

