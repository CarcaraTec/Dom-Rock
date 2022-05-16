package sql;

import getset.variables;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class crudsql extends conexionsql {

    java.sql.Statement st;
    ResultSet rs;
    variables var = new variables();

    public void insertar(String cnpj, String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String solucao, String produto, String funcionalidade, String core) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into escopo(cnpj,nome_empresa,objetivo_neg,entregavel_min,entregaveis_possi,solucao,produto,funcionalidade,core) values('" + cnpj + "','" + nome_empresa + "','" + objetivo_neg + "','"+entregavel_min+"','"+entregaveis_possi+"','"+solucao+"','"+produto+"','"+funcionalidade+"','"+core+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from escopo where cnpj='" + cnpj+ "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var.setCnpj(rs.getString("cnpj"));
                var.setNome_empresa(rs.getString("nome_empresa"));
                var.setObjetivo_neg(rs.getString("objetivo_neg"));
                var.setEntregavel_min(rs.getString("entregavel_min"));
                var.setEntregaveis_possi(rs.getString("entregaveis_possi"));
                var.setSolucao(rs.getString("solucao"));
                var.setProduto(rs.getString("produto"));
                var.setFuncionalidade(rs.getString("funcionalidade"));
                var.setCore(rs.getString("core"));
            } else {
                var.setCnpj("");
                var.setNome_empresa("");
                var.setObjetivo_neg("");
                var.setEntregavel_min("");
                var.setEntregaveis_possi("");
                var.setSolucao("");
                var.setProduto("");
                var.setFuncionalidade("");
                var.setCore("");
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar(String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String solucao, String produto, String funcionalidade, String core, String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update escopo set nome_empresa='" + nome_empresa + "',objetivo_neg='" + objetivo_neg + "',entregavel_min='" + entregavel_min +"',entregaveis_possi='" + entregaveis_possi +"',solucao='" + solucao +"',produto='" + produto +"',funcionalidade='" + funcionalidade +"',core='" + core +"' where cnpj='" + cnpj + "'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro atualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminar(String cnpj){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql="delete from escopo where cnpj='"+cnpj+"'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro deletado corretamente","Deletado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar registro "+ e,"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertar(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
