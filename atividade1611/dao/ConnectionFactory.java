package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private String url;
    private String user;
    private String pwd;
    private DataSource dataSource;

    public ConnectionFactory(){
        this.url = "jdbc:postgresql://localhost:5432/postgres";
        this.user = "postgres";
        this.pwd = "123456";
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl(this.url);
        pool.setUser(this.user);
        pool.setPassword(this.pwd);
        pool.setMaxPoolSize(50);
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
