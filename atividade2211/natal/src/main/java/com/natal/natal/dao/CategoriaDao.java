package com.natal.natal.dao;
//_  Crie uma cópia das classes criadas durante a atividade ATP50. OK
//_  Altere aplicação para separar a camada de acesso ao banco da camada de visualização.
//_  Crie uma camada DAO e nela uma classe CategoriaDAO que irá realizar as operações de CRUD no banco com JDBC. OK
//_  Ajuste as classes de view para utilizarem a classe CategoriaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.natal.natal.models.CategoriaModel;

public class CategoriaDao {
    //Create
    public int create(CategoriaModel model) {
        int idGerado = 0;
        try (Connection conn = new ConnectionFactory().getConnection())
        {
            String sql = "INSERT INTO categoria(nome, descricao)VALUES(?, ?)";

           try (PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
                prepStatement.setString(1, model.getNome());
                prepStatement.setString(2, model.getDescricao());

                prepStatement.execute();
                ResultSet ids = prepStatement.getGeneratedKeys();
            while (ids.next()) {
                idGerado = ids.getInt("id");
            }
           } catch (SQLException e) {
                e.printStackTrace();
            }    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idGerado;
    }
    //Read
    public ArrayList<CategoriaModel> read(String nome) {
        ArrayList<CategoriaModel> lista = new ArrayList<CategoriaModel>();
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria WHERE nome = ?");
            prepStatement.setString(1, nome);
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            lista = createList(result);
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return lista;
    }

    //Read sem parâmetros
    public ArrayList<CategoriaModel> read() {
        ArrayList<CategoriaModel> lista = new ArrayList<CategoriaModel>();
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            lista = createList(result);
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return lista;
    }

    public ArrayList<CategoriaModel> createList(ResultSet result) throws SQLException {
        ArrayList<CategoriaModel> lista = new ArrayList<CategoriaModel>();
        while(result.next()){
            CategoriaModel model = new CategoriaModel();                
            model.setId(result.getInt("id"));
            model.setNome(result.getString("nome"));
            model.setDescricao(result.getString("descricao"));
            lista.add(model);
        }
        return lista;
    }

    //Update
    public  void update(CategoriaModel model) {
        try(Connection conn = new ConnectionFactory().getConnection()) 
           {
                String sql = "UPDATE categoria SET nome=?, descricao=? WHERE id=?";
                try (PreparedStatement prepStatement = conn.prepareStatement(sql);) {
                    prepStatement.setString(1, model.getNome());
                    prepStatement.setString(2, model.getDescricao());
                    prepStatement.setInt(3, model.getId());
                    prepStatement.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }
    //Delete
    public int delete(CategoriaModel model) {
        int linhasDeletadas = 0;
        try(Connection conn = new ConnectionFactory().getConnection()) {
                int idDeletado = model.getId();
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

