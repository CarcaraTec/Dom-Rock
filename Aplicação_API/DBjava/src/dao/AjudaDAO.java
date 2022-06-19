/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Ajuda;
import view.Inicio;
/**
 *
 * @author Wesley
 */
public class AjudaDAO {
    private final Connection connection;
    
    public AjudaDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Ajuda usuario) throws SQLException {
        
        String sql = "insert into ajuda(nome, telefone, email, mensagem) values ('"+usuario.getNome()+"','"+usuario.getTelefone()+"','"+usuario.getEmail()+"','"+usuario.getMensagem()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }

}