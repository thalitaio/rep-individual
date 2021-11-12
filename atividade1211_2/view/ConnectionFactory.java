package view;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres. OK
//Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.

public class ConnectionFactory {
    private String url;
    private String user;
    private String pwd;

    public ConnectionFactory(){
        this.url = "jdbc:postgresql://localhost:5432/postgres";
        this.user = "postgres";
        this.pwd = "123456";
    }

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(this.url, this.user, this.pwd);
    }
}
