/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import model.UsuarioUP;

/**
 *
 * @author Administrador
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        
             String sql = "insert into usuario (usuario,senha,nivelacesso) values ('"+usuario.getUsuario()+"','"+usuario.getSenha()+"','Usuario'); ";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.execute();
             
             

    
        
    }

    public boolean existePorUsuarioESenha(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where usuario = '"+usuario.getUsuario()+"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
        
        
    }

    public void insert(UsuarioUP usuariopedro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    }

    

