/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestao.de.stock.ui.paginas;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.TableColourCellRenderer;
import gestao.de.stock.api.Util;
import gestao.de.stock.ui.pop_ups.Pop_Up_AnaliseStock;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PAT
 */
public final class Stock extends javax.swing.JInternalFrame {

    //Inicializar os contrutores
    Conexao c;
    Util u;
    Statement stm;
    int stockAtivo;
    int sigAtivo;
    TableColourCellRenderer renderer;
    
    public Stock(Conexao c,Util u) throws Exception {
        this.c = c;
        this.u = u;
        stm = this.c.fazerConexao().createStatement();
        renderer = new TableColourCellRenderer("Stock",u);
        
        initComponents();
        setPainelFixo();
        tabelaStock();
        u.comboOracle(u.lista("ic"), comboIC);
        u.comboOracle(u.lista("localizacao"), comboCusto);
    }
    
    private void setPainelFixo(){
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();  
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        ABATER = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelAdicionar = new javax.swing.JLabel();
        spinnerStock = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnAnalise = new javax.swing.JButton();
        datePickerDataAdicao = new com.toedter.calendar.JDateChooser();
        labelAdicionarStock = new javax.swing.JLabel();
        labelDataAdicionar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelAbaterStock = new javax.swing.JLabel();
        spinnerAbaterStock = new javax.swing.JSpinner();
        btnAbaterStock = new javax.swing.JButton();
        labelIC = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        comboIC = new javax.swing.JComboBox<>();
        labelCentroCusto = new javax.swing.JLabel();
        comboCusto = new javax.swing.JComboBox<>();
        labelDataAbateStock = new javax.swing.JLabel();
        datePickerDataAbate = new com.toedter.calendar.JDateChooser();
        painelSig = new javax.swing.JPanel();
        labelSig = new javax.swing.JLabel();
        spinnerSig = new javax.swing.JSpinner();
        btnAbaterSig = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        igualar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelFiltro = new javax.swing.JLabel();
        textoFiltro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        btnRepor = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(232, 236, 244));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1070, 610));

        tabela.setBackground(getBackground());
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "STOCK", "SIG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setRowHeight(25);
        tabela.setRowMargin(5);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        labelAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdicionar.setText("ADICIONAR STOCK");
        labelAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAnalise.setText("ANÁLISE DE STOCKS ADICIONADOS");
        btnAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseActionPerformed(evt);
            }
        });

        labelAdicionarStock.setText("Adicionar:");

        labelDataAdicionar.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(btnAnalise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAdicionarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDataAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datePickerDataAdicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(spinnerStock, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAdicionarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerStock, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datePickerDataAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(labelDataAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ABATER.addTab("ADD", jPanel1);

        labelAbaterStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbaterStock.setText("ABATER STOCK");
        labelAbaterStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAbaterStock.setText("ABATER");
        btnAbaterStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaterStockActionPerformed(evt);
            }
        });

        labelIC.setText("IC:");

        labelQuantidade.setText("QUANTIDADE:");

        comboIC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboICActionPerformed(evt);
            }
        });

        labelCentroCusto.setText("Centro Custo:");

        comboCusto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelDataAbateStock.setText("Data:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbaterStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAbaterStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelDataAbateStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCentroCusto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCusto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboIC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePickerDataAbate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerAbaterStock))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAbaterStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(spinnerAbaterStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboIC, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCentroCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDataAbateStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePickerDataAbate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAbaterStock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ABATER.addTab("ABATER STOCK", jPanel2);

        labelSig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSig.setText("SIG");
        labelSig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAbaterSig.setText("ABATER");
        btnAbaterSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaterSigActionPerformed(evt);
            }
        });

        igualar.setText("IGUALAR AO STOCK");
        igualar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSigLayout = new javax.swing.GroupLayout(painelSig);
        painelSig.setLayout(painelSigLayout);
        painelSigLayout.setHorizontalGroup(
            painelSigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(igualar, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(btnAbaterSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerSig)
                    .addComponent(labelSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        painelSigLayout.setVerticalGroup(
            painelSigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSigLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelSig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerSig, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaterSig, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(igualar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ABATER.addTab("ABATER SIG", painelSig);

        labelFiltro.setText("NOME:");

        btnFiltrar.setText("FILTRAR");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnRepor.setText("REPOR");
        btnRepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoFiltro))
                    .addComponent(btnRepor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(labelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFiltrar)
                .addGap(18, 18, 18)
                .addComponent(btnRepor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ABATER)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ABATER, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaStock() throws Exception{
        
         try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) tabela.getModel();
            
             table.setRowCount(0);
             
             
             
         
             //criar uma query e executar
         ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL,( MARCA|| '' || MODELO || '_' || NOME) AS NOME, "+
                 "STOCK, SIG FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");
             
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getInt("ID_CONSUMIVEL"), rs.getString("NOME"), rs.getInt("STOCK"),
               rs.getInt("SIG")};
               //Adicionar os dados à tabela a partir do object
                table.addRow(o);
           }
           //criar objeto da class TableColourCellRenderer a fim de alterar a cor do campo sig //VER CLASSE TableColourCellRenderer
            
             tabela.setDefaultRenderer(Object.class, renderer);
           
         }
       catch(SQLException exp)
       {
           throw new Exception (exp.getMessage());
       }

    }
    
    /**
     *Limpa todos os campos em que valores podem ser inseridos.
     */
    public void limparCampos(){
        
        spinnerStock.setValue(0);
        spinnerSig.setValue(0);
        spinnerAbaterStock.setValue(0);
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
         try {
             //buscar dados de spinnerStock e sig
            buscarDados();
            int idConsumivel = getIdConsumivel();
            if(idConsumivel != 0)
            {
                if(datePickerDataAdicao.getDate()!=null)
                {
                
                 //buscasr e calcular o valor da soma do spinnerStock e sig existentes com os introduzidos
                 int somaStock = stockAtivo+Integer.parseInt(spinnerStock.getValue().toString());
                 int somaSig = sigAtivo+Integer.parseInt(spinnerStock.getValue().toString());
                 Object stock = spinnerStock.getValue();
                  Object data = DateFormat.getDateInstance().format(datePickerDataAdicao.getDate());

                 //query para adicionar
                 String q = "UPDATE CONSUMIVEL SET STOCK = "+somaStock+", SIG = "+somaSig+" "+
                            "WHERE ID_CONSUMIVEL = "+idConsumivel+"";
                 stm.executeUpdate(q);

                 stm.executeQuery("INSERT INTO REGISTO_STOCK (Quantidade, DATA, ID_CONSUMIVEL) "
                                + "VALUES("+stock+", TO_DATE('"+data+"', 'DD/MM/YYYY'), "+idConsumivel+")");

                 JOptionPane.showMessageDialog(rootPane, "Stock adicionado!");

                        limparCampos();
                        tabelaStock();
                        tabela.clearSelection();
                }else{
                     JOptionPane.showMessageDialog(rootPane, "A data tem que ser preenchidas!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Selecione um dado da tabela!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
        }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAbaterSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaterSigActionPerformed
        // TODO add your handling code here:
        
        try {
                  buscarDados();
                  
                  if(getIdConsumivel() != 0)
                  {
                      int subSig = Integer.parseInt(spinnerSig.getValue().toString());
                 
                     u.abaterSig(subSig, getIdConsumivel());
                     
                     JOptionPane.showMessageDialog(rootPane, "Consumiveis abatidos!");
                     
                     tabelaStock();
                     tabela.clearSelection();
                     limparCampos();
                  }else{
                       JOptionPane.showMessageDialog(rootPane, "Selecione um dado da tabela!", "ERRO", JOptionPane.WARNING_MESSAGE);
                  }
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
             } catch (Exception ex) {
                Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btnAbaterSigActionPerformed

    private void btnAbaterStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaterStockActionPerformed
        // TODO add your handling code here:
        
        
        try {
                  buscarDados();
                  
                  if(getIdConsumivel() != 0)
                  {
                      //query para abater spinnerStock
                      int subStock = stockAtivo - Integer.parseInt(spinnerAbaterStock.getValue().toString());
                 
                      if(spinnerAbaterStock.getValue().equals(0) || comboIC.getSelectedIndex()==0 || comboCusto.getSelectedIndex()==0 || datePickerDataAbate.getDate() == null)
                      {
                          JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!", "ERRO", JOptionPane.WARNING_MESSAGE);
                      }else{
                          stm.executeUpdate("UPDATE CONSUMIVEL SET STOCK = "+subStock+" "+
                                      "WHERE ID_CONSUMIVEL = "+getIdConsumivel());
                          
                          Object quantidade = spinnerAbaterStock.getValue();
                          Object data = DateFormat.getDateInstance().format(datePickerDataAbate.getDate());
                          Object idIc = u.comboId("ic", comboIC);
                          Object idCentroCusto = u.comboId("localizacao", comboIC);
                          Object idConsumivel = getIdConsumivel();
                          
                          //Inserir dados na tabela SIG
                          
                          String q ="INSERT INTO SIG (QUANTIDADE,DATA,ID_IC,ID_CENTRO_CUSTO, ID_CONSUMIVEL) "
                                  + "VALUES("+quantidade+", TO_DATE('"+data+"', 'DD/MM/YYYY'), "
                                          + ""+idIc+", "+idCentroCusto+", "+idConsumivel+")";
                          
                          //Verificar se os dados são iguais entre a tebela temporaria e a de todos
                          
                          PreparedStatement ps = c.fazerConexao().prepareStatement(q,
                                                new String[] { "ID_SIG" });

                        // variavel para guardar o valor
                        Long idSIG = null;

                        // executa a query e se for realizada com exito, guardar o id
                        if (ps.executeUpdate() > 0) {

                            ResultSet rs = ps.getGeneratedKeys();

                            //se rs tem dados, guardar chave primária do ultima dado inserido
                            if (null != rs && rs.next()) {

                                //id gerado pela sequencia
                                idSIG = rs.getLong(1);
                            }
                        }
                          
                        stm.executeQuery("INSERT INTO SIG_TEMP (QUANTIDADE,ID_SIG) "
                                  + "VALUES("+quantidade+", "+idSIG+")");
                        
                     JOptionPane.showMessageDialog(rootPane, "Stock abatido!\nPOR ABATER EM SIG!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                     
                     tabelaStock();
                     tabela.clearSelection();
                     limparCampos();
                      }
                     
                  }else{
                      JOptionPane.showMessageDialog(rootPane, "Selecione um dado da tabela!", "ERRO", JOptionPane.WARNING_MESSAGE);
                  }
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
             } catch (Exception ex) {
                Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnAbaterStockActionPerformed

    private void igualarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualarActionPerformed
        // TODO add your handling code here:
         try {
                  buscarDados();
                 
                  if(getIdConsumivel() != 0)
                  {
                      stm.executeUpdate("UPDATE CONSUMIVEL SET SIG = "+stockAtivo+" "+
                                      "WHERE ID_CONSUMIVEL = "+getIdConsumivel());
                    
                     JOptionPane.showMessageDialog(rootPane, "SIG igualado!");
                     
                     tabelaStock();
                     tabela.clearSelection();
                     limparCampos();
                  }
                 
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
             } catch (Exception ex) {
                Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_igualarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        try {
            //definir a tabela
            DefaultTableModel table = (DefaultTableModel) tabela.getModel();
            
            table.setRowCount(0);
            
            Object filtro = textoFiltro.getText().toUpperCase();
            
            //criar uma query e executar
            ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL,( MARCA|| '' || MODELO || '_' || NOME) AS NOME, "+
                 "STOCK, SIG FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND NOME LIKE '%"+filtro+"%'");
            
            while(rs.next())
            {
                //passar os dados da BD para um object
                Object o[] = {rs.getInt("ID_CONSUMIVEL"), rs.getString("NOME"), rs.getInt("STOCK"),
                    rs.getInt("SIG")};
                //Adicionar os dados à tabela
                table.addRow(o);
            }
            tabela.setDefaultRenderer(Object.class, renderer);
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
           
         
        
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporActionPerformed
        try {
            // TODO add your handling code here:
            tabelaStock();
            textoFiltro.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporActionPerformed

    private void comboICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboICActionPerformed

    private void btnAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseActionPerformed
        try {
            // TODO add your handling code here:

            Pop_Up_AnaliseStock hm = new Pop_Up_AnaliseStock(c, u);
            
            hm.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAnaliseActionPerformed

    public int getIdConsumivel(){
        //buscar o ID de modo a fazer query na bd
        if(tabela.getSelectedRow()!= -1)
         {
            int row = tabela.getSelectedRow();
               int value = Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());
        return value;
         }else
    return 0;
}
    
    public void buscarDados() throws SQLException
    {
        //buscar dados já existentes e inserir-los nas respetivas vaariaveis
        ResultSet rs = stm.executeQuery("SELECT STOCK, SIG FROM CONSUMIVEL WHERE ID_CONSUMIVEL = "+getIdConsumivel()+"");
            
            while(rs.next())
            {
                stockAtivo = rs.getInt("STOCK");
                sigAtivo = rs.getInt("SIG");
            }
    }
    
    public void retirarStockSig()
    {
        
    }   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ABATER;
    private javax.swing.JButton btnAbaterSig;
    private javax.swing.JButton btnAbaterStock;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnalise;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnRepor;
    private javax.swing.JComboBox<String> comboCusto;
    private javax.swing.JComboBox<String> comboIC;
    private com.toedter.calendar.JDateChooser datePickerDataAbate;
    private com.toedter.calendar.JDateChooser datePickerDataAdicao;
    private javax.swing.JButton igualar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAbaterStock;
    private javax.swing.JLabel labelAdicionar;
    private javax.swing.JLabel labelAdicionarStock;
    private javax.swing.JLabel labelCentroCusto;
    private javax.swing.JLabel labelDataAbateStock;
    private javax.swing.JLabel labelDataAdicionar;
    private javax.swing.JLabel labelFiltro;
    private javax.swing.JLabel labelIC;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelSig;
    private javax.swing.JPanel painelSig;
    private javax.swing.JSpinner spinnerAbaterStock;
    private javax.swing.JSpinner spinnerSig;
    private javax.swing.JSpinner spinnerStock;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textoFiltro;
    // End of variables declaration//GEN-END:variables
}
