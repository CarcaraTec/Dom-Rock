package view;

import dao.Conexao;
import dao.AjudaDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ajuda;

public class AjudaView extends javax.swing.JFrame {

    public AjudaView() {
        initComponents();
    }

    private AjudaView(String nome, String telefone, String email, String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAjudaNome = new javax.swing.JLabel();
        labelAjudaMensagem = new javax.swing.JLabel();
        labelAjudaTelefone = new javax.swing.JLabel();
        labelAjudaEmail = new javax.swing.JLabel();
        txtNomeAjuda = new javax.swing.JTextField();
        txtEmailAjuda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagemAjuda = new javax.swing.JTextArea();
        btnAjudaEnviar = new javax.swing.JButton();
        txtTelefoneAjuda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        labelAjudaNome.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelAjudaNome.setForeground(new java.awt.Color(240, 240, 240));
        labelAjudaNome.setText("Nome: ");
        getContentPane().add(labelAjudaNome);
        labelAjudaNome.setBounds(290, 160, 60, 21);

        labelAjudaMensagem.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelAjudaMensagem.setForeground(new java.awt.Color(240, 240, 240));
        labelAjudaMensagem.setText("Mensagem: ");
        getContentPane().add(labelAjudaMensagem);
        labelAjudaMensagem.setBounds(250, 330, 100, 30);

        labelAjudaTelefone.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelAjudaTelefone.setForeground(new java.awt.Color(240, 240, 240));
        labelAjudaTelefone.setText("Telefone: ");
        getContentPane().add(labelAjudaTelefone);
        labelAjudaTelefone.setBounds(270, 210, 80, 30);

        labelAjudaEmail.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        labelAjudaEmail.setForeground(new java.awt.Color(240, 240, 240));
        labelAjudaEmail.setText("E-mail: ");
        getContentPane().add(labelAjudaEmail);
        labelAjudaEmail.setBounds(280, 260, 64, 30);

        txtNomeAjuda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNomeAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeAjuda);
        txtNomeAjuda.setBounds(360, 160, 600, 40);

        txtEmailAjuda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        getContentPane().add(txtEmailAjuda);
        txtEmailAjuda.setBounds(360, 260, 600, 40);

        txtMensagemAjuda.setColumns(20);
        txtMensagemAjuda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtMensagemAjuda.setRows(5);
        jScrollPane1.setViewportView(txtMensagemAjuda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 340, 600, 140);

        btnAjudaEnviar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnAjudaEnviar.setText("Enviar");
        btnAjudaEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjudaEnviar);
        btnAjudaEnviar.setBounds(870, 500, 90, 30);

        txtTelefoneAjuda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtTelefoneAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefoneAjuda);
        txtTelefoneAjuda.setBounds(360, 210, 600, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 700);

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Inicio in = new Inicio();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_formWindowOpened

    private void txtNomeAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAjudaActionPerformed

    private void btnAjudaEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaEnviarActionPerformed
        if(txtNomeAjuda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório, favor preencher", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtTelefoneAjuda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Telefone é obrigatório, favor preencher", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtEmailAjuda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Email é obrigatório, favor preencher", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtMensagemAjuda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Mensagem é obrigatório, favor preencher", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        String nome = txtNomeAjuda.getText();
        String telefone = txtTelefoneAjuda.getText();
        String mensagem = txtMensagemAjuda.getText();
        String email = txtEmailAjuda.getText();

        Ajuda usuarioluiz = new Ajuda(nome, telefone, email, mensagem);

        try {
            Connection conexao = new Conexao().getConnection();
            AjudaDAO cadastro = new AjudaDAO(conexao);
            cadastro.insert(usuarioluiz);
            JOptionPane.showMessageDialog(null, "Mensagem enviada.", "Suporte", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(AjudaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAjudaEnviarActionPerformed

    private void txtTelefoneAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneAjudaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        Inicio in = new Inicio();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjudaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjudaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjudaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjudaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjudaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjudaEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAjudaEmail;
    private javax.swing.JLabel labelAjudaMensagem;
    private javax.swing.JLabel labelAjudaNome;
    private javax.swing.JLabel labelAjudaTelefone;
    private javax.swing.JTextField txtEmailAjuda;
    private javax.swing.JTextArea txtMensagemAjuda;
    private javax.swing.JTextField txtNomeAjuda;
    private javax.swing.JFormattedTextField txtTelefoneAjuda;
    // End of variables declaration//GEN-END:variables
}
