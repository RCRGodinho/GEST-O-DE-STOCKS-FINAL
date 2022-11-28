/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestão.de.stock.pkgfinal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PAT
 */
public final class Armazem extends javax.swing.JInternalFrame {

    //Inicializar os contrutores
    Conexao c = new Conexao();
    Statement stm = c.fazerConexao().createStatement();
    
    
    public Armazem() throws Exception {
        initComponents();
        setPainelFixo();
        tabelaArmazem();
        comboOracle();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        codFab = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        comboNome = new javax.swing.JComboBox<>();
        stock = new javax.swing.JSpinner();
        sig = new javax.swing.JSpinner();
        butoes = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 236, 244));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1070, 610));

        tabela.setBackground(getBackground());
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "STOCK", "NOME", "CODIGO FABRICANTE", "SIG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        tabela.getTableHeader().setReorderingAllowed(false);
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
            tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setLabelFor(stock);
        jLabel1.setText("STOCK");

        jLabel2.setText("NOME");

        jLabel3.setText("CODIGO FAB.");

        codFab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codFabKeyTyped(evt);
            }
        });

        jLabel4.setText("SIG");

        comboNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNome.setPreferredSize(new java.awt.Dimension(5, 19));

        stock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        stock.setMinimumSize(new java.awt.Dimension(28, 20));
        stock.setPreferredSize(new java.awt.Dimension(28, 20));

        sig.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sig.setMinimumSize(new java.awt.Dimension(28, 20));
        sig.setPreferredSize(new java.awt.Dimension(28, 20));

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codFab, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(codFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
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
                .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

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
                    .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaArmazem() throws Exception{
        
         try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) tabela.getModel();
             table.setRowCount(0);
             
         
             //criar uma query e executar
         ResultSet rs = stm.executeQuery("SELECT ID_ARMAZEM, STOCK, NOME, CODFABRICANTE, SIG FROM ARMAZEM");
             
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getInt("ID_ARMAZEM"),rs.getInt("STOCK"), rs.getString("NOME"),
               rs.getInt("CODFABRICANTE"), rs.getInt("SIG")};
               //Adicionar os dados à tabela
               table.addRow(o);
       }
         }
       catch(Exception exp)
       {
           throw new Exception (exp.getMessage());
       }

     }
    
    
    public void limparCampos(){
        
        stock.setValue(0);
        codFab.setText("");
        sig.setValue(0);
    }
    
    void buscarDados(){
        
        if(tabela.getSelectedRow() == -1)
         {
           JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!");
         }else{
            int row = tabela.getSelectedRow();
            
            stock.setValue(Integer.parseInt(tabela.getModel().getValueAt(row, 1).toString()));
            comboNome.setSelectedItem(tabela.getModel().getValueAt(row, 2).toString());
            codFab.setText(tabela.getModel().getValueAt(row, 3).toString());
            sig.setValue(Integer.parseInt(tabela.getModel().getValueAt(row, 4).toString()));
        }
    }
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        
        if( codFab.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if(codFab.getText().length()<8 ){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            }
            else{
        
        int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
        
        try{
             
             
        stm.executeUpdate("UPDATE ARMAZEM SET STOCK = "+stock.getValue()+" ,NOME = '"+comboNome.getSelectedItem().toString()+"' , CODFABRICANTE = "+Integer.parseInt(codFab.getText())+" , SIG = "+sig.getValue()+" WHERE ID_ARMAZEM = "+Integer.parseInt(value)+"");
             
             
             JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!");
                
             tabela.clearSelection();
             limparCampos();
             tabelaArmazem();
        } catch (ClassNotFoundException| SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO! \n"+ex);
            
        } catch (Exception ex) {
            Logger.getLogger(Armazem.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
                     stm.executeQuery("DELETE FROM ARMAZEM WHERE ID_ARMAZEM = "+Integer.parseInt(value));
                     JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");
                     tabelaArmazem();
                     tabela.clearSelection();
                     limparCampos();
                 }
                 
             } catch (SQLException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
             } catch (Exception ex) {
                Logger.getLogger(Armazem.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         }

    }//GEN-LAST:event_btnApagarMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        buscarDados();
    }//GEN-LAST:event_tabelaMouseClicked

     
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        
        //Verificar se os campos estão vazios.
        if( codFab.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if( codFab.getText().length()<7){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            }
            else{
            
        
        try {
             
             stm.executeUpdate("INSERT INTO ARMAZEM(STOCK,NOME,CODFABRICANTE,SIG) VALUES("+stock.getValue()+" , '"+comboNome.getSelectedItem().toString()+"' , "+Integer.parseInt(codFab.getText())+" , "+sig.getValue()+")");
             
             
             JOptionPane.showMessageDialog(rootPane, "Dado inserido com sucesso!");
    
                    limparCampos();
                    tabelaArmazem();
             
        } catch (SQLException | ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
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

    private void codFabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codFabKeyTyped
        // TODO add your handling code here:
        if(codFab.getText().length()>=8)
        {
            // umc.setText(umc.getText().substring(0, 8));
        }
    }//GEN-LAST:event_codFabKeyTyped

    public ArrayList listaNome() throws Exception{
        ArrayList list = new ArrayList<>();
        
        try{
            
            ResultSet rs = stm.executeQuery("SELECT (MARCA || '' || MODELO || '_'|| NOME) AS DESCRICAO FROM IMPRESSORA a, CONSUMIVEL b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");

            while(rs.next())
            {
                list.add(rs.getString("DESCRICAO"));
            }
            
            
        }catch(SQLException exp){
            throw new Exception (exp.getMessage());
        }
        
        return list;
    }
    
    private void comboOracle() throws SQLException, ClassNotFoundException, Exception{
        
        comboNome.removeAllItems();
        Iterable<String> lista = listaNome();
        
        for(String impressora : lista)
        {
            comboNome.addItem(impressora);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel butoes;
    private javax.swing.JTextField codFab;
    private javax.swing.JComboBox<String> comboNome;
    private javax.swing.JPanel dados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner sig;
    private javax.swing.JSpinner stock;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
