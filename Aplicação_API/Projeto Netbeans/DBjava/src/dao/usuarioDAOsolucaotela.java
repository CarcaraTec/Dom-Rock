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
import model.SolucaoTela;
import view.FormCadastrosolucoes;
/**
 *
 * @author kiraisk
 */
public class usuarioDAOsolucaotela {
    
    private final Connection connection;
    
    public usuarioDAOsolucaotela(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(SolucaoTela usuario) throws SQLException {
        
        String sql = "insert into solucao(nome_solucao,produto,core) values ('"+usuario.getNome_solucao()+"','"+usuario.getProduto()+"','"+usuario.getCore()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
