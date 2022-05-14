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
import view.FormEscopo;
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
        
        String sql = "insert into escopo(cnpj, nome_empresa, objetivo_neg, entregavel_min, entregaveis_possi, solucao, produto, "
                + "funcionalidade, core, estrutura_min_vox, volume_vox, estrutura_min_mktEplan, volume_mktEplan, estrutura_min_sales, "
                + "volume_sales, estrutura_min_pricing, volume_pricing, estrutura_min_optimization, volume_optimization, estrutura_min_matching, volume_matching) values ('"+usuario.getCnpj()+"','"+usuario.getNome_empresa()+"','"+usuario.getObjetivo_neg()+"','"+usuario.getEntregavel_min()+"'"
                + ",'"+usuario.getEntregaveis_possi()+"','"+usuario.getSolucao()+"','"+usuario.getProduto()+"','"+usuario.getFuncionalidade()+"','"+usuario.getCore()+"','"+usuario.getEstrutura_min_vox()+"','"+usuario.getVolume_vox()+"','"+usuario.getEstrutura_min_mktEplan()+"','"+usuario.getVolume_mktEplan()+"'"
                + ",'"+usuario.getEstrutura_min_sales()+"','"+usuario.getVolume_sales()+"','"+usuario.getEstrutura_min_pricing()+"','"+usuario.getVolume_pricing()+"','"+usuario.getEstrutura_min_optimization()+"','"+usuario.getVolume_optimization()+"','"+usuario.getEstrutura_min_matching()+"','"+usuario.getVolume_matching()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
