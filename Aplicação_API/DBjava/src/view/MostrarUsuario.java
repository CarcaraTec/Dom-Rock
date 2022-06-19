package view;

import getset.variables;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bronze;
import model.BronzeDown;
import model.Gold;
import model.GoldDown;
import rule.LimitaCaracteres;
import sql.crudsql;

public class MostrarUsuario extends javax.swing.JFrame {

    public MostrarUsuario() {
        initComponents();
        txcnpj.setEditable(false);
        txtcnpj2.setDocument(new LimitaCaracteres(18, LimitaCaracteres.TipoEntrada.CNPJ));
        jTabMenu.removeAll();
        jTabMenu.addTab("Cadastros", jCadastros);
        
        jTextField5Volume.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabMenu = new javax.swing.JTabbedPane();
        jCadastros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaproduto = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtproduto1 = new javax.swing.JLabel();
        txtsolucao1 = new javax.swing.JLabel();
        txtobjnegocio1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnome1 = new javax.swing.JLabel();
        txcnpj1 = new javax.swing.JLabel();
        txtcnpj2 = new javax.swing.JTextField();
        btnbuscar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jEscopo = new javax.swing.JPanel();
        txcnpj = new javax.swing.JTextField();
        txtentregavelm = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtobjnegocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtentregavelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtproduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfunc = new javax.swing.JTextField();
        txtcore = new javax.swing.JTextField();
        jLabelEstruturaDados = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txVolume = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jBronze = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField3Origem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4Formato = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField5Volume = new javax.swing.JTextField();
        jTextField6Sistemas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField7frequencia = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaproduto2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaproduto1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
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

        jCadastros.setLayout(null);

        tabelaproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNPJ", "Nome da Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaprodutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaprodutoMouseEntered(evt);
            }
        });
        tabelaproduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabelaprodutoComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaproduto);
        crudsql crud = new crudsql();
        crud.mostrar(txtcnpj2.getText());

        List<variables> empresas = crud.getVar();
        DefaultTableModel tabelaProduto =
        (DefaultTableModel)tabelaproduto.getModel();

        tabelaProduto.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto.insertRow(i, empresas.get(i).getNovoProduto());
        }

        jCadastros.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 450, 680);

        jPanel3.setLayout(null);

        txtproduto1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtproduto1.setForeground(java.awt.Color.white);
        txtproduto1.setText("   XXXX");
        jPanel3.add(txtproduto1);
        txtproduto1.setBounds(170, 300, 210, 29);

        txtsolucao1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtsolucao1.setForeground(java.awt.Color.white);
        txtsolucao1.setText("   XXXX");
        jPanel3.add(txtsolucao1);
        txtsolucao1.setBounds(170, 250, 210, 29);

        txtobjnegocio1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtobjnegocio1.setForeground(java.awt.Color.white);
        txtobjnegocio1.setText("   XXXX");
        jPanel3.add(txtobjnegocio1);
        txtobjnegocio1.setBounds(600, 250, 210, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("CNPJ Cliente:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 50, 162, 29);

        txtnome1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnome1.setForeground(java.awt.Color.white);
        txtnome1.setText("   XXXX");
        jPanel3.add(txtnome1);
        txtnome1.setBounds(600, 200, 210, 29);

        txcnpj1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txcnpj1.setForeground(java.awt.Color.white);
        txcnpj1.setText("XX.XXX.XXX/0001-XX");
        jPanel3.add(txcnpj1);
        txcnpj1.setBounds(120, 200, 250, 29);

        txtcnpj2.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel3.add(txtcnpj2);
        txtcnpj2.setBounds(190, 50, 190, 30);

        btnbuscar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnbuscar1.setText("buscar");
        btnbuscar1.setPreferredSize(new java.awt.Dimension(65, 30));
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscar1);
        btnbuscar1.setBounds(390, 50, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("CNPJ:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 200, 70, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Nome da Empresa:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(390, 200, 210, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Solução: ");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(50, 250, 100, 29);

        jLabel25.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Objetivo do Negócio:");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(380, 240, 240, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Produto");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(50, 300, 82, 29);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(0, 0, 100, 25);

        jButton2.setText("VER MAIS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(510, 320, 110, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-446, 0, 1280, 720);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Objetivo do Negocio:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(370, 250, 222, 29);

        jCadastros.add(jPanel3);
        jPanel3.setBounds(450, 0, 830, 670);

        jTabMenu.addTab("Cadastros", jCadastros);

        jEscopo.setLayout(null);

        txcnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txcnpj.setPreferredSize(new java.awt.Dimension(10, 30));
        txcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcnpjActionPerformed(evt);
            }
        });
        jEscopo.add(txcnpj);
        txcnpj.setBounds(130, 80, 203, 30);

        txtentregavelm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtentregavelm.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtentregavelm);
        txtentregavelm.setBounds(130, 380, 203, 30);

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnome.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtnome);
        txtnome.setBounds(470, 80, 203, 30);

        txtobjnegocio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtobjnegocio.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtobjnegocio);
        txtobjnegocio.setBounds(130, 240, 210, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNPJ");
        jEscopo.add(jLabel2);
        jLabel2.setBounds(210, 40, 53, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome da Empresa");
        jEscopo.add(jLabel3);
        jLabel3.setBounds(480, 40, 200, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Objetivo do Negocio ");
        jEscopo.add(jLabel4);
        jLabel4.setBounds(120, 200, 222, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entregavel Minimo");
        jEscopo.add(jLabel5);
        jLabel5.setBounds(130, 350, 195, 29);

        txtentregavelp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtentregavelp.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtentregavelp);
        txtentregavelp.setBounds(130, 470, 203, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Entregaveis Possiveis");
        jEscopo.add(jLabel6);
        jLabel6.setBounds(130, 440, 225, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produto");
        jEscopo.add(jLabel8);
        jLabel8.setBounds(180, 120, 82, 29);

        txtproduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtproduto.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtproduto);
        txtproduto.setBounds(130, 160, 203, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Funcionalidades");
        jEscopo.add(jLabel11);
        jLabel11.setBounds(500, 280, 167, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Core");
        jEscopo.add(jLabel12);
        jLabel12.setBounds(550, 360, 49, 29);

        txtfunc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfunc.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtfunc);
        txtfunc.setBounds(470, 310, 210, 30);

        txtcore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcore.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtcore);
        txtcore.setBounds(470, 390, 203, 30);

        jLabelEstruturaDados.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabelEstruturaDados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstruturaDados.setText("Estrutura de Dados Minimos");
        jEscopo.add(jLabelEstruturaDados);
        jLabelEstruturaDados.setBounds(400, 117, 310, 20);
        jEscopo.add(jTextField1);
        jTextField1.setBounds(470, 150, 210, 30);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volume");
        jEscopo.add(jLabel1);
        jLabel1.setBounds(530, 200, 90, 28);
        jEscopo.add(txVolume);
        txVolume.setBounds(470, 230, 210, 30);

        jButton3.setText("Ver mais");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jEscopo.add(jButton3);
        jButton3.setBounds(670, 500, 160, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1280, 720));
        background.setMinimumSize(new java.awt.Dimension(1280, 720));
        background.setPreferredSize(new java.awt.Dimension(1280, 720));
        jEscopo.add(background);
        background.setBounds(0, 0, 1280, 720);

        jTabMenu.addTab("Escopo", jEscopo);

        jBronze.setLayout(null);

        jLabel17.setText("jLabel17");
        jBronze.add(jLabel17);
        jLabel17.setBounds(3613, 5, 48, 16);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sistemas:");
        jBronze.add(jLabel18);
        jLabel18.setBounds(160, 410, 110, 29);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Origem do dado: ");
        jBronze.add(jLabel19);
        jLabel19.setBounds(90, 50, 187, 29);
        jBronze.add(jTextField3Origem);
        jTextField3Origem.setBounds(280, 50, 110, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Formato:");
        jBronze.add(jLabel20);
        jLabel20.setBounds(170, 140, 100, 29);
        jBronze.add(jTextField4Formato);
        jTextField4Formato.setBounds(280, 140, 110, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Volume:");
        jBronze.add(jLabel21);
        jLabel21.setBounds(180, 220, 90, 29);
        jBronze.add(jTextField5Volume);
        jTextField5Volume.setBounds(280, 220, 90, 30);
        jBronze.add(jTextField6Sistemas);
        jTextField6Sistemas.setBounds(280, 410, 150, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Frequência:");
        jBronze.add(jLabel22);
        jLabel22.setBounds(140, 310, 130, 29);
        jBronze.add(jTextField7frequencia);
        jTextField7frequencia.setBounds(280, 310, 90, 30);

        jButton6.setText("Proximo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jBronze.add(jButton6);
        jButton6.setBounds(520, 520, 110, 25);

        tabelaproduto2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bronze"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaproduto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaproduto2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaproduto2MouseEntered(evt);
            }
        });
        tabelaproduto2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabelaproduto2ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaproduto2);

        jBronze.add(jScrollPane3);
        jScrollPane3.setBounds(1040, 0, 240, 680);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jBronze.add(jLabel23);
        jLabel23.setBounds(0, 0, 1280, 680);

        jTabMenu.addTab("Bronze", jBronze);

        jPanel1.setLayout(null);

        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(460, 10, 100, 25);

        tabelaproduto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Silver Referente", "Produto Gold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaproduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaproduto1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaproduto1MouseEntered(evt);
            }
        });
        tabelaproduto1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabelaproduto1ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaproduto1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 450, 680);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(0, 0, 1280, 680);

        jTabMenu.addTab("Gold", jPanel1);

        getContentPane().add(jTabMenu);
        jTabMenu.setBounds(0, 0, 7280, 720);
        jTabMenu.remove(jEscopo);

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
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
        if(jCadastros.isShowing()){
            Inicio vi = new Inicio();
            vi.setVisible(true);
            dispose();
        }
        
        if(jEscopo.isShowing()){
            jTabMenu.removeAll();
            jTabMenu.addTab("Cadastrados", jCadastros);
            
        }
        if(jBronze.isShowing()){
            jTabMenu.removeAll();
            jTabMenu.addTab("Escopo", jEscopo);
        }
        
        if(jPanel1.isShowing()){
            jTabMenu.removeAll();
            jTabMenu.addTab("Bronze", jBronze);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_formWindowOpened

    private void tabelaproduto1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaproduto1ComponentShown
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        crud.mostrarGoldTable(txtcnpj2.getText());

        List<GoldDown> empresas = crud.getGol();
        DefaultTableModel tabelaProduto1 =
        (DefaultTableModel)tabelaproduto1.getModel();

        tabelaProduto1.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto1.insertRow(i, empresas.get(i).getNovoProduto());
        }
    }//GEN-LAST:event_tabelaproduto1ComponentShown

    private void tabelaproduto1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto1MouseEntered

    private void tabelaproduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        crudsql crud = new crudsql();
        crud.mostrarGoldTable(txtcnpj2.getText());

        List<GoldDown> empresas = crud.getGol();
        DefaultTableModel tabelaProduto1 =
        (DefaultTableModel)tabelaproduto1.getModel();

        tabelaProduto1.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto1.insertRow(i, empresas.get(i).getNovoProduto());
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelaproduto2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaproduto2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto2ComponentShown

    private void tabelaproduto2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto2MouseEntered

    private void tabelaproduto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto2MouseClicked
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        BronzeDown var = new BronzeDown();
        crud.mostrarBronzeTable(tabelaproduto2.getValueAt(tabelaproduto2.getSelectedRow(), 0).toString());
        txcnpj1.setText(var.getCnpj());
        jTextField3Origem.setText(var.getOrigem());
        jTextField4Formato.setText(var.getFormato());
        jTextField5Volume.setText(var.getVolume());
        jTextField7frequencia.setText(var.getFrequencia());
        jTextField6Sistemas.setText(var.getSistema());
    }//GEN-LAST:event_tabelaproduto2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        crud.mostrarGoldTable(txtcnpj2.getText());

        List<GoldDown> empresas = crud.getGol();
        DefaultTableModel tabelaProduto1 =
        (DefaultTableModel)tabelaproduto1.getModel();

        tabelaProduto1.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto1.insertRow(i, empresas.get(i).getNovoProduto());
        }

        jTabMenu.removeAll();
        jTabMenu.addTab("Gold", jPanel1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        crudsql crud = new crudsql();
        crud.mostrarBronzeTable(txtcnpj2.getText());

        List<BronzeDown> empresas = crud.getBdown();
        DefaultTableModel tabelaProduto2 =
        (DefaultTableModel)tabelaproduto2.getModel();

        tabelaProduto2.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto2.insertRow(i, empresas.get(i).getNovoProduto());
        }

        Bronze var = new Bronze();
        crud.mostrarBronze(txtcnpj2.getText());
        if (txtcnpj2.getText().length() > 0) {
            txcnpj.setText(var.getCnpj());
            jTextField3Origem.setText(var.getOrigem());
            jTextField4Formato.setText(var.getFormato());
            jTextField5Volume.setText(var.getVolume());
            jTextField6Sistemas.setText(var.getSistema());
            jTextField7frequencia.setText(var.getFrequencia());

            jTabMenu.removeAll();
            jTabMenu.addTab("Bronze", jBronze);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcnpjActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        crudsql crud = new crudsql();
        variables var = new variables();
        crud.mostrar2(txtcnpj2.getText());
        if (txtcnpj2.getText().length() > 0) {
            txcnpj.setText(var.getCnpj());
            txtnome.setText(var.getNome_empresa());
            txtobjnegocio.setText(var.getObjetivo_neg());
            txtentregavelm.setText(var.getEntregavel_min());
            txtentregavelp.setText(var.getEntregaveis_possi());
            txtproduto.setText(var.getProduto());
            txtfunc.setText(var.getFuncionalidade());
            txtcore.setText(var.getCore());
            jTextField1.setText(var.getEstrutura());
            txVolume.setText(var.getVolume());

            jTabMenu.removeAll();
            jTabMenu.addTab("Escopo", jEscopo);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MostrarUsuario et = new MostrarUsuario();
        et.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        variables var = new variables();
        crud.mostrar2(txtcnpj2.getText());
        txcnpj1.setText(var.getCnpj());
        txtnome1.setText(var.getNome_empresa());
        txtobjnegocio1.setText(var.getObjetivo_neg());
        txtproduto1.setText(var.getSolucao());
        txtsolucao1.setText(var.getProduto());

        List<variables> empresas = crud.getVar();
        DefaultTableModel tabelaProduto =
        (DefaultTableModel)tabelaproduto.getModel();

        tabelaProduto.setRowCount(0);

        for(int i=0; i<empresas.size(); i++ ) {
            tabelaProduto.insertRow(i, empresas.get(i).getNovoProduto());
        }
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void tabelaprodutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaprodutoComponentShown

        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaprodutoComponentShown

    private void tabelaprodutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaprodutoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaprodutoMouseEntered

    private void tabelaprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaprodutoMouseClicked
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        variables var = new variables();
        crud.mostrar2(tabelaproduto.getValueAt(tabelaproduto.getSelectedRow(), 0).toString());
        txcnpj1.setText(var.getCnpj());
        txtcnpj2.setText(var.getCnpj());
        txtproduto1.setText(var.getProduto());
        if(var.getProduto().equals("Vox")){
        txtsolucao1.setText("Nxt.Demand");
        }
        if(var.getProduto().equals("Marketing&Planning")){
        txtsolucao1.setText("Nxt.Demand");
        }
        if(var.getProduto().equals("Sales&Distribution")){
        txtsolucao1.setText("Nxt.Demand");
        }
        if(var.getProduto().equals("Pricing")){
        txtsolucao1.setText("Nxt.Demand");
        }
        if(var.getProduto().equals("Optimization")){
        txtsolucao1.setText("Nxt.Operations");
        }
        if(var.getProduto().equals("Matching&Risk")){
        txtsolucao1.setText("Nxt.Operations");
        }
        crud.mostrarCliente(txtcnpj2.getText());
        txtnome1.setText(var.getNome_empresa());
        txtobjnegocio1.setText(var.getObjetivo_neg());
    }//GEN-LAST:event_tabelaprodutoMouseClicked

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
            java.util.logging.Logger.getLogger(MostrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MostrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JPanel jBronze;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jCadastros;
    private javax.swing.JPanel jEscopo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstruturaDados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabMenu;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3Origem;
    private javax.swing.JTextField jTextField4Formato;
    private javax.swing.JTextField jTextField5Volume;
    private javax.swing.JTextField jTextField6Sistemas;
    private javax.swing.JTextField jTextField7frequencia;
    private javax.swing.JTable tabelaproduto;
    private javax.swing.JTable tabelaproduto1;
    private javax.swing.JTable tabelaproduto2;
    private javax.swing.JTextField txVolume;
    private javax.swing.JTextField txcnpj;
    private javax.swing.JLabel txcnpj1;
    private javax.swing.JTextField txtcnpj2;
    private javax.swing.JTextField txtcore;
    private javax.swing.JTextField txtentregavelm;
    private javax.swing.JTextField txtentregavelp;
    private javax.swing.JTextField txtfunc;
    private javax.swing.JTextField txtnome;
    private javax.swing.JLabel txtnome1;
    private javax.swing.JTextField txtobjnegocio;
    private javax.swing.JLabel txtobjnegocio1;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JLabel txtproduto1;
    private javax.swing.JLabel txtsolucao1;
    // End of variables declaration//GEN-END:variables
}
