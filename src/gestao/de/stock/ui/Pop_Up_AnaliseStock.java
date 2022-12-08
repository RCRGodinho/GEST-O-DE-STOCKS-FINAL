/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Util;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PAT
 */
public class Pop_Up_AnaliseStock extends javax.swing.JFrame {
    
    //Variaveis
    
    Conexao c;
    Util u;
    Statement stm ;

    /**
     * Creates new form Pop_Up_Analise
     * @param c
     * @throws java.lang.Exception
     */
    public Pop_Up_AnaliseStock(Conexao c,Util u) throws Exception{
        this.c = c;
        this.u = u;
        stm = c.fazerConexao().createStatement();
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        u.comboOracle(u.lista("tabelas"), comboSelecao);
        comboAnalise.setVisible(false);
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
        selecao = new javax.swing.JLabel();
        comboSelecao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dataFim = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dataInicio = new com.toedter.calendar.JDateChooser();
        analise = new javax.swing.JLabel();
        analisar = new javax.swing.JButton();
        anual = new javax.swing.JButton();
        marca = new javax.swing.JLabel();
        comboAnalise = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        selecao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        selecao.setText("ANALISAR:");

        comboSelecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelecaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("FIM:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("INICIO:");

        analise.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        analisar.setText("ANALISAR");
        analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisarActionPerformed(evt);
            }
        });

        anual.setText("ANUAL");
        anual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(analise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selecao, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboAnalise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(90, 90, 90)
                .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(analisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(anual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selecao, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboSelecao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(analise, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboAnalise))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(analisar)
                .addGap(18, 18, 18)
                .addComponent(anual)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisarActionPerformed
        String tipo;
        String objeto;
        
        if(comboSelecao.getSelectedItem() == null || comboAnalise.getSelectedItem() == null)
        {
            tipo = "";
            objeto = "";
                   
        }else{
        tipo = comboSelecao.getSelectedItem().toString().toLowerCase();
        objeto = comboAnalise.getSelectedItem().toString();
        }
        
        String dtIn = null;
        String dtFm = null;
        
        
            try {
             dtIn= DateFormat.getDateInstance().format(dataInicio.getDate());
             dtFm= DateFormat.getDateInstance().format(dataFim.getDate());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "As datas têm que ser preenchidos!");
        }
           construirPagina( objeto,  tipo,  dtIn,  dtFm);
    }//GEN-LAST:event_analisarActionPerformed

    private void comboSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelecaoActionPerformed
        // TODO add your handling code here:
        
        if(comboSelecao.getSelectedIndex() == -1 || comboSelecao.getSelectedIndex() == 0)
        {
            analise.setText("");
            comboAnalise.setEnabled(false);
        } 
         else {
            analise.setText(comboSelecao.getSelectedItem().toString()+":");
            comboAnalise.setVisible(true);
             comboAnalise.setEnabled(true);
             
            try {
                u.comboOracle(u.lista(comboSelecao.getSelectedItem().toString().toLowerCase()), comboAnalise);
            } catch (Exception ex) {
                Logger.getLogger(Pop_Up_AnaliseStock.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         } 
    }//GEN-LAST:event_comboSelecaoActionPerformed

    private void anualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anualActionPerformed
        // TODO add your handling code here:
        
        String ano = JOptionPane.showInputDialog(rootPane, "Ano:", "Escolha o ano", JOptionPane.QUESTION_MESSAGE);
         
        
    }//GEN-LAST:event_anualActionPerformed

    public void construirPagina(String objeto, String tipo, String dtIn, String dtFm)
    {
         try{
                AnaliseStock hm = new AnaliseStock(objeto,tipo,dtIn,dtFm,c,u);
                
                
                if(hm.getTabela().getRowCount() != 0)
                {
                    hm.setVisible(true);
                        this.dispose();
                }else{
                     JOptionPane.showMessageDialog(rootPane, "Não existem registos!");
                }
                
            } catch(Exception ex)
            {
                 JOptionPane.showMessageDialog(rootPane, "Erro a construir");
            }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisar;
    private javax.swing.JLabel analise;
    private javax.swing.JButton anual;
    private javax.swing.JComboBox<String> comboAnalise;
    private javax.swing.JComboBox<String> comboSelecao;
    private com.toedter.calendar.JDateChooser dataFim;
    private com.toedter.calendar.JDateChooser dataInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel selecao;
    // End of variables declaration//GEN-END:variables


    
}
