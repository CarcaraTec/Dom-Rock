/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Bronze;
/**
 *
 * @author Igor
 */
public class BronzeDAO {
    private final Connection connection;
    
    public BronzeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Bronze usuario) throws SQLException {
        
        String sql = "insert into bronze(origem, formato, sistema, volume, frequencia, cnpj) values ('"+usuario.getOrigem()+"','"+usuario.getFormato()+"','"+usuario.getSistema()+"','"+usuario.getVolume()+"','"+usuario.getFrequencia()+"', '"+usuario.getCnpj()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
