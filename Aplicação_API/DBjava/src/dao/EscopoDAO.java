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
import model.Escopo;
import view.Etapas;
/**
 *
 * @author Igor
 */
public class EscopoDAO {
    private final Connection connection;
    
    public EscopoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Escopo usuario) throws SQLException {
        
        String sql = "insert into cadastro_escopo(cnpj, entregavel_min, entregaveis_possi, produto, estrutura, volume, funcionalidade, core)"
                + "values ('"+usuario.getCnpj()+"','"+usuario.getEntregavel_min()+"','"+usuario.getEntregaveis_possi()+"','"+usuario.getProduto()+"',"
                + "'"+usuario.getEstrutura()+"','"+usuario.getVolume()+"','"+usuario.getFuncionalidade()+"','"+usuario.getCore()+"')";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
