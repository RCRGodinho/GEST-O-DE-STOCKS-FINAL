/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui.pop_ups;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Configuracao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PAT
 */
public class Pop_Up_Configuração extends javax.swing.JFrame {

    //Variaveis
    Conexao c;

    String orcUrlS;
    String driverS;
    String userS;
    String passS;
    boolean en = false;

    Configuracao conf = new Configuracao();

    /**
     * Creates new form Pop_Up_Analise
     *
     * @param c
     * @throws java.lang.Exception
     */
    public Pop_Up_Configuração(Conexao c) throws Exception {
        this.c = c;

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        oracleURL.setText(c.getOrcUrl());
        driver.setText(c.getDriver());
        user.setText(c.getUser());
        pass.setText(c.getPass());

        setTitle("Configuração da ligação");

    }

    public boolean guardarDados() {
        //gurdar os dados nas variaveis e verificar se estão preenchidos

        orcUrlS = oracleURL.getText();
        driverS = driver.getText();
        userS = user.getText();
        passS = pass.getText();

        if (orcUrlS.equals("") || driverS.equals("") || userS.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Os dados têm que ser preenchidos!");
        } else {
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlble = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        testar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        marca = new javax.swing.JLabel();
        oracleURL = new javax.swing.JTextField();
        driver = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        estado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("URL SERVIDOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 100, 31));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("PASS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 186, 100, 31));

        jlble.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlble.setText("USER");
        jPanel1.add(jlble, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, 100, 31));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("DRIVER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 100, 31));

        testar.setText("TESTAR CONEXÃO");
        testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarActionPerformed(evt);
            }
        });
        jPanel1.add(testar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 468, -1));

        guardar.setText("GUARDAR E SAIR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 468, -1));

        marca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 39, 356, 31));
        jPanel1.add(oracleURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 39, 356, 31));
        jPanel1.add(driver, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 88, 356, 31));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 137, 356, 31));

        sair.setText("SAIR SEM GUARDAR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 468, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 186, 356, 31));

        estado.setColumns(20);
        estado.setRows(5);
        jScrollPane1.setViewportView(estado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarActionPerformed
        //verificar se os dados estão preenchidos
        if (guardarDados()) {
            try {
                if (c.fazerConexao(orcUrlS, userS, passS, estado) == null) {
                    estado.setForeground(Color.red);
                    en = false;
                } else {
                    estado.setForeground(Color.green);
                    en = true;
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Pop_Up_Configuração.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_testarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:

        if (en) {
            conf.guardarPropriedade("orcUrl", orcUrlS);
            c.setUser(userS);

            c.setDriver(driverS);
            conf.guardarPropriedade("driver", driverS);
            c.setOrcUrl(orcUrlS);

            conf.guardarPropriedade("user", userS);
            c.setPass(passS);
            conf.guardarPropriedade("pass", passS);

            JOptionPane.showMessageDialog(rootPane, "Dados guardados com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "A conexão tem que ser validada primeiro!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField driver;
    private javax.swing.JTextArea estado;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlble;
    private javax.swing.JLabel marca;
    private javax.swing.JTextField oracleURL;
    private javax.swing.JTextField pass;
    private javax.swing.JButton sair;
    private javax.swing.JButton testar;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
