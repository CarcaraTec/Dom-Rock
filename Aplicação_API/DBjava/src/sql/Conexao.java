/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbjava", "postgres", "postgres");
        return conexao;
    }
}
