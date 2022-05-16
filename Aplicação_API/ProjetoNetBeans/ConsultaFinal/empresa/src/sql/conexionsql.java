
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn=null;
    String url="jdbc:postgresql://localhost:5432/dbjava";
    String usuario="postgres";
    String clave="postgres";
    
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,usuario,clave);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    return conn;
    }
    
}
