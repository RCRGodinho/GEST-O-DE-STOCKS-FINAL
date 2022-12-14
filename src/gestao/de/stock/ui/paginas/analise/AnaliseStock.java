/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao.de.stock.ui.paginas.analise;

import gestao.de.stock.api.Conexao;
import gestao.de.stock.api.Util;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author PAT
 */
public class AnaliseStock extends javax.swing.JFrame {
    
    ResultSet rs;
    String consumivel;
    String dataInicio;
    String dataFim;
    
     Conexao c;
     Util u;
        Statement stm;

    /**
     * Creates new form Analise
     * @param consumivel
     * @param dataInicio
     * @param dataFim
     * @param c
     * @param u
     * @throws java.lang.Exception
     */
    public AnaliseStock(String consumivel, String dataInicio, String dataFim, Conexao c, Util u) throws Exception {
        initComponents();
        this.consumivel = consumivel;
        
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.c = c;
        this.u = u;
        stm = this.c.fazerConexao().createStatement();
        
        setLocationRelativeTo(null);
        
        
       criaTabela();
       criaGrafico();
     
       if(consumivel.isBlank())
           setTitle("Análise de Stocks - Todas as entradas");
       else
            setTitle("Análise de Stocks - "+consumivel);
    }
    
    private void criaGrafico() throws SQLException
    {
        
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         
         rs = stm.executeQuery(query());
         
         while(rs.next())
         {
             //dados para inserir na tabela
             dataset.setValue(rs.getInt("QUANTIDADE"), "QUANTIDADE", rs.getString("DATA"));
         
         }
         
         String titulo;
         if(consumivel.isBlank())
             titulo = "Análise: Todos os consumiveis";
            else
                titulo = "Análise: "+consumivel;
         
         
         
         //define o gráfico e o tipo de dados que vai utilizar
         JFreeChart grafico = ChartFactory.createBarChart3D(titulo+" || Entre: "+dataInicio+" - "+dataFim,"Data", "ENTRADAS", dataset);
         
         
         grafico.setAntiAlias(false);
         ChartPanel panel = new ChartPanel(grafico);
         panel.setBackground(getTabela().getBackground());
         
         
         painelGrafico.setLayout(new java.awt.BorderLayout());
         painelGrafico.add(panel, BorderLayout.CENTER);
         painelGrafico.validate();

         rs = null;
    }
    
    /**
     *
     * @throws Exception
     * Cria tabela para análise
     */
    private void criaTabela() throws Exception
    {
        try{
             //definir a tabela
             DefaultTableModel table = (DefaultTableModel) getTabela().getModel();
             table.setRowCount(0);
             
             //criar uma query e executar
                rs = stm.executeQuery(query());
             
         
           while(rs.next())
           {
               //passar os dados da BD para um object
               Object o[] = {rs.getString("NNA"),rs.getString("CONSUMIVEL"),
                    rs.getString("DATA"), rs.getInt("QUANTIDADE")};
               //Adicionar os dados à tabela
               table.addRow(o);
         }
         }
       catch(SQLException exp)
       {
           throw new Exception (exp.getMessage());
       }
        rs = null;
    }
    
    //função que devolve a query a fazer a fim de pesquisar os dados num intervalo de tempo 
    public String query() throws SQLException
    {
        int id = u.getIdConsumivel(consumivel);
        
        String q = "SELECT NNA, to_char(DATA,'DD/MM/YYYY') DATA, "
                 + "(MARCA || '_' || MODELO || '_'|| NOME) AS CONSUMIVEL, QUANTIDADE "
                 + "FROM Consumivel a, Impressora b, Registo_Stock c "
                 + "WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND a.ID_CONSUMIVEL = c.ID_CONSUMIVEL "
                 + "AND DATA BETWEEN to_date('"+dataInicio+"', 'DD/MM/YYYY') AND to_date('"+dataFim+"','DD/MM/YYYY') ";
                
                if(id>=1){
                    q = q+ "AND c.ID_CONSUMIVEL = "+id+" ";
                }
                 q = q+ "ORDER BY DATA";
        
                 
        return q;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGrafico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(232, 236, 244));

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NNA", "Data", "Consumivel", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane1.setViewportView(tabela);

        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
        u.exportarExcel(tabela);
    }//GEN-LAST:event_exportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tabela
     */
    public javax.swing.JTable getTabela() {
        return tabela;
    }
}
