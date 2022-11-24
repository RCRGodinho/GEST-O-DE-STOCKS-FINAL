/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestão.de.stock.pkgfinal;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author PAT
 */
public class Analise extends javax.swing.JFrame {
    
    ResultSet rs;
    String impressora;
    String dataInicio;
    String dataFim;
    
     Conexao c = new Conexao();
        Statement stm = c.fazerConexao().createStatement();

    /**
     * Creates new form Analise
     * @param impressora
     * @param dataInicio
     * @param dataFim
     * @throws java.lang.Exception
     */
    public Analise(String impressora, String dataInicio, String dataFim) throws Exception {
        initComponents();
        this.impressora = impressora;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        
        setLocationRelativeTo(null);
        
        
       criaTabela();
       criaGrafico();
       
       
    }
    
    private void criaGrafico() throws SQLException
    {
        
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         
         rs = stm.executeQuery(query());
         
         while(rs.next())
         {
             dataset.setValue(rs.getInt("PRETO"), "Preto&Branco", rs.getString("DATA_UTIL"));
             dataset.setValue(rs.getInt("COR"), "Cores", rs.getString("DATA_UTIL"));
         
         }
         
         
         
         JFreeChart grafico = ChartFactory.createBarChart3D("Análise: "+impressora+" || Entre: "+dataInicio+" - "+dataFim,"Data", "Impressões", dataset);
         grafico.setAntiAlias(false);
         ChartPanel panel = new ChartPanel(grafico);
         panel.setBackground(getTabela().getBackground());
         
         
         painelGrafico.setLayout(new java.awt.BorderLayout());
         painelGrafico.add(panel, BorderLayout.CENTER);
         painelGrafico.validate();

         
    }
    
    /**
     *
     * @throws Exception
     * Cria tabela para análise
     */
    public void criaTabela() throws Exception
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
               Object o[] = {rs.getString("DATA_Util"),rs.getString("IC"),
                    rs.getString("MARCA"), rs.getString("MODELO"), rs.getString("CONSUMIVEL"), rs.getInt("QUANTIDADE"),
                    rs.getInt("PRETO"), rs.getString("COR"), rs.getString("LOCALIZACAO"), rs.getString("CUSTO")};
               //Adicionar os dados à tabela
               table.addRow(o);
         }
         }
       catch(SQLException exp)
       {
           throw new Exception (exp.getMessage());
       }
    }
    
    public String query()
    {
        return "SELECT DISTINCT to_char(DATA_Util,'DD/MM/YYYY') DATA_Util, IC , MARCA, MODELO, NOME AS CONSUMIVEL, QUANTIDADE, PRETO, COR, LOCALIZACAO, CUSTO "+ 
                    "FROM Utilizacao a, Consumivel b, centro_custo c, IC d, Impressora e "+
                    "WHERE a.ID_CONSUMIVEL = b.ID_CONSUMIVEL "+
                    "AND a.ID_CENTRO_CUSTO = c.ID_CENTRO_CUSTO AND b.ID_IMPRESSORA = e.ID_IMPRESSORA AND a.ID_IC =d.ID_IC "+
                    "AND d.IC = '"+impressora+"' AND a.DATA_UTIL BETWEEN to_date('"+dataInicio+"', 'DD/MM/YYYY') AND to_date('"+dataFim+"','DD/MM/YYYY') "+
                "ORDER BY DATA_Util";
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "IC", "Marca", "Modelo", "Consumivel", "Quantidade", "Preto", "Cor", "Localizacao", "Centro_Custo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(5).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
