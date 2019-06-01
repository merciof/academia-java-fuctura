/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author JAVA
 */
public class conexao {
    
    private final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String user = "mercio";
    private final String password = "admin";
    private Connection connection;
    
    private Connection getConnection() throws SQLException, ClassNotFoundException {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            connection = DriverManager.getConnection(jdbcUrl, user, password);
//            connection.close();

            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            connection = ds.getConnection(user, password);
            
            System.out.println("banco conectado");
            
            return connection;
    }    
    
    private void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println( "Erro ao fechar conexão com o bd: " + ex.getMessage());
        }
    }
}
