/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui.pop_ups;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Util;
import gestao.de.stock.ui.paginas.Utilizacao;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PAT
 */
public class Pop_Up_Ic extends javax.swing.JFrame {
    
    //Variaveis
    
    Conexao c;
    Util u;
    Statement stm ;

    /**
     * Creates new form Pop_Up_Analise
     * @param c
     * @throws java.lang.Exception
     */
    public Pop_Up_Ic(Conexao c) throws Exception{
        this.c = c;
        u = new Util(c);
        stm = this.c.fazerConexao().createStatement();
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        tabelaIc();
        u.comboOracle(u.lista("impressora"), comboImpressora);
        
        setTitle("Manipulação de Ics");
    }
    
    public void tabelaIc() throws Exception
    {
         try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) tabela.getModel();
             table.setRowCount(0);
             
         
             //criar uma query e executar
         ResultSet rs = stm.executeQuery("SELECT ID_IC, IC, (MARCA || '_' || MODELO) AS IMPRESSORA "
                                       + "FROM IC a, Impressora b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");
             
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getInt("ID_IC"),rs.getString("IC"), rs.getString("IMPRESSORA")};
               //Adicionar os dados à tabela
               table.addRow(o);
       }
         }
       catch(SQLException exp)
       {
           throw new Exception (exp.getMessage());
       }
    }
    
     void buscarDados(){
            int row = tabela.getSelectedRow();
          
            comboImpressora.setSelectedItem(tabela.getModel().getValueAt(row, 1).toString());
            textIC.setText(tabela.getModel().getValueAt(row, 2).toString());
    }
     
      public void limparCampos(){
        //tornar todos os campos indefinidos
        comboImpressora.setSelectedIndex(0);
        textIC.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelImpressora = new javax.swing.JLabel();
        comboImpressora = new javax.swing.JComboBox<>();
        labelIC = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        textIC = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelImpressora.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelImpressora.setText("IMPRESSORA:");

        comboImpressora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelIC.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIC.setText("IC:");

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnApagar.setText("APAGAR");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelIC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textIC, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnApagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "IC", "IMPRESSORA"
            }
        ));
        tabela.setRowHeight(25);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            Object ic = textIC.getText();
            Object idImpressora = u.comboId("impressora", comboImpressora);
            
            stm.executeQuery("INSERT (IC, ID_IMPRESSORA) INTO IC "
                           + "VALUES('"+ic+"', "+idImpressora+")");
            
            JOptionPane.showMessageDialog(rootPane, "IC adicionado com sucesso", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Pop_Up_Ic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        if(tabela.getSelectedRow() == -1)
        {
             JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }else{
            //Verificar se todos têm o mesmo tamanho.
            if(comboImpressora.getSelectedIndex() == 0 || textIC.getText().equals("")){
             JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
            else{
        
        int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
               
        try{
            Object ic = textIC.getText();
            Object idImpressora = u.comboId("impressora", comboImpressora);
            Object idIc = Integer.parseInt(value);
             
             stm.executeUpdate("UPDATE IC SET IC = '"+ic+"' , ID_IMPRESSORA = "+idImpressora+" WHERE ID_IC = "+idIc+"");
             
             JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
                
             tabela.clearSelection();
                limparCampos();
                    tabelaIc();
                    
        } catch (ClassNotFoundException| SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
            
        } catch (Exception ex) {
            Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        buscarDados();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        
            //Verificar se todos têm o mesmo tamanho.
            if(tabela.getSelectedRow() == -1){
             JOptionPane.showMessageDialog(rootPane, "Selecione um dado para apagar!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
            else{
        
        int row = tabela.getSelectedRow();
               String value = tabela.getModel().getValueAt(row, 0).toString();
               
        try{
             int idIc = Integer.parseInt(value);
             
             u.apagar("ic", idIc);
             
             JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
                
             tabela.clearSelection();
                limparCampos();
                    tabelaIc();
                    
        } catch (ClassNotFoundException| SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "ERRO!\n"+ex);
            
        } catch (Exception ex) {
            Logger.getLogger(Utilizacao.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }   
    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> comboImpressora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIC;
    private javax.swing.JLabel labelImpressora;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textIC;
    // End of variables declaration//GEN-END:variables


    
}
