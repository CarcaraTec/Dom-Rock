package sql;

import getset.variables;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.AjudaDown;
import model.Bronze;
import model.BronzeDown;
import model.Gold;
import model.GoldDown;
import model.Silver;
import model.UsuarioUP;

public class crudsql extends conexionsql {

    java.sql.Statement st;
    ResultSet rs;
    List<variables> var = new ArrayList();
    List<Silver> sil = new ArrayList();
    List<UsuarioUP> us = new ArrayList();
    List<Bronze> bronze = new ArrayList();
    List<Gold> gold = new ArrayList();
    List<GoldDown> gol = new ArrayList();
    List<AjudaDown> help = new ArrayList();
     List<BronzeDown> bdown = new ArrayList();

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
            //String sql = "select * from escopo where cnpj='" + cnpj+ "';";
            String sql = "select * from cliente order by nome_empresa asc;";
            rs = st.executeQuery(sql);
                    
            while (rs.next()) {
                System.out.println(rs.getString("nome_empresa"));
                variables empresa = new variables();
                empresa.setCnpj(Objects.isNull(rs.getString("cnpj_cliente")) ? "-" : rs.getString("cnpj_cliente"));
                empresa.setNome_empresa(Objects.isNull(rs.getString("nome_empresa"))? "-" : rs.getString("nome_empresa"));
                empresa.setNome_empresa(Objects.isNull(rs.getString("objetivo_negocio"))? "-" : rs.getString("objetivo_negocio"));
                
                
                var.add(empresa);
            }
            /* else {
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
            }*/
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
    

        public void mostrar2(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql =/* "select * from cliente where cnpj_cliente='" + cnpj+"';"*/
                    "select * from cadastro_escopo where cnpj='" + cnpj+ "';";
            rs = st.executeQuery(sql);
            variables empresa = new variables();       
            if (rs.next()) {
                //System.out.println(rs.getString("nome_empresa"));
                empresa.setCnpj/*(Objects.isNull*/(rs.getString("cnpj"))/* ? "-" : rs.getString("cnpj"))*/;
               // empresa.setNome_empresa/*(Objects.isNull*/(rs.getString("nome_empresa"))/*? "-" : rs.getString("nome_empresa"))*/;
               // empresa.setObjetivo_neg(rs.getString("objetivo_negocio"));
                empresa.setEntregavel_min(rs.getString("entregavel_min"));
                empresa.setEntregaveis_possi(rs.getString("entregaveis_possi"));
               // empresa.setSolucao(rs.getString("solucao"));
                empresa.setProduto(rs.getString("produto"));
                empresa.setFuncionalidade(rs.getString("funcionalidade"));
                empresa.setCore(rs.getString("core"));
                 empresa.setEstrutura(rs.getString("estrutura"));
                  empresa.setVolume(rs.getString("volume"));
                
                var.add(empresa);
            }
            else {
                empresa.setCnpj("");
                empresa.setNome_empresa("");
                empresa.setObjetivo_neg("");
                empresa.setEntregavel_min("");
                empresa.setEntregaveis_possi("");
                empresa.setSolucao("");
                empresa.setProduto("");
                empresa.setFuncionalidade("");
                empresa.setCore("");
                var.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void mostrarCliente(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql ="select * from cliente where cnpj_cliente='" + cnpj+ "';";
            rs = st.executeQuery(sql);
            variables empresa = new variables();       
            if (rs.next()) {
                //System.out.println(rs.getString("nome_empresa"));
                empresa.setCnpj/*(Objects.isNull*/(rs.getString("cnpj_cliente"))/* ? "-" : rs.getString("cnpj"))*/;
               // empresa.setNome_empresa/*(Objects.isNull*/(rs.getString("nome_empresa"))/*? "-" : rs.getString("nome_empresa"))*/;
               // empresa.setObjetivo_neg(rs.getString("objetivo_negocio"));
                empresa.setNome_empresa(rs.getString("nome_empresa"));
                empresa.setObjetivo_neg(rs.getString("objetivo_negocio"));
               // empresa.setSolucao(rs.getString("solucao"));
                
                var.add(empresa);
            }
            else {
                empresa.setCnpj("");
                empresa.setNome_empresa("");
                empresa.setObjetivo_neg("");
                empresa.setEntregavel_min("");
                empresa.setEntregaveis_possi("");
                empresa.setSolucao("");
                empresa.setProduto("");
                empresa.setFuncionalidade("");
                empresa.setCore("");
                var.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void mostrarSilver(String cnpjsilver) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();

            String sql = "select * from silver where cnpjsilver='"+cnpjsilver+"';";
            rs = st.executeQuery(sql);
                    
            while (rs.next()) {
                System.out.println(rs.getString("status"));
                Silver empresa = new Silver();
                empresa.setNomeSilver(Objects.isNull(rs.getString("nomeSilver")) ? "-" : rs.getString("nomeSilver"));
                empresa.setStatus(Objects.isNull(rs.getString("status"))? "-" : rs.getString("status"));
                empresa.setProblema(rs.getString("problema"));
                empresa.setCnpj(rs.getString("cnpjSilver"));
                
                sil.add(empresa);
            }
            
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        
        public void mostrarUsuario(String usuario) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from usuario where usuario='" + usuario+ "';";
            rs = st.executeQuery(sql);
            UsuarioUP empresa = new UsuarioUP();       
            if (rs.next()) {
                System.out.println(rs.getString("usuario"));
                empresa.setUsuario(Objects.isNull(rs.getString("usuario")) ? "-" : rs.getString("usuario"));
                empresa.setSenha(Objects.isNull(rs.getString("senha"))? "-" : rs.getString("senha"));
                empresa.setNivelAcesso(Objects.isNull(rs.getString("nivelacesso"))? "-" : rs.getString("nivelacesso"));
                
                
                us.add(empresa);
            }
            else {
                empresa.setUsuario("");
                empresa.setSenha("");
                
                us.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        
        public void mostrarBronze(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from bronze where cnpj='" + cnpj+ "';";
            rs = st.executeQuery(sql);
            Bronze empresa = new Bronze();       
            if (rs.next()) {
                System.out.println(rs.getString("origem"));
                empresa.setCnpj(Objects.isNull(rs.getString("cnpj")) ? "-" : rs.getString("cnpj"));
                empresa.setOrigem(Objects.isNull(rs.getString("origem"))? "-" : rs.getString("origem"));
                empresa.setFormato(rs.getString("formato"));
                empresa.setSistema(rs.getString("sistema"));
                empresa.setVolume(rs.getString("volume"));
                empresa.setFrequencia(rs.getString("frequencia"));
                
                
                bronze.add(empresa);
            }
            else {
                empresa.setCnpj("");
                empresa.setOrigem("");
                empresa.setFormato("");
                empresa.setSistema("");
                empresa.setVolume("");
                empresa.setFrequencia("");    
                bronze.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        }
        public void mostrarGoldTable(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            //String sql = "select * from escopo where cnpj='" + cnpj+ "';";
            String sql = "select * from gold where cnpj='"+cnpj+"';";
            rs = st.executeQuery(sql);
                    
            while (rs.next()) {
                System.out.println(rs.getString("tipoSilver"));
                GoldDown empresa = new GoldDown();
                empresa.setTipoSilver(Objects.isNull(rs.getString("tipoSilver"))? "-" : rs.getString("tipoSilver"));
                empresa.setNomeGold(rs.getString("nomeGold"));
                
                
                gol.add(empresa);
            }
            
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void mostrarBronzeTable(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            //String sql = "select * from escopo where cnpj='" + cnpj+ "';";
            String sql = "select * from bronze where cnpj='"+cnpj+"';";
            rs = st.executeQuery(sql);
                    
            while (rs.next()) {
                System.out.println(rs.getString("origem"));
                BronzeDown empresa = new BronzeDown();
                empresa.setOrigem(Objects.isNull(rs.getString("origem"))? "-" : rs.getString("origem"));
                empresa.setFormato(rs.getString("formato"));
                empresa.setSistema(rs.getString("sistema"));
                empresa.setVolume(rs.getString("volume"));
                empresa.setFrequencia(rs.getString("frequencia"));
                empresa.setCnpj(Objects.isNull(rs.getString("cnpj")) ? "-" : rs.getString("cnpj"));
                
                
                bdown.add(empresa);
            }
            
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
         public void mostrarGold(String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from gold where cnpj='" + cnpj+ "';";
            rs = st.executeQuery(sql);
            Gold empresa = new Gold();       
            if (rs.next()) {
                System.out.println(rs.getString("tipoSilver"));
                empresa.setCnpj(Objects.isNull(rs.getString("cnpj")) ? "-" : rs.getString("cnpj"));
                empresa.setTipoSilver(Objects.isNull(rs.getString("tipoSilver"))? "-" : rs.getString("tipoSilver"));
                empresa.setNomeGold(rs.getString("nomeGold"));
                
                
                
                gold.add(empresa);
            }
            else {
                empresa.setTipoSilver("");
                empresa.setNomeGold("");
                gold.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
        }
        
         public void nivel(String usuario) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from usuario where usuario='" + usuario+ "';";
            rs = st.executeQuery(sql);
            UsuarioUP empresa = new UsuarioUP();  
            empresa.setNivelAcesso(Objects.isNull(rs.getString("nivelAcesso"))? "-" : rs.getString("nivelAcesso"));
            if (empresa.getNivelAcesso()=="suporte") {
                Mostrar mos = new Mostrar();
                mos.setVisible(true);
                

            }
            else {

                us.add(empresa);
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Sem registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
         public void mostrarAjuda(String nome) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            //String sql = "select * from escopo where cnpj='" + cnpj+ "';";
            String sql = "select * from ajuda;";
            rs = st.executeQuery(sql);
                    
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
                AjudaDown empresa = new AjudaDown();
                empresa.setNome(Objects.isNull(rs.getString("nome"))? "-" : rs.getString("nome"));
                empresa.setTelefone(Objects.isNull(rs.getString("telefone"))? "-" : rs.getString("telefone"));
                empresa.setEmail(Objects.isNull(rs.getString("email"))? "-" : rs.getString("email"));
                empresa.setMensagem(Objects.isNull(rs.getString("mensagem"))? "-" : rs.getString("mensagem"));
                
                
                help.add(empresa);
            }
            
            st.close();
            conexion.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Programa " + e, "Erro no sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void atualizarUsuario(String usuario, String nivelAcesso) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update usuario set usuario='" + usuario + "',nivelAcesso='" + nivelAcesso +"' where usuario='" + usuario + "'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Usuario atualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void atualizar(String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String solucao, String produto, String funcionalidade, String core, String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql;
            sql = "update cadastro_escopo set entregavel_min='" + entregavel_min +"',entregaveis_possi='" + entregaveis_possi +"',produto='" + produto +"',funcionalidade='" + funcionalidade +"',core='" + core +"' where cnpj='" + cnpj + "'; "
                    +"update cliente set nome_empresa='"+nome_empresa+"',objetivo_negocio='" + objetivo_neg + "'where cnpj_cliente='" + cnpj + "'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro atualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void atualizarBronze(String origem, String formato, String sistema, String volume, String frequencia, String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql;
            sql = "update bronze set origem='" + origem +"',formato='" + formato +"',sistema='" + sistema +"',volume='" + volume +"',frequencia='" + frequencia +"' where cnpj='" + cnpj + "'; ";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro atualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void atualizarGold(String tipoSilver, String nomeGold, String cnpj) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql;
            sql = "update gold set tipoSilver='" + tipoSilver +"',nomeGold='" + nomeGold +"'; ";
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
            String sql="delete from cadastro_escopo where cnpj='"+cnpj+"'; "
                    +"delete from bronze where cnpj='"+cnpj+"'; "
                    +"delete from gold where cnpj='"+cnpj+"'; "
                    +"delete from cliente where cnpj_cliente='"+cnpj+"'; ";
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

    public List<variables> getVar() {
        return var;
    }

    public List<Silver> getSil() {
        return sil;
    }

    public List<Bronze> getBronze() {
        return bronze;

    }
    public List<GoldDown> getGol() {
        return gol;
}
    public List<AjudaDown> getHelp() {
        return help;
}
    public List<BronzeDown> getBdown() {
        return bdown;
}

    public void atualizar(String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String solucao, String produto, String funcionalidade, String core, String cnpj, String estrutura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    

    
    
    
    

