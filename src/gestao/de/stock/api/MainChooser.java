/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.de.stock.api;

import gestao.de.stock.ui.paginas.GestaoDeStockFINAL;
import gestao.de.stock.ui.pop_ups.Pop_Up_ConfiguracaoServidor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PATz
 */
public class MainChooser {

    Conexao c;

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
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Conexao c = new Conexao();

                    if (c.testarConexao()) {
                        GestaoDeStockFINAL gs = new GestaoDeStockFINAL();
                        gs.setVisible(true);
                    } else {
                        Pop_Up_ConfiguracaoServidor cs = new Pop_Up_ConfiguracaoServidor(c,true);
                        cs.setVisible(true);

                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(MainChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
