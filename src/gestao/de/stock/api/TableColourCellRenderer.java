package gestao.de.stock.api;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PAT
 */
public class TableColourCellRenderer implements TableCellRenderer{
    String tabela;
    Util u;
    
    public TableColourCellRenderer(String tabela,Util u) {
        this.tabela = tabela;
        this.u = u;
    }
    
    
    private static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
       
        if(tabela.equals("Stock"))
        {
            c = u.tableStockColourRenderer(c, row, column, table);
        }else if(tabela.equals("Sig")){
            c = u.tableSigColourRenderer(c, row, column, table);
        }
        
        return c;
    }
    
    
}
