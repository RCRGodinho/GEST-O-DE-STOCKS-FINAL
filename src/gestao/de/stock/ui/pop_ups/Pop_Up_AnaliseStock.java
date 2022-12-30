/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui.pop_ups;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Utilidades;
import gestao.de.stock.ui.paginas.analise.AnaliseStock;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    Utilidades u;
    Statement stm;

    /**
     * Creates new form Pop_Up_Analise
     *
     * @param c
     * @param u
     * @throws java.lang.Exception
     */
    public Pop_Up_AnaliseStock(Conexao c, Utilidades u) throws Exception {
        this.c = c;
        this.u = u;
        stm = c.fazerConexao().createStatement();

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        u.comboOracle(u.lista("consumivel"), comboConsumivel);
        dataInicio.setDate(null);
        dataFim.setDate(null);

        setTitle("Análise de Stocks");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selecao = new javax.swing.JLabel();
        comboConsumivel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dataFim = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dataInicio = new com.toedter.calendar.JDateChooser();
        analisar = new javax.swing.JButton();
        marca = new javax.swing.JLabel();
        btnAno = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        escolherAno = new com.toedter.calendar.JYearChooser();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        selecao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        selecao.setText("CONSUMIVEL:");

        comboConsumivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboConsumivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConsumivelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("FIM:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("INICIO:");

        analisar.setText("ANALISAR");
        analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisarActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btnAno.setText("SIM");
        btnAno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnAnoItemStateChanged(evt);
            }
        });

        jLabel1.setText("ANUAL?");

        escolherAno.setEnabled(false);
        escolherAno.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                escolherAnoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(analisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboConsumivel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(escolherAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(80, 80, 80)
                .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selecao, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboConsumivel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAno, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(escolherAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(analisar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisarActionPerformed

        String consumivel = getConsumivel();
        System.out.println("x:" + consumivel);
        if (!getDatas().isBlank()) {
            String[] datas = getDatas().split("_");
            String dtIn = datas[0];
            String dtFm = datas[1];

            construirPagina(consumivel, dtIn, dtFm);
        }
    }//GEN-LAST:event_analisarActionPerformed

    private void comboConsumivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConsumivelActionPerformed

    }//GEN-LAST:event_comboConsumivelActionPerformed

    private void btnAnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnAnoItemStateChanged
        // TODO add your handling code here:

        if (btnAno.isSelected()) {
            btnAno.setText("NÃO");
            escolherAno.setEnabled(true);
            dataInicio.setEnabled(false);
            dataFim.setEnabled(false);
        } else {
            btnAno.setText("SIM");
            escolherAno.setEnabled(false);
            dataInicio.setEnabled(true);
            dataInicio.setDate(null);
            dataFim.setEnabled(true);
            dataFim.setDate(null);

        }
    }//GEN-LAST:event_btnAnoItemStateChanged

    private void escolherAnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_escolherAnoPropertyChange
        try {
            setDatas(String.valueOf(escolherAno.getValue()));

        } catch (ParseException ex) {
            Logger.getLogger(Pop_Up_AnaliseStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_escolherAnoPropertyChange

    public String getConsumivel() {
        String consumivel;

        if (comboConsumivel.getSelectedItem() == null || comboConsumivel.getSelectedIndex() == 0) {
            consumivel = "";

        } else {
            consumivel = comboConsumivel.getSelectedItem().toString().toLowerCase();
        }

        return consumivel;
    }

    public String getDatas() {

        String dtIn;
        String dtFm;

        try {
            dtIn = DateFormat.getDateInstance().format(dataInicio.getDate());
            dtFm = DateFormat.getDateInstance().format(dataFim.getDate());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "As datas têm que ser preenchidos!");
            return "";
        }
        return dtIn + "_" + dtFm;
    }

    public void setDatas(String ano) throws ParseException {
        String data = "01/01/" + ano;
        java.util.Date date = new SimpleDateFormat("dd/MM/yy").parse(data);
        dataInicio.setDate(date);
        ////////////////////////////////////////////////////////////////////////////
        data = "31/12/" + ano;
        date = new SimpleDateFormat("dd/MM/yy").parse(data);
        dataFim.setDate(date);
    }

    public void construirPagina(String consumivel, String dtIn, String dtFm) {
        try {
            AnaliseStock hm = new AnaliseStock(consumivel, dtIn, dtFm, c, u);

            if (hm.getTabela().getRowCount() != 0) {
                hm.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existem registos!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro a construir" + ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisar;
    private javax.swing.JToggleButton btnAno;
    private javax.swing.JComboBox<String> comboConsumivel;
    private com.toedter.calendar.JDateChooser dataFim;
    private com.toedter.calendar.JDateChooser dataInicio;
    private com.toedter.calendar.JYearChooser escolherAno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel selecao;
    // End of variables declaration//GEN-END:variables

}
