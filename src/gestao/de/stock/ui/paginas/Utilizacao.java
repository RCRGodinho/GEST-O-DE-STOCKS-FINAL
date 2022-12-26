/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestao.de.stock.ui.paginas;

import gestao.de.stock.ui.pop_ups.Pop_Up_Analise;
import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PAT
 */
public final class Utilizacao extends javax.swing.JInternalFrame {
//Inicializar os contrutores
    
    Conexao c;
    Utilidades u;
    Statement stm ;
        
    boolean en;
    
    public Utilizacao(Conexao c, Utilidades u) throws Exception {
        //variaveis de conexao
        this.c = c;
        this.u = u;
        stm = c.fazerConexao().createStatement();
        
        //painel fixo
        initComponents();
        setPainelFixo();
        
        //definir as comboboxes
        tabelaUtilizacao();
        u.comboOracle(u.lista("ic"),comboIc);
        u.comboOracle(u.lista("consumivel"),comboConsumivel);
        u.comboOracle(u.lista("localizacao"),comboLocalizacao);
        
        //opcional de controlo
        comboConsumivel.setEnabled(false);
        en = false;
        
    }
    //tornal painel fixo
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        PRETO = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        comboConsumivel = new javax.swing.JComboBox<>();
        datePickerData = new com.toedter.calendar.JDateChooser();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        comboLocalizacao = new javax.swing.JComboBox<>();
        spinnerQuantidade = new javax.swing.JSpinner();
        comboIc = new javax.swing.JComboBox<>();
        spinnerPreto = new javax.swing.JSpinner();
        spinnerCor = new javax.swing.JSpinner();
        butoes = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        analise = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 236, 244));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1070, 610));

        tabela.setBackground(getBackground());
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "IC", "QUANTIDADE", "DATA", "PRETO", "COR", "CONSUMIVEL", "LOCALIZACAO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
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
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaFocusLost(evt);
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(8);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel1.setLabelFor(comboIc);
        jLabel1.setText("IC");

        jLabel2.setText("QUANTIDADE");

        jLabel3.setText("DATA");

        PRETO.setText("PRETO");

        jLabel5.setText("COR");

        jLabel6.setText("CONSUMIVEL");

        comboConsumivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboConsumivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboConsumivelItemStateChanged(evt);
            }
        });

        datePickerData.setMinimumSize(new java.awt.Dimension(5, 19));
        datePickerData.setOpaque(false);
        datePickerData.setPreferredSize(new java.awt.Dimension(5, 19));

        jLabel7.setText("LOCALIZAÇÃO");

        comboLocalizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        comboIc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboIc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIcActionPerformed(evt);
            }
        });

        spinnerPreto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboIc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerQuantidade))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(PRETO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerPreto))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerCor))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboConsumivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboLocalizacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(datePickerData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRETO)
                    .addComponent(spinnerPreto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(comboConsumivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(comboLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout butoesLayout = new javax.swing.GroupLayout(butoes);
        butoes.setLayout(butoesLayout);
        butoesLayout.setHorizontalGroup(
            butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(butoesLayout.createSequentialGroup()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        butoesLayout.setVerticalGroup(
            butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butoesLayout.createSequentialGroup()
                .addGroup(butoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new java.awt.BorderLayout());

        analise.setText("Análise");
        analise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analiseActionPerformed(evt);
            }
        });
        jPanel1.add(analise, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaUtilizacao() throws Exception{
        
         try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) tabela.getModel();
             table.setRowCount(0);
             
         
             //criar uma query e executar
         ResultSet rs = stm.executeQuery("SELECT DISTINCT ID_UTILIZACAO, IC , QUANTIDADE, to_char(DATA_Util,'DD/MM/YYYY') DATA_Util, PRETO, COR, (MARCA || '_' || MODELO || '_'|| NOME) AS CONSUMIVEL, LOCALIZACAO  FROM Utilizacao a, Consumivel b, centro_custo c, IC d, Impressora e WHERE a.ID_CONSUMIVEL = b.ID_CONSUMIVEL AND a.ID_CENTRO_CUSTO = c.ID_CENTRO_CUSTO AND b.ID_IMPRESSORA = e.ID_IMPRESSORA AND a.ID_IC = d.ID_IC");
             
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getInt("ID_UTILIZACAO"),rs.getString("IC"), rs.getInt("QUANTIDADE"),
               rs.getString("DATA_Util"), rs.getInt("PRETO"), rs.getString("COR"), rs.getString("CONSUMIVEL"), rs.getString("LOCALIZACAO")};
               
               //Adicionar os dados à tabela
               table.addRow(o);
               
       }
         }
       catch(SQLException exp)
       {
           throw new Exception (exp.getMessage());
       }

     }
    
    
    public void limparCampos(){
        //tornar todos os campos indefinidos
        
        comboConsumivel.setSelectedIndex(0);
        comboIc.setSelectedIndex(0);
        
        comboLocalizacao.setSelectedIndex(0);
        spinnerQuantidade.setValue(0);
        datePickerData.setDate(null);
        
        spinnerPreto.setValue(0);
        spinnerCor.setValue(0);
    }
    
    void buscarDados() throws ParseException, SQLException{
        
        if(tabela.getSelectedRow() == -1)
         {
           JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!");
         }else{
            int row = tabela.getSelectedRow();
            
            ////////////////////////////////DADOS NORMAIS///////////////////////
            comboIc.setSelectedItem(tabela.getModel().getValueAt(row, 1).toString());
                spinnerQuantidade.setValue(Integer.parseInt(tabela.getModel().getValueAt(row, 2).toString()));
            
            ///////////////////////////////////FIM//////////////////////////////
            /////////////////////////// Buscar Data/////////////////////////////
            
            String databela = tabela.getModel().getValueAt(row, 3).toString();
                java.util.Date date2 = new SimpleDateFormat("dd/MM/yy").parse(databela);
                    datePickerData.setDate(date2);
           //////////////////////////////FIM/////////////////////////////////////
           /////////////////////////////INTS////////////////////////////////////
           
            spinnerPreto.setValue(Integer.parseInt(tabela.getModel().getValueAt(row, 4).toString()));
                spinnerCor.setValue(Integer.parseInt(tabela.getModel().getValueAt(row, 5).toString()));
            
            ////////////////////////////FIM/////////////////////////////////////    
            ///////////////////////BUSCAR COMBOS À TABELA///////////////////////
            
                comboConsumivel.setSelectedItem(tabela.getValueAt(row, 6).toString());
                System.out.println(tabela.getValueAt(row, 1).toString());
                comboLocalizacao.setSelectedItem(tabela.getValueAt(row, 7).toString());
            ///////////////////////////////////FIM////////////////////////////////////////    
            
        }
    }

    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        
        
       
            //Verificar se todos têm o mesmo tamanho.
            if(datePickerData.getDate().toString().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            }
            else{
        
        int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
               
        try{
            Object quantidade = spinnerQuantidade.getValue(); 
            Object data = DateFormat.getDateInstance().format(datePickerData.getDate());
            Object preto = spinnerPreto.getValue();
            Object cor = spinnerCor.getValue();
            
            Object idConsumivel = u.comboId("consumivel", comboConsumivel);
            Object idCentroCusto = u.comboId("localizacao", comboLocalizacao);
            Object idIc = u.comboId("ic", comboIc);
            Object idUtilizacao = Integer.parseInt(value);
             
             stm.executeUpdate("UPDATE Utilizacao SET QUANTIDADE = "+quantidade+" , "
                             + "DATA_UTIL = TO_DATE('"+data+"', 'DD/MM/YYYY') , PRETO = "+preto+" , COR = "+cor+" , "
                             + "ID_CONSUMIVEL ="+idConsumivel+", ID_CENTRO_CUSTO = "+idCentroCusto+", "
                             + "ID_IC = "+idIc+" "
                             + "WHERE ID_UTILIZACAO = "+idUtilizacao+"");
             
             JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!");
                
             tabela.clearSelection();
                limparCampos();
                    tabelaUtilizacao();
                    
        } catch (ClassNotFoundException| SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
            
        } catch (Exception ex) {
            Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        // TODO add your handling code here:
        
        //verificar se o user selecionou algum dado
        if(tabela.getSelectedRow() == -1)
         {
           //   JOptionPane.showMessageDialog(rootPane, "Selecione um dado para apagar!");
         }else{
            //buscar o valor do ID no dado selecionado 
            
            int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
                
             
             try {
                int op = JOptionPane.showConfirmDialog(rootPane, "Tem a certeza?");
                 if(op == 0)
                 {
                     ResultSet rs = stm.executeQuery("DELETE FROM Utilizacao WHERE ID_UTILIZACAO = "+Integer.parseInt(value));
                     JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");
                        tabelaUtilizacao();
                            tabela.clearSelection();
                                limparCampos();
                 }
                 
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!");
             } catch (Exception ex) {
                Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         }

    }//GEN-LAST:event_btnApagarMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        try {
            // TODO add your handling code here:
            buscarDados();
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaMouseClicked
  
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        
        //Verificar se os campos estão vazios.
        if( spinnerQuantidade.getValue().equals(0) || datePickerData.getDate() == null || spinnerPreto.getValue().equals(0) || spinnerCor.getValue().equals(0))
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if(datePickerData.getDate().toString().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "A data tem que ser preenchida!");
            }
            else{
            
        
        try {
            Object quantidade = spinnerQuantidade.getValue(); 
            Object data = DateFormat.getDateInstance().format(datePickerData.getDate());
            Object preto = spinnerPreto.getValue();
            Object cor = spinnerCor.getValue();
            
            Object idConsumivel = u.comboId("consumivel", comboConsumivel);
            Object idCentroCusto = u.comboId("localizacao", comboLocalizacao);
            Object idIc = u.comboId("ic", comboIc);
            
             
             stm.executeUpdate("INSERT INTO UTILIZACAO(QUANTIDADE,DATA_UTIL,PRETO,COR,ID_CONSUMIVEL,ID_CENTRO_CUSTO, ID_IC) "
                     + "VALUES("+quantidade+" , TO_DATE('"+data+"', 'DD/MM/YYYY') , "+preto+" , "+cor+" , "+idConsumivel+" ,"
                     + ""+idCentroCusto+", "+idIc+")");
             
             
             
             JOptionPane.showMessageDialog(rootPane, "Dado inserido com sucesso!");
    
                    limparCampos();
                    tabelaUtilizacao();
             
        } catch (SQLException | ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO!");
        }
        }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tabelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusLost
        // TODO add your handling code here:
        //tabela.getSelectionModel().clearSelection();
        btnAdicionar.setEnabled(true);
    }//GEN-LAST:event_tabelaFocusLost

    private void comboConsumivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboConsumivelItemStateChanged
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_comboConsumivelItemStateChanged

    private void analiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analiseActionPerformed
        try {
            // TODO add your handling code here:
            
            Pop_Up_Analise hm = new Pop_Up_Analise(c,u);
            //Adicionar a nova página
            hm.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_analiseActionPerformed

    private void comboIcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIcActionPerformed
        // TODO add your handling code here:
        
         if(comboIc.getSelectedIndex() == -1 || comboIc.getSelectedIndex() == 0)
        {
            comboConsumivel.setSelectedIndex(0);
            comboConsumivel.setEnabled(false);
        } 
         else {
             comboConsumivel.setEnabled(true);
             
             try {
                 u.comboOracle(u.lista("consumivelDiff"),comboConsumivel);
                 
        }    catch (Exception ex) {
                 Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
             }
         } 
    }//GEN-LAST:event_comboIcActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PRETO;
    private javax.swing.JButton analise;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel butoes;
    private javax.swing.JComboBox<String> comboConsumivel;
    private javax.swing.JComboBox<String> comboIc;
    private javax.swing.JComboBox<String> comboLocalizacao;
    private javax.swing.JPanel dados;
    private com.toedter.calendar.JDateChooser datePickerData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner spinnerCor;
    private javax.swing.JSpinner spinnerPreto;
    private javax.swing.JSpinner spinnerQuantidade;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
