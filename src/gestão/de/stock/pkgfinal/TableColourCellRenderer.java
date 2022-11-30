package gestão.de.stock.pkgfinal;


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
    private static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
       
        if(column == 3)
        {
                int stock = Integer.parseInt(table.getModel().getValueAt(row, column-1).toString());
                int sig = Integer.parseInt(table.getModel().getValueAt(row, column).toString());
                
                
                System.out.println(stock+" "+sig);
                
                if(stock != sig){
                     c.setBackground(Color.RED);
                     c.setForeground(table.getForeground());
                }
               
        }else{
            c.setBackground(table.getBackground());
            c.setForeground(table.getForeground());
        }
        
        return c;
    }
    
}
