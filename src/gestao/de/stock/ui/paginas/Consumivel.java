/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gestao.de.stock.ui.paginas;

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
public final class Consumivel extends javax.swing.JInternalFrame {

    //Inicializar os contrutores
    Conexao c;
    Utilidades u;
    Statement stm;

    /**
     *
     * @param c
     * @param u
     * @throws Exception
     */
    public Consumivel(Conexao c, Utilidades u) throws Exception {
        this.c = c;
        this.u = u;
        stm = this.c.fazerConexao().createStatement();

        initComponents();
        setPainelFixo();
        tabelaConsumivel();

        //Buscar a listagem das impressoras e colocar na combobox
        u.comboOracle(u.lista("impressora"), comboImpressora);
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
        labelNNA = new javax.swing.JLabel();
        textoNNA = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelPreco = new javax.swing.JLabel();
        textoPreco = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        labelReferencia = new javax.swing.JLabel();
        textoReferencia = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelImpressora = new javax.swing.JLabel();
        comboImpressora = new javax.swing.JComboBox<>();
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NNA", "NOME", "PRECO", "REFERENCIA", "IMPRESSORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        labelNNA.setLabelFor(textoNNA);
        labelNNA.setText("NNA");

        textoNNA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNNAKeyTyped(evt);
            }
        });

        labelNome.setText("NOME");

        labelPreco.setText("PREÇO");

        labelReferencia.setText("REFERENCIA");

        textoReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoReferenciaKeyTyped(evt);
            }
        });

        labelImpressora.setText("IMPRESSORA");

        comboImpressora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(labelNNA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoNNA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(labelReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(labelImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(comboImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelNNA))
                    .addComponent(textoNNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelNome))
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPreco)
                    .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReferencia)
                    .addComponent(textoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelImpressora))
                    .addComponent(comboImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabelaConsumivel() throws Exception {

        try {
            //definir a tabela
            DefaultTableModel table = (DefaultTableModel) tabela.getModel();
            table.setRowCount(0);

            //criar uma query e executar
            ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL, NNA, NOME, PRECO, REFERENCIA, (MARCA || '_' || MODELO) AS IMPRESSORA "
                    + "FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");

            while (rs.next()) {
                //passar os dados da BD para um object
                Object o[] = {rs.getInt("ID_CONSUMIVEL"), rs.getString("NNA"), rs.getString("NOME"),
                    rs.getDouble("PRECO"), rs.getString("REFERENCIA"), rs.getString("IMPRESSORA")};
                //Adicionar os dados à tabela
                table.addRow(o);
            }
        } catch (Exception exp) {
            throw new Exception(exp.getMessage());
        }

    }

    public void limparCampos() {

        textoNNA.setText("");
        textoNome.setText("");
        textoPreco.setText("");
        textoReferencia.setText("");
    }

    void buscarDados() {

        //Buscar os dados à tabela e disponibilizar-los para edição
        if (tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um dado para editar!");
        } else {
            int row = tabela.getSelectedRow();

            textoNNA.setText(tabela.getModel().getValueAt(row, 1).toString());
            textoNome.setText(tabela.getModel().getValueAt(row, 2).toString());
            textoPreco.setText(tabela.getModel().getValueAt(row, 3).toString());
            textoReferencia.setText(tabela.getModel().getValueAt(row, 4).toString());
            comboImpressora.setSelectedItem(tabela.getValueAt(row, 5).toString());
        }
    }

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        buscarDados();

    }//GEN-LAST:event_tabelaMouseClicked


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:

        //Verificar se os campos estão vazios.
        if (textoNNA.getText().isEmpty() || textoNome.getText().isEmpty() || textoPreco.getText().isEmpty() || textoReferencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        } else {
            //Verificar se todos têm o mesmo tamanho.
            if (textoNNA.getText().length() < 12 || textoReferencia.getText().length() < 7) {
                JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            } else {

                try {
                    Object nna = textoNNA.getText().toUpperCase();
                    Object nome = textoNome.getText().toUpperCase();
                    Object preco = Float.parseFloat(textoPreco.getText());
                    Object referencia = Integer.parseInt(textoReferencia.getText());
                    Object idImpressora = u.comboId("impressoraMarcaModelo", comboImpressora);

                    //Query de insereção, inicializando o stock a 0
                    stm.executeUpdate("INSERT INTO Consumivel(NNA,NOME,Preco,Referencia,ID_Impressora) "
                            + "VALUES('" + nna + "' , '" + nome + "' , " + preco + " , " + referencia + " , " + idImpressora + ")");

                    JOptionPane.showMessageDialog(rootPane, "Dado inserido com sucesso!");

                    limparCampos();
                    tabelaConsumivel();

                } catch (SQLException | ClassNotFoundException ex) {

                    JOptionPane.showMessageDialog(rootPane, "ERRO na query!");
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

    private void textoReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoReferenciaKeyTyped
        // TODO add your handling code here:
        if (textoReferencia.getText().length() >= 8) {
            //referencia.setText(referencia.getText().substring(0, 8));
        }
    }//GEN-LAST:event_textoReferenciaKeyTyped

    private void textoNNAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNNAKeyTyped
        // TODO add your handling code here:
        if (textoNNA.getText().length() >= 13) {
            //nna.setText(nna.getText().substring(0, 13));
        }
    }//GEN-LAST:event_textoNNAKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (textoNNA.getText().isEmpty() || textoNome.getText().isEmpty() || textoPreco.getText().isEmpty() || textoReferencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os dados têm que ser preenchidos!");
        } else {
            //Verificar se todos têm o mesmo tamanho.
            if (textoNNA.getText().length() < 13 || textoReferencia.getText().length() < 8) {
                JOptionPane.showMessageDialog(rootPane, "Há dados que não têm o tamanho suficiente");
            } else {

                int row = tabela.getSelectedRow();
                String value = tabela.getModel().getValueAt(row, 0).toString();

                try {
                    Object nna = textoNNA.getText().toUpperCase();
                    Object nome = textoNome.getText().toUpperCase();
                    Object preco = Float.parseFloat(textoPreco.getText());
                    Object referencia = Integer.parseInt(textoReferencia.getText());
                    Object idImpressora = u.comboId("impressoraMarcaModelo", comboImpressora);
                    Object idConsumivel = Integer.parseInt(value);

                    stm.executeUpdate("UPDATE Consumivel SET NNA = '" + nna + "' ,NOME = '" + nome + "', "
                            + "PRECO = " + preco + " , REFERENCIA = " + referencia + " , ID_IMPRESSORA =" + idImpressora + " "
                            + "WHERE ID_CONSUMIVEL = " + idConsumivel + "");

                    JOptionPane.showMessageDialog(rootPane, "Dado editado com sucesso!");

                    tabela.clearSelection();
                    limparCampos();
                    tabelaConsumivel();
                } catch (ClassNotFoundException | SQLException ex) {

                    JOptionPane.showMessageDialog(rootPane, "ERRO!");

                } catch (Exception ex) {
                    Logger.getLogger(Consumivel.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            int idConsumivel = Integer.parseInt(value);

            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "Tem a certeza?");
                if (op == 0) {
                    u.apagar("CONSUMIVEL", idConsumivel);

                    JOptionPane.showMessageDialog(rootPane, "Dado apagado com sucesso!");
                    tabelaConsumivel();
                    tabela.clearSelection();
                    limparCampos();
                }

            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "ERRO!");
            } catch (Exception ex) {
                Logger.getLogger(Consumivel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel butoes;
    private javax.swing.JComboBox<String> comboImpressora;
    private javax.swing.JPanel dados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelImpressora;
    private javax.swing.JLabel labelNNA;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textoNNA;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoPreco;
    private javax.swing.JTextField textoReferencia;
    // End of variables declaration//GEN-END:variables
}
