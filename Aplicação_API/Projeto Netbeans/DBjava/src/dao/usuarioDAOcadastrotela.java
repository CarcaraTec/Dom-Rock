/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UsuarioTela;
import view.FormCadastroTela;

/**
 *
 * @author Administrador
 */
public class usuarioDAOcadastrotela {
    
    private final Connection connection;

    public usuarioDAOcadastrotela(Connection connection) {
        this.connection = connection;
        
    }
    
    public void insert(UsuarioTela usuario) throws SQLException {
        
            
            String sql = "insert into cadastro(nome_da_empresa,cnpj,responsavel,cpf,telefone,email) values ('"+usuario.getNome_da_empresa()+"','"+usuario.getCnpj()+"','"+usuario.getResponsavel()+"','"+usuario.getCpf()+"','"+usuario.getTelefone()+"','"+usuario.getEmail()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
            
            
            
       
    }
    
}
