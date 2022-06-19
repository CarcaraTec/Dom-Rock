
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Silver;
import model.SilverDown;
/**
 *
 * @author Igor
 */
public class SilverDAO {
    private final Connection connection;
    
    public SilverDAO(Connection connection) {
        this.connection = connection;
    }
    
  
    public void insert(SilverDown usuario) throws SQLException {
        String sql = "insert into silver(nomeSilver, status, problema, cnpjSilver) values ('"+usuario.getNomeSilver()+"','"+usuario.getStatus()+"','"+usuario.getProblema()+"','"+usuario.getCnpjSilver()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }

    }

