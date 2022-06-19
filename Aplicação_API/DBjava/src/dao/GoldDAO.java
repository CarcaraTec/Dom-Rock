/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author walla
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Gold;
/**
 *
 * @author Igor
 */
public class GoldDAO {
    private final Connection connection;
    

    public GoldDAO(Connection connection) {
        this.connection = connection;
    }
    
  
    public void insert(Gold usuario) throws SQLException {
        String sql = "insert into gold(tipoSilver, nomeGold, cnpj) values ('"+usuario.getTipoSilver()+"','"+usuario.getNomeGold()+"','"+usuario.getCnpj()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
