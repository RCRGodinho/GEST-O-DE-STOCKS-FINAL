/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestao.de.stock.ui.paginas;

import gestao.de.stock.ui.pop_ups.Pop_Up_Ic;
import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PAT
 */
public final class Impressora extends javax.swing.JInternalFrame {

    //Inicializar os contrutores
    Conexao c;
    Utilidades u;
    Statement stm;

    public Impressora(Conexao c, Utilidades u) throws Exception {
        this.c = c;
        this.u = u;
        stm = this.c.fazerConexao().createStatement();

        initComponents();
        setPainelFixo();
        tabelaImpressora();
    }

    private void setPainelFixo() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        dados = new javax.swing.JPanel();
        labelMarca = new javax.swing.JLabel();
        textoMarca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelModelo = new javax.swing.JLabel();
        textoModelo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIC = new javax.swing.JButton();
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MARCA", "MODELO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setName("tabelaImpressora"); // NOI18N
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
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        labelMarca.setLabelFor(textoMarca);
        labelMarca.setText("MARCA");

        textoMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoMarcaKeyTyped(evt);
            }
        });

        labelModelo.setText("MODELO");

        btnIC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIC.setText("IC");
        btnIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dadosLayout.createSequentialGroup()
                                        .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dadosLayout.createSequentialGroup()
                                        .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelModelo))
                    .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(btnIC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaImpressora() throws Exception {

        try {
            //definir a tabela
            DefaultTableModel table = (DefaultTableModel) tabela.getModel();
            table.setRowCount(0);

            //criar uma query e executar
            ResultSet rs = stm.executeQuery("SELECT ID_IMPRESSORA, MARCA, MODELO FROM Impressora");

            while (rs.next()) {
                //passar os dados da BD para um object
                Object o[] = {rs.getInt("ID_IMPRESSORA"), rs.getString("MARCA"), rs.getString("MODELO")};
                //Adicionar os dados à tabela
                table.addRow(o);
            }
        } catch (Exception exp) {
            throw new Exception(exp.getMessage());
        }

    }

    public void limparCampos() {

        textoMarca.setText("");
        textoModelo.setText("");

    }

    void buscarDados() {

        if (tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!");
        } else {
            int row = tabela.getSelectedRow();

            textoMarca.setText(tabela.getModel().getValueAt(row, 1).toString());
            textoModelo.setText(tabela.getModel().getValueAt(row, 2).toString());
        }
    }

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        buscarDados();

    }//GEN-LAST:event_tabelaMouseClicked


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:

        //Verificar se os campos estão vazios.
        if (textoMarca.getText().isEmpty() || textoModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        } else {
            try {
                Object marca = textoMarca.getText().toUpperCase();
                Object modelo = textoModelo.getText().toUpperCase();

                stm.executeUpdate("INSERT INTO IMPRESSORA(MARCA,MODELO) VALUES('" + marca + "' , '" + modelo + "')");

                JOptionPane.showMessageDialog(rootPane, "Dado inserido com sucesso!");

                limparCampos();
                tabelaImpressora();

            } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(rootPane, "ERRO!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "ERRO!");
            }
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tabelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusLost
        // TODO add your handling code here:
        //tabela.getSelectionModel().clearSelection();
        btnAdicionar.setEnabled(true);

    }//GEN-LAST:event_tabelaFocusLost

    private void textoMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoMarcaKeyTyped
        // TODO add your handling code here:
        if (textoMarca.getText().length() >= 13) {
            //nna.setText(nna.getText().substring(0, 13));
        }
    }//GEN-LAST:event_textoMarcaKeyTyped

    private void btnICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICActionPerformed
        try {
            // TODO add your handling code here:

            Pop_Up_Ic ic = new Pop_Up_Ic(c);

            ic.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Impressora.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnICActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (textoMarca.getText().isEmpty() || textoModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        } else {

            int row = tabela.getSelectedRow();
            String value = tabela.getModel().getValueAt(row, 0).toString();

            try {
                Object marca = textoMarca.getText().toUpperCase();
                Object modelo = textoModelo.getText().toUpperCase();
                Object idImpressora = Integer.parseInt(value);

                stm.executeUpdate("UPDATE Impressora SET MARCA = '" + marca + "' ,MODELO = '" + modelo + "' "
                        + "WHERE ID_IMPRESSORA = " + idImpressora + "");

                JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!");

                tabela.clearSelection();
                limparCampos();
                tabelaImpressora();
            } catch (ClassNotFoundException | SQLException ex) {

                JOptionPane.showMessageDialog(rootPane, "ERRO: " + ex + "\n");

            } catch (Exception ex) {
                Logger.getLogger(Impressora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed

        //verificar se o user selecionou algum dado
        if (tabela.getSelectedRow() == -1) {
            //   JOptionPane.showMessageDialog(rootPane, "Selecione um dado para apagar!");
        } else {
            //buscar o valor do ID no dado selecionado 

            int row = tabela.getSelectedRow();
            String value = tabela.getModel().getValueAt(row, 0).toString();
            int idImpressora = Integer.parseInt(value);

            try {
                stm = c.fazerConexao().createStatement();
                int op = JOptionPane.showConfirmDialog(rootPane, "Tem a certeza?");
                if (op == 0) {
                    u.apagar("impressora", idImpressora);
                    JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");

                    //refresh dos dados
                    tabelaImpressora();
                    tabela.clearSelection();
                    limparCampos();
                }

            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "ERRO!");
            } catch (Exception ex) {
                Logger.getLogger(Impressora.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIC;
    private javax.swing.JPanel butoes;
    private javax.swing.JPanel dados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoModelo;
    // End of variables declaration//GEN-END:variables
}
