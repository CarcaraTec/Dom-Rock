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
        
        String sql = "insert into bronze(origem, formato, sistema, volume_json, freq_json, volume_csv, freq_csv, volume_planilhas, "
                + "freq_planilhas, volume_tabelas, freq_tabelas, volume_pdf, freq_pdf, volume_audio, freq_audio, "
                + "volume_texto, freq_texto) values ('"+usuario.getOrigem()+"','"+usuario.getFormato()+"','"+usuario.getSistema()+"','"+usuario.getVolume_json()+"'"
                + ",'"+usuario.getFreq_json()+"','"+usuario.getVolume_csv()+"','"+usuario.getFreq_csv()+"','"+usuario.getVolume_planilhas()+"','"+usuario.getFreq_planilhas()+"',"
                + "'"+usuario.getVolume_tabelas()+"','"+usuario.getFreq_tabelas()+"','"+usuario.getVolume_pdf()+"','"+usuario.getFreq_pdf()+"'"
                + ",'"+usuario.getVolume_audio()+"','"+usuario.getFreq_audio()+"','"+usuario.getVolume_texto()+"','"+usuario.getFreq_texto()+"'); ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();
    }
}
