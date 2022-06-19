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

public class Mostrar extends javax.swing.JFrame {

    public Mostrar() {
        initComponents();
        txcnpj.setEditable(false);
        txtcnpj2.setDocument(new LimitaCaracteres(18, LimitaCaracteres.TipoEntrada.CNPJ));
        jGold.removeAll();
        jGold.addTab("Cadastros", jCadastros);
        
        //Visibilidade gold ancoras
        jSilverGold.setVisible(false);
        jNomeGold.setVisible(false);
        //Visibilidade gold edit
        jRadioMatching.setVisible(false);
        jRadioJoin.setVisible(false);
        jRadioAgregacao.setVisible(false);
        jRadioSerieTemporal.setVisible(false);
        jLabelChoice.setVisible(false);
        btnactualizar3.setVisible(false);
        
        jTextField3Origem.setEditable(false);
        jTextField4Formato.setEditable(false);
        jTextField5Volume.setEditable(false);
        jTextField7frequencia.setEditable(false);
        jTextField6Sistemas.setEditable(false);
        
        jBoxOrigem.setVisible(false);
        jBoxFormato.setVisible(false);
        jSpinnerVol.setVisible(false);
        jSpinnerFreq.setVisible(false);
        jComboBox5.setVisible(false);
        jBoxSistema.setVisible(false);
        jTextField2.setVisible(false);
        jLabel26.setVisible(false);
        btnactualizar2.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jGold = new javax.swing.JTabbedPane();
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
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btneliminar1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jEscopo = new javax.swing.JPanel();
        txcnpj = new javax.swing.JTextField();
        txtentregavelm = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtobjnegocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        txtentregavelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtproduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfunc = new javax.swing.JTextField();
        txtcore = new javax.swing.JTextField();
        jLabelEstruturaDados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txVolume = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBronze = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnactualizar2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jBoxSistema = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jTextField6Sistemas = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSpinnerFreq = new javax.swing.JSpinner();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField7frequencia = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinnerVol = new javax.swing.JSpinner();
        jTextField5Volume = new javax.swing.JTextField();
        jBoxFormato = new javax.swing.JComboBox();
        jTextField4Formato = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jBoxOrigem = new javax.swing.JComboBox();
        jTextField3Origem = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jEdit2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaproduto2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jNomeGold = new javax.swing.JTextField();
        jSilverGold = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnactualizar3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaproduto1 = new javax.swing.JTable();
        jRadioMatching = new javax.swing.JRadioButton();
        jRadioJoin = new javax.swing.JRadioButton();
        jRadioAgregacao = new javax.swing.JRadioButton();
        jRadioSerieTemporal = new javax.swing.JRadioButton();
        jLabelChoice = new javax.swing.JLabel();
        jEditar3 = new javax.swing.JButton();
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

        txtproduto1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txtproduto1.setForeground(new java.awt.Color(240, 240, 240));
        txtproduto1.setText("   XXXX");
        jPanel3.add(txtproduto1);
        txtproduto1.setBounds(130, 360, 230, 28);

        txtsolucao1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txtsolucao1.setForeground(new java.awt.Color(240, 240, 240));
        txtsolucao1.setText("   XXXX");
        jPanel3.add(txtsolucao1);
        txtsolucao1.setBounds(140, 310, 210, 28);

        txtobjnegocio1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txtobjnegocio1.setForeground(new java.awt.Color(240, 240, 240));
        txtobjnegocio1.setText("   XXXX");
        jPanel3.add(txtobjnegocio1);
        txtobjnegocio1.setBounds(600, 360, 200, 28);

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("CNPJ Cliente:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(32, 120, 180, 28);

        txtnome1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txtnome1.setForeground(new java.awt.Color(240, 240, 240));
        txtnome1.setText("   XXXX");
        jPanel3.add(txtnome1);
        txtnome1.setBounds(600, 310, 200, 28);

        txcnpj1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txcnpj1.setForeground(new java.awt.Color(240, 240, 240));
        txcnpj1.setText("XX.XXX.XXX/0001-XX");
        jPanel3.add(txcnpj1);
        txcnpj1.setBounds(120, 260, 250, 29);

        txtcnpj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcnpj2.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel3.add(txtcnpj2);
        txtcnpj2.setBounds(220, 120, 190, 30);

        btnbuscar1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnbuscar1.setText("Buscar");
        btnbuscar1.setPreferredSize(new java.awt.Dimension(65, 30));
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscar1);
        btnbuscar1.setBounds(420, 120, 90, 30);

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("CNPJ:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 260, 70, 28);

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Nome da Empresa:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(380, 310, 210, 28);

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Solução: ");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 310, 100, 29);

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Produto:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 360, 100, 28);

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(20, 20, 110, 30);

        jButton2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton2.setText("VER MAIS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(350, 460, 110, 30);

        btneliminar1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btneliminar1.setText("Deletar");
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btneliminar1);
        btneliminar1.setBounds(660, 120, 91, 30);

        jLabel25.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Objetivo do Negócio:");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(370, 350, 240, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-446, 0, 1280, 720);

        jLabel16.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Objetivo do Negócio:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(370, 360, 223, 28);

        jCadastros.add(jPanel3);
        jPanel3.setBounds(450, 0, 830, 670);

        jGold.addTab("Cadastros", jCadastros);

        jEscopo.setLayout(null);

        txcnpj.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txcnpj.setPreferredSize(new java.awt.Dimension(10, 30));
        txcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcnpjActionPerformed(evt);
            }
        });
        jEscopo.add(txcnpj);
        txcnpj.setBounds(240, 90, 310, 30);

        txtentregavelm.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtentregavelm.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtentregavelm);
        txtentregavelm.setBounds(240, 380, 310, 30);

        txtnome.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtnome.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtnome);
        txtnome.setBounds(740, 90, 310, 30);

        txtobjnegocio.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtobjnegocio.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtobjnegocio);
        txtobjnegocio.setBounds(240, 250, 310, 70);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNPJ");
        jEscopo.add(jLabel2);
        jLabel2.setBounds(240, 60, 70, 28);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome da Empresa");
        jEscopo.add(jLabel3);
        jLabel3.setBounds(740, 60, 200, 28);
        jEscopo.add(jTextField3);
        jTextField3.setBounds(740, 180, 310, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Objetivo do Negócio");
        jEscopo.add(jLabel4);
        jLabel4.setBounds(240, 220, 215, 28);

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entregável Mínimo");
        jEscopo.add(jLabel5);
        jLabel5.setBounds(240, 350, 205, 28);

        btnactualizar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnactualizar.setText("Atualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jEscopo.add(btnactualizar);
        btnactualizar.setBounds(740, 550, 130, 30);

        txtentregavelp.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtentregavelp.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtentregavelp);
        txtentregavelp.setBounds(240, 470, 310, 30);

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Entregáveis Possíveis");
        jEscopo.add(jLabel6);
        jLabel6.setBounds(240, 440, 227, 28);

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produto");
        jEscopo.add(jLabel8);
        jLabel8.setBounds(240, 140, 100, 28);

        txtproduto.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtproduto.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtproduto);
        txtproduto.setBounds(240, 170, 310, 30);

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Funcionalidades");
        jEscopo.add(jLabel11);
        jLabel11.setBounds(740, 350, 175, 28);

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Core");
        jEscopo.add(jLabel12);
        jLabel12.setBounds(740, 440, 50, 28);

        txtfunc.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtfunc.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtfunc);
        txtfunc.setBounds(740, 380, 310, 30);

        txtcore.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtcore.setPreferredSize(new java.awt.Dimension(6, 30));
        jEscopo.add(txtcore);
        txtcore.setBounds(740, 470, 310, 30);

        jLabelEstruturaDados.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabelEstruturaDados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstruturaDados.setText("Estrutura de Dados Mínimos");
        jEscopo.add(jLabelEstruturaDados);
        jLabelEstruturaDados.setBounds(740, 140, 310, 30);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volume");
        jEscopo.add(jLabel1);
        jLabel1.setBounds(740, 240, 90, 28);

        txVolume.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jEscopo.add(txVolume);
        txVolume.setBounds(740, 280, 160, 30);

        jButton3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton3.setText("Ver mais");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jEscopo.add(jButton3);
        jButton3.setBounds(930, 550, 130, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1280, 720));
        background.setMinimumSize(new java.awt.Dimension(1280, 720));
        background.setPreferredSize(new java.awt.Dimension(1280, 720));
        jEscopo.add(background);
        background.setBounds(0, 0, 1270, 720);

        jTextField1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jEscopo.add(jTextField1);
        jTextField1.setBounds(740, 170, 310, 30);

        jGold.addTab("Escopo", jEscopo);

        jBronze.setLayout(null);

        jLabel17.setText("jLabel17");
        jBronze.add(jLabel17);
        jLabel17.setBounds(3613, 5, 48, 16);

        btnactualizar2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnactualizar2.setText("Salvar");
        btnactualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar2ActionPerformed(evt);
            }
        });
        jBronze.add(btnactualizar2);
        btnactualizar2.setBounds(540, 530, 97, 30);

        jButton6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton6.setText("Proximo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jBronze.add(jButton6);
        jButton6.setBounds(700, 530, 110, 30);

        jTextField2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jBronze.add(jTextField2);
        jTextField2.setBounds(670, 460, 190, 30);
        jTextField1.setVisible(false);

        jBoxSistema.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBoxSistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "ERP", "Vendas", "Outro" }));
        jBoxSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxSistemaActionPerformed(evt);
            }
        });
        jBronze.add(jBoxSistema);
        jBoxSistema.setBounds(510, 460, 150, 30);

        jLabel26.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel26.setText("Qual?");
        jBronze.add(jLabel26);
        jLabel26.setBounds(670, 440, 40, 14);
        jLabel16.setVisible(false);

        jTextField6Sistemas.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBronze.add(jTextField6Sistemas);
        jTextField6Sistemas.setBounds(510, 420, 150, 30);

        jLabel18.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Sistemas:");
        jBronze.add(jLabel18);
        jLabel18.setBounds(380, 420, 120, 28);

        jSpinnerFreq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinnerFreq.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jBronze.add(jSpinnerFreq);
        jSpinnerFreq.setBounds(510, 360, 80, 30);

        jComboBox5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Por Dia", "Por Semana", "Por Mês" }));
        jBronze.add(jComboBox5);
        jComboBox5.setBounds(600, 360, 180, 30);

        jTextField7frequencia.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBronze.add(jTextField7frequencia);
        jTextField7frequencia.setBounds(510, 320, 170, 30);

        jLabel22.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Frequência:");
        jBronze.add(jLabel22);
        jLabel22.setBounds(360, 320, 140, 28);

        jLabel21.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Volume:");
        jBronze.add(jLabel21);
        jLabel21.setBounds(400, 230, 100, 28);

        jSpinnerVol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinnerVol.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinnerVol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBronze.add(jSpinnerVol);
        jSpinnerVol.setBounds(510, 270, 90, 30);

        jTextField5Volume.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBronze.add(jTextField5Volume);
        jTextField5Volume.setBounds(510, 230, 90, 30);

        jBoxFormato.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBoxFormato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "JSON", "CSV", "Planilhas", "Tabelas", "PDF", "Áudio", "Texto" }));
        jBronze.add(jBoxFormato);
        jBoxFormato.setBounds(510, 190, 180, 30);

        jTextField4Formato.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBronze.add(jTextField4Formato);
        jTextField4Formato.setBounds(510, 150, 110, 30);

        jLabel20.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Formato:");
        jBronze.add(jLabel20);
        jLabel20.setBounds(390, 150, 110, 28);

        jBoxOrigem.setBackground(new java.awt.Color(240, 240, 240));
        jBoxOrigem.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBoxOrigem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "API", "SFTP", "Upload" }));
        jBoxOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxOrigemActionPerformed(evt);
            }
        });
        jBronze.add(jBoxOrigem);
        jBoxOrigem.setBounds(510, 100, 180, 30);

        jTextField3Origem.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jBronze.add(jTextField3Origem);
        jTextField3Origem.setBounds(510, 60, 110, 30);

        jLabel19.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Origem do dado: ");
        jBronze.add(jLabel19);
        jLabel19.setBounds(320, 60, 190, 28);

        jEdit2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jEdit2.setText("Editar");
        jEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdit2ActionPerformed(evt);
            }
        });
        jBronze.add(jEdit2);
        jEdit2.setBounds(780, 60, 90, 23);

        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jBronze.add(jButton4);
        jButton4.setBounds(250, 10, 90, 25);

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
        jScrollPane3.setBounds(0, 0, 240, 680);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jBronze.add(jLabel23);
        jLabel23.setBounds(0, 0, 1280, 680);

        jGold.addTab("Bronze", jBronze);

        jPanel1.setLayout(null);
        jPanel1.add(jNomeGold);
        jNomeGold.setBounds(640, 530, 140, 30);
        jPanel1.add(jSilverGold);
        jSilverGold.setBounds(480, 530, 140, 30);

        jButton5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(470, 20, 90, 30);

        btnactualizar3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        btnactualizar3.setText("Salvar");
        btnactualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar3);
        btnactualizar3.setBounds(780, 390, 123, 40);

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

        buttonGroup1.add(jRadioMatching);
        jRadioMatching.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jRadioMatching.setForeground(new java.awt.Color(240, 240, 240));
        jRadioMatching.setText("Matching");
        jRadioMatching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMatchingActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioMatching);
        jRadioMatching.setBounds(470, 130, 200, 60);

        buttonGroup1.add(jRadioJoin);
        jRadioJoin.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jRadioJoin.setForeground(new java.awt.Color(240, 240, 240));
        jRadioJoin.setText("Join");
        jRadioJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioJoinActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioJoin);
        jRadioJoin.setBounds(670, 130, 170, 60);

        buttonGroup1.add(jRadioAgregacao);
        jRadioAgregacao.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jRadioAgregacao.setForeground(new java.awt.Color(240, 240, 240));
        jRadioAgregacao.setText("Agregação");
        jRadioAgregacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAgregacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioAgregacao);
        jRadioAgregacao.setBounds(840, 130, 200, 60);

        buttonGroup1.add(jRadioSerieTemporal);
        jRadioSerieTemporal.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jRadioSerieTemporal.setForeground(new java.awt.Color(240, 240, 240));
        jRadioSerieTemporal.setText("Serie Temporal");
        jRadioSerieTemporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSerieTemporalActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioSerieTemporal);
        jRadioSerieTemporal.setBounds(1040, 130, 240, 60);

        jLabelChoice.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabelChoice.setForeground(new java.awt.Color(240, 240, 240));
        jLabelChoice.setText("Você escolheu a Silver - - - - - - - -  para a operação - - - - - - - - .");
        jPanel1.add(jLabelChoice);
        jLabelChoice.setBounds(490, 250, 780, 80);

        jEditar3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jEditar3.setText("Editar");
        jEditar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditar3ActionPerformed(evt);
            }
        });
        jPanel1.add(jEditar3);
        jEditar3.setBounds(1140, 20, 90, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dom-rock2.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(0, 0, 1280, 680);

        jGold.addTab("Gold", jPanel1);

        getContentPane().add(jGold);
        jGold.setBounds(0, 0, 7280, 720);

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
        InicioAdmin in = new InicioAdmin();
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

    private void tabelaprodutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaprodutoComponentShown

        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaprodutoComponentShown

    private void tabelaprodutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaprodutoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaprodutoMouseEntered

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        crudsql objcrud = new crudsql();
        variables objvar = new variables();

        objvar.setCnpj(txcnpj.getText());
        objvar.setNome_empresa(txtnome.getText());
        objvar.setObjetivo_neg(txtobjnegocio.getText());
        objvar.setEntregavel_min(txtentregavelm.getText());
        objvar.setEntregaveis_possi(txtentregavelp.getText());
        objvar.setProduto(txtproduto.getText());
        objvar.setFuncionalidade(txtfunc.getText());
        objvar.setCore(txtcore.getText());
        objvar.setEstrutura(jTextField3.getText());
        objcrud.atualizar(objvar.getNome_empresa(), objvar.getObjetivo_neg(), objvar.getEntregavel_min(), objvar.getEntregaveis_possi(), objvar.getSolucao(), objvar.getProduto(), objvar.getFuncionalidade(), objvar.getCore(), objvar.getCnpj(), objvar.getEstrutura());
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcnpjActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Mostrar et = new Mostrar();
        et.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            jTextField3.setText(var.getEstrutura());
            txVolume.setText(var.getVolume()); 
        
            jGold.removeAll();
            jGold.addTab("Escopo", jEscopo);
       
            
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            
            jGold.removeAll();
            jGold.addTab("Bronze", jBronze);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnactualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar2ActionPerformed
        // TODO add your handling code here:
        crudsql objcrud = new crudsql();
        Bronze objvar = new Bronze();

        objvar.setCnpj(txcnpj.getText());
        objvar.setOrigem((String)jBoxOrigem.getSelectedItem());
        objvar.setFormato((String)jBoxFormato.getSelectedItem());
        objvar.setVolume((String.valueOf(jSpinnerVol.getValue())));
        objvar.setFrequencia((String.valueOf(jSpinnerFreq.getValue())+"x"+(String)jComboBox5.getSelectedItem()));
        objvar.setSistema((String)jBoxSistema.getSelectedItem());
        if(jBoxSistema.getSelectedItem().equals("Outro")){
            objvar.setSistema(":"+jTextField1.getText());
        }
        objcrud.atualizarBronze(objvar.getOrigem(), objvar.getFormato(), objvar.getSistema(),objvar.getVolume(),objvar.getFrequencia(), objvar.getCnpj());
        crudsql crud = new crudsql();
        Bronze var = new Bronze();
        crud.mostrarBronze(txtcnpj2.getText());
        if (txtcnpj2.getText().length() > 0) {    
            txcnpj.setText(var.getCnpj());
            jTextField3Origem.setText(var.getOrigem());
            jTextField4Formato.setText(var.getFormato());
            jTextField5Volume.setText(var.getVolume());
            jTextField6Sistemas.setText(var.getSistema());
            jTextField7frequencia.setText(var.getFrequencia());
        }
        jBoxOrigem.setVisible(false);
        jBoxFormato.setVisible(false);
        jSpinnerVol.setVisible(false);
        jSpinnerFreq.setVisible(false);
        jComboBox5.setVisible(false);
        jBoxSistema.setVisible(false);
        jTextField2.setVisible(false);
        jLabel26.setVisible(false);
        btnactualizar2.setVisible(false);
        
        
    }//GEN-LAST:event_btnactualizar2ActionPerformed

    private void btnactualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar3ActionPerformed
        // TODO add your handling code here:
        crudsql objcrud = new crudsql();
        Gold objvar = new Gold();
                
        objvar.setCnpj(txcnpj.getText());
        objvar.setTipoSilver(jSilverGold.getText());
        objvar.setNomeGold(jNomeGold.getText());
        objcrud.atualizarGold(objvar.getCnpj(), objvar.getTipoSilver(), objvar.getNomeGold());

        
    }//GEN-LAST:event_btnactualizar3ActionPerformed

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
        
        jGold.removeAll();
         jGold.addTab("Gold", jPanel1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBoxSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxSistemaActionPerformed
        if(jBoxSistema.getSelectedItem().equals("Outro")){
            jTextField1.setVisible(true);
            jLabel16.setVisible(true);
        }
        if(jBoxSistema.getSelectedItem().equals("ERP")){
            jTextField1.setVisible(false);
            jLabel16.setVisible(false);
        }
        if(jBoxSistema.getSelectedItem().equals("Selecionar")){
            jTextField1.setVisible(false);
            jLabel16.setVisible(false);
        }
        if(jBoxSistema.getSelectedItem().equals("Vendas")){
            jTextField1.setVisible(false);
            jLabel16.setVisible(false);
        }
    }//GEN-LAST:event_jBoxSistemaActionPerformed

    private void jBoxOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxOrigemActionPerformed

    private void tabelaproduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto1MouseClicked
        // TODO add your handling code here:
       
        crudsql crud = new crudsql();
        GoldDown var = new GoldDown();
        crud.mostrarGoldTable(txtcnpj2.getText());
        if (txtcnpj2.getText().length() > 0) { 
            txcnpj.setText(var.getCnpj());
            jSilverGold.setText(var.getTipoSilver());
            jNomeGold.setText(var.getNomeGold());
            

            String ChoiceSilver = jSilverGold.getText();
            String ChoiceGold = jNomeGold.getText();

            jLabelChoice.setText("Você escolheu a Silver "+ChoiceSilver+" para a operação "+ChoiceGold+".");
        }
        
    }//GEN-LAST:event_tabelaproduto1MouseClicked

    private void tabelaproduto1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto1MouseEntered

    private void tabelaproduto1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaproduto1ComponentShown
        // TODO add your handling code here:

        
    }//GEN-LAST:event_tabelaproduto1ComponentShown

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

    private void jRadioMatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMatchingActionPerformed
        // TODO add your handling code here:
        jNomeGold.setText("Matching");

        String ChoiceSilver = jSilverGold.getText();
        String ChoiceGold = jNomeGold.getText();

        jLabelChoice.setText("Você escolheu a Silver "+ChoiceSilver+" para a operação "+ChoiceGold+".");
    }//GEN-LAST:event_jRadioMatchingActionPerformed

    private void jRadioJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioJoinActionPerformed
        // TODO add your handling code here:
        jNomeGold.setText("Join");

        String ChoiceSilver = jSilverGold.getText();
        String ChoiceGold = jNomeGold.getText();

        jLabelChoice.setText("Você escolheu a Silver "+ChoiceSilver+" para a operação "+ChoiceGold+".");
    }//GEN-LAST:event_jRadioJoinActionPerformed

    private void jRadioAgregacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAgregacaoActionPerformed
        // TODO add your handling code here:
        jNomeGold.setText("Agregação");

        String ChoiceSilver = jSilverGold.getText();
        String ChoiceGold = jNomeGold.getText();

        jLabelChoice.setText("Você escolheu a Silver "+ChoiceSilver+" para a operação "+ChoiceGold+".");
    }//GEN-LAST:event_jRadioAgregacaoActionPerformed

    private void jRadioSerieTemporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSerieTemporalActionPerformed
        // TODO add your handling code here:
        jNomeGold.setText("Serie Temporal");

        String ChoiceSilver = jSilverGold.getText();
        String ChoiceGold = jNomeGold.getText();

        jLabelChoice.setText("Você escolheu a Silver "+ChoiceSilver+" para a operação "+ChoiceGold+".");
    }//GEN-LAST:event_jRadioSerieTemporalActionPerformed

    private void jEditar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditar3ActionPerformed
        // TODO add your handling code here:
        jRadioMatching.setVisible(true);
        jRadioJoin.setVisible(true);
        jRadioAgregacao.setVisible(true);
        jRadioSerieTemporal.setVisible(true);
        jLabelChoice.setVisible(true);
        btnactualizar3.setVisible(true);
    }//GEN-LAST:event_jEditar3ActionPerformed

    private void jEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdit2ActionPerformed
        // TODO add your handling code here:
        jBoxOrigem.setVisible(true);
        jBoxFormato.setVisible(true);
        jSpinnerVol.setVisible(true);
        jSpinnerFreq.setVisible(true);
        jComboBox5.setVisible(true);
        jBoxSistema.setVisible(true);
        btnactualizar2.setVisible(true);
    }//GEN-LAST:event_jEdit2ActionPerformed

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar1ActionPerformed
        // TODO add your handling code here:
        crudsql objcrud=new crudsql();
        variables objvar=new variables();

        objvar.setCnpj(txtcnpj2.getText());

        objcrud.eliminar(objvar.getCnpj());
        txcnpj1.setText("");
        txtnome1.setText("");
        txtobjnegocio1.setText("");
        txtproduto1.setText("");
        txtsolucao1.setText("");
    }//GEN-LAST:event_btneliminar1ActionPerformed

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

    private void tabelaproduto2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaproduto2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto2MouseEntered

    private void tabelaproduto2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelaproduto2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaproduto2ComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        crudsql crud = new crudsql();
        crud.mostrarBronzeTable(txtcnpj2.getText());
        
        List<BronzeDown> empresas = crud.getBdown();
        DefaultTableModel tabelaProduto2 =
                (DefaultTableModel)tabelaproduto2.getModel();
        
        tabelaProduto2.setRowCount(0);
        
        
        
        for(int i=0; i<empresas.size(); i++ ) {  
            tabelaProduto2.insertRow(i, empresas.get(i).getNovoProduto());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnactualizar2;
    private javax.swing.JButton btnactualizar3;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btneliminar1;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox jBoxFormato;
    public javax.swing.JComboBox jBoxOrigem;
    private javax.swing.JComboBox jBoxSistema;
    private javax.swing.JPanel jBronze;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jCadastros;
    public javax.swing.JComboBox jComboBox5;
    private javax.swing.JButton jEdit2;
    private javax.swing.JButton jEditar3;
    private javax.swing.JPanel jEscopo;
    private javax.swing.JTabbedPane jGold;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelChoice;
    private javax.swing.JLabel jLabelEstruturaDados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jNomeGold;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioAgregacao;
    private javax.swing.JRadioButton jRadioJoin;
    private javax.swing.JRadioButton jRadioMatching;
    private javax.swing.JRadioButton jRadioSerieTemporal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jSilverGold;
    public javax.swing.JSpinner jSpinnerFreq;
    public javax.swing.JSpinner jSpinnerVol;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
