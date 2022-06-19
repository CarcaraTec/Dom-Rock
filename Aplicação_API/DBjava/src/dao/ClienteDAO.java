/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Escopo;

/**
 *
 * @author Igor
 */
public class ClienteDAO {
    private final Connection connection;
    
    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    
public void insert(Escopo usuario) throws SQLException {
        
        String sql = "insert into cliente(cnpj_cliente, nome_empresa, objetivo_negocio) values ('"+usuario.getCnpj()+"', '"+usuario.getNome_empresa()+"', '"+usuario.getObjetivo_neg()+"');";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
