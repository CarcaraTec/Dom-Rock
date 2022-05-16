package vistas;

import getset.variables;
import sql.crudsql;

public class mostrar extends javax.swing.JFrame {

    public mostrar() {
        initComponents();
        txcnpj.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcnpj1 = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txcnpj = new javax.swing.JTextField();
        txtentregavelm = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtobjnegocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtentregavelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtproduto = new javax.swing.JTextField();
        txtsolucao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfunc = new javax.swing.JTextField();
        txtcore = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("CNPJ Cliente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 110, 149, 28);

        txtcnpj1.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtcnpj1);
        txtcnpj1.setBounds(400, 110, 190, 30);

        btnbuscar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setPreferredSize(new java.awt.Dimension(65, 30));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(600, 110, 90, 30);

        txcnpj.setPreferredSize(new java.awt.Dimension(10, 30));
        txcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcnpjActionPerformed(evt);
            }
        });
        getContentPane().add(txcnpj);
        txcnpj.setBounds(420, 250, 203, 30);

        txtentregavelm.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtentregavelm);
        txtentregavelm.setBounds(420, 480, 203, 30);

        txtnome.setPreferredSize(new java.awt.Dimension(6, 30));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(420, 330, 203, 30);

        txtobjnegocio.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtobjnegocio);
        txtobjnegocio.setBounds(420, 400, 203, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("CNPJ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 250, 60, 28);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nome Empresa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 330, 165, 28);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Objetivo do Negocio ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 400, 221, 28);

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Entregavel Mínimo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 480, 205, 28);

        btnactualizar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnactualizar.setText("Atualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(800, 110, 105, 40);

        btneliminar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btneliminar.setText("Deletar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(940, 110, 91, 40);

        txtentregavelp.setPreferredSize(new java.awt.Dimension(6, 30));
        txtentregavelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentregavelpActionPerformed(evt);
            }
        });
        getContentPane().add(txtentregavelp);
        txtentregavelp.setBounds(420, 560, 203, 30);

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Entregáveis Possíveis");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 560, 227, 28);

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Solução ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 250, 89, 28);

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Produto");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(820, 320, 87, 28);

        txtproduto.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtproduto);
        txtproduto.setBounds(950, 250, 203, 30);

        txtsolucao.setPreferredSize(new java.awt.Dimension(6, 30));
        txtsolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtsolucao);
        txtsolucao.setBounds(950, 320, 203, 30);

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Funcionalidades");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(730, 390, 175, 28);

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Core");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(860, 470, 50, 28);

        txtfunc.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtfunc);
        txtfunc.setBounds(950, 390, 203, 30);

        txtcore.setPreferredSize(new java.awt.Dimension(6, 30));
        getContentPane().add(txtcore);
        txtcore.setBounds(950, 470, 203, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/image/1080.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        crudsql crud = new crudsql();
        variables var = new variables();
        crud.mostrar(txtcnpj1.getText());
        txcnpj.setText(var.getCnpj());
        txtnome.setText(var.getNome_empresa());
        txtobjnegocio.setText(var.getObjetivo_neg());
        txtentregavelm.setText(var.getEntregavel_min());
        txtentregavelp.setText(var.getEntregaveis_possi());
        txtsolucao.setText(var.getSolucao());
        txtproduto.setText(var.getProduto());
        txtfunc.setText(var.getFuncionalidade());
        txtcore.setText(var.getCore());

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        crudsql objcrud = new crudsql();
        variables objvar = new variables();

        objvar.setCnpj(txcnpj.getText());
        objvar.setNome_empresa(txtnome.getText());
        objvar.setObjetivo_neg(txtobjnegocio.getText());
        objvar.setEntregavel_min(txtentregavelm.getText());
        objvar.setEntregaveis_possi(txtentregavelp.getText());
        objvar.setSolucao(txtsolucao.getText());
        objvar.setProduto(txtproduto.getText());
        objvar.setFuncionalidade(txtfunc.getText());
        objvar.setCore(txtcore.getText());
        objcrud.actualizar(objvar.getNome_empresa(), objvar.getObjetivo_neg(), objvar.getEntregavel_min(), objvar.getEntregaveis_possi(), objvar.getSolucao(), objvar.getProduto(), objvar.getFuncionalidade(), objvar.getCore(), objvar.getCnpj());
        txcnpj.setText("");
        txtnome.setText("");
        txtobjnegocio.setText("");
        txtentregavelm.setText("");
        txtentregavelp.setText("");
        txtsolucao.setText("");
        txtproduto.setText("");
        txtfunc.setText("");
        txtcore.setText("");

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        crudsql objcrud=new crudsql();
        variables objvar=new variables();
        
        objvar.setCnpj(txcnpj.getText());
        
        objcrud.eliminar(objvar.getCnpj());
        txcnpj.setText("");
        txtnome.setText("");
        txtobjnegocio.setText("");
        txtentregavelm.setText("");
        txtentregavelp.setText("");
        txtsolucao.setText("");
        txtproduto.setText("");
        txtfunc.setText("");
        txtcore.setText("");
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcnpjActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtentregavelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentregavelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentregavelpActionPerformed

    private void txtsolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsolucaoActionPerformed

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
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txcnpj;
    private javax.swing.JTextField txtcnpj1;
    private javax.swing.JTextField txtcore;
    private javax.swing.JTextField txtentregavelm;
    private javax.swing.JTextField txtentregavelp;
    private javax.swing.JTextField txtfunc;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtobjnegocio;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JTextField txtsolucao;
    // End of variables declaration//GEN-END:variables
}
