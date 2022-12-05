/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.de.stock.api;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author PAT
 */
public class Util {
    
    Conexao c;
    Statement stm;

    public Util(Conexao c) throws SQLException, ClassNotFoundException{
        this.c = c;
        
        stm = c.fazerConexao().createStatement();
    }
    
    public void exportarExcel(JTable tabela)
    {
        //Localização para guardar ficheiro
        JFileChooser excelFileChooser = new JFileChooser();
        
        excelFileChooser.setDialogTitle("Guardar Como");
        //Mostrar apenas ficheiros com certas extenções
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Ficheiros Excel", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);
        
        //Ver se o botão guardar foi clicado
        
        if(excelChooser == JFileChooser.APPROVE_OPTION)
        {
            FileOutputStream excelFOU = null;
            BufferedOutputStream excelBOU = null;
            
            //Importar bibliotecas de excel
                XSSFWorkbook excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("AUGH");
            try {
                
                //Buscar linhas e colunas da tabela
                
                for(int i = 0; i<tabela.getRowCount();i++)
                {
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for(int j = 0; j<tabela.getColumnCount();j++)
                    {
                        XSSFCell excelCell = excelRow.createCell(j);
                        
                        excelCell.setCellValue(tabela.getValueAt(i, j).toString());
                    }
                }   
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                
                JOptionPane.showMessageDialog(null, "Exportado com sucesso!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if(excelBOU != null)
                    {
                        excelBOU.close();
                    }
                    if(excelFOU != null)
                    {
                        excelFOU.close();
                    }
                        excelJTableExporter.close();
                } catch (IOException ex) {
                    Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
    
    public void comboOracle(ArrayList x, JComboBox c) throws SQLException, ClassNotFoundException, Exception{
        
        c.removeAllItems();
        Iterable<String> lista = x;
        
        c.addItem("----");
        for(String s : lista)
        {
            c.addItem(s);
        }
    }
    
    public ArrayList lista(String x) throws Exception{
        ArrayList list = new ArrayList<>();
        ResultSet rs;
        
        
        switch(x)
        {
            case "consumivel" -> {
                
               rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO || '_'|| NOME) AS NOME FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");

            while(rs.next())
            {
                list.add(rs.getString("NOME"));
            }
            }
            case "impressora" ->{
             rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO) AS IMPRESSORA FROM IMPRESSORA");

            while(rs.next())
            {
                list.add(rs.getString("IMPRESSORA"));
            }
            }
            case "centro_custo" -> {
               
                rs = stm.executeQuery("SELECT CUSTO FROM CENTRO_CUSTO");

                while(rs.next())
                {
                    list.add(rs.getString("CUSTO"));
                }
            }
            case "ic" -> {
                
                rs = stm.executeQuery("SELECT IC FROM IC");

                while(rs.next())
                {
                    list.add(rs.getString("IC"));
                }
            }
            default -> {
                System.out.println("Erro Lista");
            }
        }     
        return list;
    }
    
    public int comboId(String x, JComboBox c){
        
        try{
            ResultSet rs;
            int id = 0;
            
            switch(x)
            {
                case "consumivel" -> {
                    String[] result =c.getSelectedItem().toString().split("_");
                        String marca = result[0];
                        String modelo = result[1];
                        String cons = result[2];
                    
                    rs = stm.executeQuery("SELECT ID_CONSUMIVEL FROM CONSUMIVEL a, IMPRESSORA b WHERE NOME = '"+cons+"' AND MARCA = '"+marca+"' AND MODELO = '"+modelo+"'");
                    while(rs.next())
                    {
                        id = rs.getInt(1);
                    }
                    
                }
                case "localizacao" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE LOCALIZACAO = '"+c.getSelectedItem()+"'");
                    while(rs.next())
                    {
                        id = rs.getInt(1);
                    }  
                    
                }
                case "centro_custo" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE CUSTO = '"+c.getSelectedItem()+"'");
                    while(rs.next())
                    {
                        id = rs.getInt(1);
                    }  
                    
                }
                case "ic" -> {
                    rs = stm.executeQuery("SELECT ID_IC FROM IC WHERE IC = '"+c.getSelectedItem()+"'");
                    while(rs.next())
                    {
                       id = rs.getInt(1);
                    }
             
                }
                case "impressora" -> {
                    rs = stm.executeQuery("SELECT a.ID_Impressora FROM IMPRESSORA a, IC b  WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.IC = '"+c.getSelectedItem()+"'");
                    while(rs.next())
                    {
                       id = rs.getInt(1);
                    }
             
                }
               
                default -> {
                    System.out.println("comboID Erro");
                    return -1;
                }
            }
             
             return id;
             
        }catch(SQLException exp){
            return 0;
        }
    }
    
     public String comboString(String x, JComboBox c) throws SQLException
     {
         ResultSet rs;
     
         switch(x)
            {
                case "centro_custo" -> {
                    rs = stm.executeQuery("SELECT Localizacao FROM CENTRO_CUSTO a, Utilizacao b WHERE a.ID_CENTRO_CUSTO = b.ID_CENTRO_CUSTO AND b.ID_IC = "+comboId("impressora", c)+"");
                    while(rs.next())
                    {
                        return rs.getString("Localizacao");
                    }  
                    
                }
                case "impressora" ->{
                    rs = stm.executeQuery("SELECT (Marca || ' ' || Modelo) AS IMPRESSORA FROM Impressora a, IC b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.ID_IC = "+comboId("impressora",c )+"");
                    while(rs.next())
                    {
                        return rs.getString("IMPRESSORA");
                    }  
                }
     }
         return null;
     }
     
     
    
}
