/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui;

import gestao.de.stock.api.Conexao;
import java.awt.Color;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAT
 */
public class GestãoDeStockFINAL extends javax.swing.JFrame {
    
    Conexao c = new Conexao();

     Color preto = new Color(0,0,0);; 
     Color branco = new Color(232, 236, 244);
     boolean click3;
     boolean click4;
     boolean click2;
     boolean click5;
     boolean click1;
     boolean click6;
    
    /**
     * Creates new form Main
     */
    public GestãoDeStockFINAL() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
       
       Main main = new Main();
       paginas.add(main).setVisible(true);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        logoMainn = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        pagina2 = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();
        pagina3 = new javax.swing.JLabel();
        painel4 = new javax.swing.JPanel();
        pagina4 = new javax.swing.JLabel();
        painel5 = new javax.swing.JPanel();
        pagina5 = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        pagina1 = new javax.swing.JLabel();
        painel6 = new javax.swing.JPanel();
        pagina6 = new javax.swing.JLabel();
        paginas = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(232, 236, 244));
        mainPanel.setPreferredSize(new java.awt.Dimension(1070, 650));

        menuPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel.setPreferredSize(new java.awt.Dimension(1070, 40));

        logoMainn.setFont(new java.awt.Font("Webdings", 0, 11)); // NOI18N
        logoMainn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo (1).png"))); // NOI18N
        logoMainn.setMaximumSize(new java.awt.Dimension(220, 40));
        logoMainn.setMinimumSize(new java.awt.Dimension(220, 327));
        logoMainn.setPreferredSize(new java.awt.Dimension(220, 40));
        logoMainn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMainnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoMainnMouseEntered(evt);
            }
        });

        painel2.setBackground(new java.awt.Color(0, 0, 0));
        painel2.setPreferredSize(new java.awt.Dimension(120, 40));
        painel2.setLayout(new java.awt.BorderLayout());

        pagina2.setBackground(new java.awt.Color(0, 0, 0));
        pagina2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina2.setForeground(new java.awt.Color(255, 255, 255));
        pagina2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina2.setText("STOCK");
        pagina2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pagina2.setPreferredSize(new java.awt.Dimension(100, 20));
        pagina2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina2MouseExited(evt);
            }
        });
        painel2.add(pagina2, java.awt.BorderLayout.CENTER);

        painel3.setBackground(new java.awt.Color(0, 0, 0));
        painel3.setPreferredSize(new java.awt.Dimension(120, 40));
        painel3.setLayout(new java.awt.BorderLayout());

        pagina3.setBackground(new java.awt.Color(0, 0, 0));
        pagina3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina3.setForeground(new java.awt.Color(255, 255, 255));
        pagina3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina3.setText("CONSUMIVEIS");
        pagina3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pagina3.setPreferredSize(new java.awt.Dimension(100, 20));
        pagina3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina3MouseExited(evt);
            }
        });
        painel3.add(pagina3, java.awt.BorderLayout.CENTER);

        painel4.setBackground(new java.awt.Color(0, 0, 0));
        painel4.setPreferredSize(new java.awt.Dimension(120, 40));
        painel4.setLayout(new java.awt.BorderLayout());

        pagina4.setBackground(new java.awt.Color(0, 0, 0));
        pagina4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina4.setForeground(new java.awt.Color(255, 255, 255));
        pagina4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina4.setText("IMPRESSORAS");
        pagina4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pagina4.setPreferredSize(new java.awt.Dimension(100, 20));
        pagina4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina4MouseExited(evt);
            }
        });
        painel4.add(pagina4, java.awt.BorderLayout.CENTER);

        painel5.setBackground(new java.awt.Color(0, 0, 0));
        painel5.setPreferredSize(new java.awt.Dimension(160, 40));
        painel5.setLayout(new java.awt.BorderLayout());

        pagina5.setBackground(new java.awt.Color(0, 0, 0));
        pagina5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina5.setForeground(new java.awt.Color(255, 255, 255));
        pagina5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina5.setText("CENTRO DE CUSTO");
        pagina5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pagina5.setPreferredSize(new java.awt.Dimension(100, 20));
        pagina5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina5MouseExited(evt);
            }
        });
        painel5.add(pagina5, java.awt.BorderLayout.CENTER);

        painel1.setBackground(new java.awt.Color(0, 0, 0));
        painel1.setPreferredSize(new java.awt.Dimension(120, 40));
        painel1.setLayout(new java.awt.BorderLayout());

        pagina1.setBackground(new java.awt.Color(0, 0, 0));
        pagina1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina1.setForeground(new java.awt.Color(255, 255, 255));
        pagina1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina1.setText("UTILIZAÇÃO");
        pagina1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pagina1.setPreferredSize(new java.awt.Dimension(100, 20));
        pagina1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina1MouseExited(evt);
            }
        });
        painel1.add(pagina1, java.awt.BorderLayout.CENTER);

        painel6.setBackground(new java.awt.Color(0, 0, 0));
        painel6.setLayout(new java.awt.BorderLayout());

        pagina6.setBackground(new java.awt.Color(0, 0, 0));
        pagina6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        pagina6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagina6.setText("SIG");
        pagina6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagina6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagina6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagina6MouseExited(evt);
            }
        });
        painel6.add(pagina6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoMainn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoMainn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        paginas.setBackground(new java.awt.Color(232, 236, 244));

        javax.swing.GroupLayout paginasLayout = new javax.swing.GroupLayout(paginas);
        paginas.setLayout(paginasLayout);
        paginasLayout.setHorizontalGroup(
            paginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        paginasLayout.setVerticalGroup(
            paginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paginas)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(paginas))
        );

        jMenu.setText("Aplicação");

        jMenuItem1.setText("Configurações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem1);

        menu.add(jMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void pagina3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina3MouseClicked
         try {
             // TODO add your handling code here:
             //Definir cores
             
             click4 = false;
             click1 = false;
             click3 = true;
             click5 = false;
             click2 = false;
             click6 = false;
             
             painel3.setBackground(branco);
             pagina3.setForeground(preto);
             
             painel2.setBackground(preto);
             painel5.setBackground(preto);
             painel4.setBackground(preto);
             painel1.setBackground(preto);
             painel6.setBackground(preto);
             
             pagina2.setForeground(branco);
             pagina4.setForeground(branco);
             pagina5.setForeground(branco);
             pagina1.setForeground(branco);
             pagina6.setForeground(branco);
              
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             Consumivel hm = new Consumivel(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_pagina3MouseClicked

    private void pagina3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina3MouseEntered
        // TODO add your handling code here:
        painel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        painel3.setBackground(branco);
            pagina3.setForeground(preto);
    }//GEN-LAST:event_pagina3MouseEntered

    private void pagina3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina3MouseExited
        // TODO add your handling code here:
        if(!click3)
        {
            painel3.setBackground(preto);
            pagina3.setForeground(branco);
        }
         
    }//GEN-LAST:event_pagina3MouseExited

    private void pagina4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina4MouseClicked
         try {
             // TODO add your handling code here:
             click5 = false;
             click1 = false;
             click2 = false;
             click4 = true;
             click3 = false;
             click6 = false;
             
             painel4.setBackground(branco);
             pagina4.setForeground(preto);
             
             painel3.setBackground(preto);
             painel5.setBackground(preto);
             painel2.setBackground(preto);
             painel1.setBackground(preto);
             painel6.setBackground(preto);
             
             pagina3.setForeground(branco);
             pagina2.setForeground(branco);
             pagina5.setForeground(branco);
             pagina1.setForeground(branco);
             pagina6.setForeground(branco);
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             Impressora hm = new Impressora(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_pagina4MouseClicked

    private void pagina4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina4MouseEntered
        // TODO add your handling code here:
        painel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        painel4.setBackground(branco);
            pagina4.setForeground(preto);
    }//GEN-LAST:event_pagina4MouseEntered

    private void pagina4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina4MouseExited
        // TODO add your handling code here:
        if(!click4)
        {
            painel4.setBackground(preto);
            pagina4.setForeground(branco);
        }
        
    }//GEN-LAST:event_pagina4MouseExited

    private void pagina5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina5MouseClicked
         try {
             // TODO add your handling code here:
             click5 = true;
             click1 = false;
             click2 = false;
             click4 = false;
             click6 = false;
             click3 = false;
             
             painel5.setBackground(branco);
             pagina5.setForeground(preto);
             
             painel2.setBackground(preto);
             painel3.setBackground(preto);
             painel4.setBackground(preto);
             painel1.setBackground(preto);
             painel6.setBackground(preto);
             
             pagina2.setForeground(branco);
             pagina4.setForeground(branco);
             pagina3.setForeground(branco);
             pagina1.setForeground(branco);
             pagina6.setForeground(branco);
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             CentroCusto hm = new CentroCusto(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_pagina5MouseClicked

    private void pagina5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina5MouseEntered
        // TODO add your handling code here:
        painel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        painel5.setBackground(branco);
            pagina5.setForeground(preto);
    }//GEN-LAST:event_pagina5MouseEntered

    private void pagina5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina5MouseExited
        // TODO add your handling code here:
        if(!click5)
        {
             painel5.setBackground(preto);
            pagina5.setForeground(branco);
        }
    }//GEN-LAST:event_pagina5MouseExited

    private void logoMainnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMainnMouseClicked
        // TODO add your handling code here:
        
         click5 = false;
         click1 = false;
        click2 = false;
        click4 = false;
        click3 = false;
        click6 = false;
        
        
            
             painel5.setBackground(preto);
            painel2.setBackground(preto);
            painel3.setBackground(preto);
            painel4.setBackground(preto);
            painel1.setBackground(preto);
            painel6.setBackground(preto);
            
            
            pagina5.setForeground(branco);
            pagina2.setForeground(branco);
            pagina4.setForeground(branco);
            pagina3.setForeground(branco);
            pagina1.setForeground(branco);
            pagina6.setForeground(branco);
            
            ////////////////////////////////////////////////////////////
            
            //Remover a pagina antiga
        paginas.removeAll();
        //Criar objeto para nova class
        Main hm = new Main();
        //Adicionar a nova página
        paginas.add(hm).setVisible(true);
    }//GEN-LAST:event_logoMainnMouseClicked

    private void pagina1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina1MouseClicked
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             //Definir cores
             
             click4 = false;
             click1 = true;
             click3 = false;
             click5 = false;
             click2 = false;
             click6 = false;
             
             painel1.setBackground(branco);
             pagina1.setForeground(preto);
             
             painel2.setBackground(preto);
             painel5.setBackground(preto);
             painel4.setBackground(preto);
             painel3.setBackground(preto);
             painel6.setBackground(preto);
             
             pagina2.setForeground(branco);
             pagina4.setForeground(branco);
             pagina5.setForeground(branco);
             pagina3.setForeground(branco);
             pagina6.setForeground(branco);
              
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             Utilizacao hm = new Utilizacao(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_pagina1MouseClicked

    private void pagina1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina1MouseEntered
        // TODO add your handling code here:
        painel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         painel1.setBackground(branco);
            pagina1.setForeground(preto);
    }//GEN-LAST:event_pagina1MouseEntered

    private void pagina1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina1MouseExited
        // TODO add your handling code here:
        if(!click1)
        {
             painel1.setBackground(preto);
            pagina1.setForeground(branco);
        }
    }//GEN-LAST:event_pagina1MouseExited

    private void pagina2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina2MouseClicked
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             //Definir cores
             
             click4 = false;
             click1 = false;
             click3 = false;
             click5 = false;
             click2 = true;
             click6 = false;
             
             painel2.setBackground(branco);
             pagina2.setForeground(preto);
             
             
             painel5.setBackground(preto);
             painel4.setBackground(preto);
             painel1.setBackground(preto);
             painel3.setBackground(preto);
             painel6.setBackground(preto);
             
             pagina1.setForeground(branco);
             pagina4.setForeground(branco);
             pagina5.setForeground(branco);
             pagina3.setForeground(branco);
             pagina6.setForeground(branco);
              
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             Stock hm = new Stock(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_pagina2MouseClicked

    private void pagina2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina2MouseEntered
        // TODO add your handling code here:
        painel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
         painel2.setBackground(branco);
            pagina2.setForeground(preto);
    }//GEN-LAST:event_pagina2MouseEntered

    private void pagina2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina2MouseExited
        // TODO add your handling code here:
        
         if(!click2)
        {
             painel2.setBackground(preto);
            pagina2.setForeground(branco);
        }
    }//GEN-LAST:event_pagina2MouseExited

    private void logoMainnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMainnMouseEntered
        // TODO add your handling code here:
        logoMainn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoMainnMouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         try {
             // TODO add your handling code here:
             
             //Inicializar e abrir o Pop Up da configuração

             Pop_Up_Configuração hm = new Pop_Up_Configuração(c);
             
             hm.setVisible(true);
             
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void pagina6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina6MouseClicked
        // TODO add your handling code here:
        try {
             // TODO add your handling code here:
             //Definir cores
             
             click4 = false;
             click1 = false;
             click3 = false;
             click5 = false;
             click2 = false;
             click6 = true;
             
             
             painel6.setBackground(branco);
             pagina6.setForeground(preto);
             
             painel2.setBackground(preto);
             painel5.setBackground(preto);
             painel4.setBackground(preto);
             painel1.setBackground(preto);
             painel3.setBackground(preto);
             
             pagina1.setForeground(branco);
             pagina4.setForeground(branco);
             pagina5.setForeground(branco);
             pagina3.setForeground(branco);
             pagina2.setForeground(branco);
             
             //Remover a pagina antiga
             paginas.removeAll();
             //Criar objeto para nova class
             Sig hm = new Sig(c);
             //Adicionar a nova página
             paginas.add(hm).setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_pagina6MouseClicked

    private void pagina6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina6MouseEntered
        // TODO add your handling code here:
        painel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
         painel6.setBackground(branco);
            pagina6.setForeground(preto);
    }//GEN-LAST:event_pagina6MouseEntered

    private void pagina6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagina6MouseExited
        // TODO add your handling code here:
         if(!click6)
        {
             painel6.setBackground(preto);
            pagina6.setForeground(branco);
        }
    }//GEN-LAST:event_pagina6MouseExited

    
    
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
            java.util.logging.Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestãoDeStockFINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestãoDeStockFINAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel logoMainn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pagina1;
    private javax.swing.JLabel pagina2;
    private javax.swing.JLabel pagina3;
    private javax.swing.JLabel pagina4;
    private javax.swing.JLabel pagina5;
    private javax.swing.JLabel pagina6;
    private javax.swing.JDesktopPane paginas;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painel4;
    private javax.swing.JPanel painel5;
    private javax.swing.JPanel painel6;
    // End of variables declaration//GEN-END:variables
}
