/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.de.stock.api;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author PAT
 */
public class Utilidades {

    Conexao c;
    Statement stm;

    public Utilidades(Conexao c) throws SQLException, ClassNotFoundException {
        this.c = c;
        stm = this.c.fazerConexao().createStatement();
    }

    public void exportarExcel(JTable tabela) {
        //Localização para guardar ficheiro
        JFileChooser excelFileChooser = new JFileChooser();

        excelFileChooser.setDialogTitle("Guardar Como");
        //Mostrar apenas ficheiros com certas extenções
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Ficheiros Excel", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        //Ver se o botão guardar foi clicado
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            FileOutputStream excelFOU = null;
            BufferedOutputStream excelBOU = null;

            //Importar bibliotecas de excel
            XSSFWorkbook excelJTableExporter = new XSSFWorkbook();
            XSSFSheet excelSheet = excelJTableExporter.createSheet("Página 1");
            try {
                XSSFRow excelRow;
                XSSFCell excelCell;

                //Definir estilos
                CellStyle style = excelJTableExporter.createCellStyle();
                XSSFFont font = excelJTableExporter.createFont();
                font.setBold(true);

                style.setFont(font);
                style.setAlignment(HorizontalAlignment.CENTER);

                //Buscar linhas e colunas da tabela
                excelRow = excelSheet.createRow(0);
                for (int j = 0; j < tabela.getColumnCount(); j++) {
                    excelCell = excelRow.createCell(j);
                    excelCell.setCellValue(tabela.getColumnName(j));
                    excelCell.setCellStyle(style);
                }

                for (int i = 0; i < tabela.getRowCount(); i++) {
                    excelRow = excelSheet.createRow(i + 1);
                    for (int j = 0; j < tabela.getColumnCount(); j++) {
                        excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(tabela.getValueAt(i, j).toString());

                    }
                }
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);

                JOptionPane.showMessageDialog(null, "Exportado com sucesso!");
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {

            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    excelJTableExporter.close();
                } catch (IOException ex) {
                }
            }

        }
    }

    public void importarExcel(String tabela) throws FileNotFoundException, IOException {

        //Localização para guardar ficheiro
        JFileChooser excelFileChooser = new JFileChooser();

        excelFileChooser.setDialogTitle("Selecionar Ficheiro");
        //Mostrar apenas ficheiros com certas extenções

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Ficheiros Excel", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showSaveDialog(null);

        //Ver se o botão guardar foi clicado
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            //Buscar ficheiro selecionado 
            File excelFile = excelFileChooser.getSelectedFile();
            FileInputStream excelFIS = new FileInputStream(excelFile);
            //Criar uma strem de input
            BufferedInputStream excelBIS = new BufferedInputStream(excelFIS);

            //Ficheiro propriamente dito para conseguir extrair os dados
            XSSFWorkbook excelJTableInporter = new XSSFWorkbook(excelBIS);
            XSSFSheet excelSheet = excelJTableInporter.getSheetAt(0);

            //verificar qual a tabela escolhida
            switch (tabela) {
                case "consumivel" -> {

                    for (int y = 1; y < excelSheet.getLastRowNum(); y++) {
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 5; z++) {
                            XSSFCell cell = excelRow.getCell(z);
                            System.err.print(cell + " ");
                        }
                        System.err.println("");
                    }
                }
                case "impressora" -> {
                    
                    for (int y = 1; y < excelSheet.getLastRowNum(); y++) {
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 5; z++) {
                            XSSFCell cell = excelRow.getCell(z);
                            System.err.print(cell + " ");
                        }
                        System.err.println("");
                    }

                }
                case "centro_custo" -> {
                    
                    for (int y = 1; y < excelSheet.getLastRowNum(); y++) {
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 5; z++) {
                            XSSFCell cell = excelRow.getCell(z);
                            System.err.print(cell + " ");
                        }
                        System.err.println("");
                    }

                }
            }

        }

    }

    public void comboOracle(ArrayList x, JComboBox c) throws SQLException, ClassNotFoundException, Exception {

        c.removeAllItems();
        Iterable<String> lista = x;

        c.addItem("----");
        for (String s : lista) {
            c.addItem(s);
        }
    }

    public ArrayList lista(String x) throws Exception {
        ArrayList list = new ArrayList<>();
        ResultSet rs;

        switch (x) {
            case "consumivel" -> {

                rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO || '_'|| NOME) AS NOME FROM CONSUMIVEL a, IMPRESSORA b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA");

                while (rs.next()) {
                    list.add(rs.getString("NOME"));
                }
            }
            case "impressora" -> {
                rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO) AS IMPRESSORA FROM IMPRESSORA");

                while (rs.next()) {
                    list.add(rs.getString("IMPRESSORA"));
                }
            }
            case "centro_custo" -> {

                rs = stm.executeQuery("SELECT CUSTO FROM CENTRO_CUSTO");

                while (rs.next()) {
                    list.add(rs.getString("CUSTO"));
                }
            }
            case "localizacao" -> {

                rs = stm.executeQuery("SELECT LOCALIZACAO FROM CENTRO_CUSTO");

                while (rs.next()) {
                    list.add(rs.getString("LOCALIZACAO"));
                }
            }
            case "ic" -> {

                rs = stm.executeQuery("SELECT IC FROM IC");

                while (rs.next()) {
                    list.add(rs.getString("IC"));
                }
            }
            case "tabelas" -> {

                list.add("centro_custo".toUpperCase());
                list.add("consumivel".toUpperCase());
                list.add("ic".toUpperCase());
            }
            default -> {
                System.out.println("Erro Lista");
            }
        }
        return list;
    }

    public int comboId(String x, JComboBox c) {

        try {
            ResultSet rs;
            int id = 0;

            switch (x) {
                case "consumivel" -> {
                    String[] result = c.getSelectedItem().toString().split("_");
                    String marca = result[0];
                    String modelo = result[1];
                    String cons = result[2];

                    rs = stm.executeQuery("SELECT ID_CONSUMIVEL FROM CONSUMIVEL a, IMPRESSORA b WHERE NOME = '" + cons + "' AND MARCA = '" + marca + "' AND MODELO = '" + modelo + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                case "localizacao" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE LOCALIZACAO = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                case "centro_custo" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE CUSTO = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                case "ic" -> {
                    rs = stm.executeQuery("SELECT ID_IC FROM IC WHERE IC = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                case "impressora" -> {
                    rs = stm.executeQuery("SELECT a.ID_Impressora FROM IMPRESSORA a, IC b  "
                            + "WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.IC = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                case "impressoraMarcaModelo" -> {
                    String[] result = c.getSelectedItem().toString().split("_");
                    String marca = result[0];
                    String modelo = result[1];

                    rs = stm.executeQuery("SELECT ID_Impressora FROM IMPRESSORA "
                            + "WHERE IMPRESSORA.MARCA = '" + marca + "' AND IMPRESSORA.Modelo = '" + modelo + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }
                }

                default -> {
                    System.out.println("comboID Erro");
                    return -1;
                }
            }

            return id;

        } catch (SQLException exp) {
            return 0;
        }
    }

    public String comboString(String x, JComboBox c) throws SQLException {
        ResultSet rs;

        switch (x) {
            case "centro_custo" -> {
                rs = stm.executeQuery("SELECT Localizacao FROM CENTRO_CUSTO a, Utilizacao b WHERE a.ID_CENTRO_CUSTO = b.ID_CENTRO_CUSTO AND b.ID_IC = " + comboId("impressora", c) + "");
                while (rs.next()) {
                    return rs.getString("Localizacao");
                }

            }
            case "impressora" -> {
                rs = stm.executeQuery("SELECT (Marca || ' ' || Modelo) AS IMPRESSORA FROM Impressora a, IC b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.ID_IC = " + comboId("impressora", c) + "");
                while (rs.next()) {
                    return rs.getString("IMPRESSORA");
                }
            }
        }
        return null;
    }

    public Component tableStockColourRenderer(Component c, int row, int column, JTable table) {
        if (column == 3) {
            int stock = Integer.parseInt(table.getModel().getValueAt(row, column - 1).toString());
            int sig = Integer.parseInt(table.getModel().getValueAt(row, column).toString());

            if (stock != sig) {
                c.setBackground(Color.RED);
                c.setForeground(table.getForeground());
            }

        } else {
            c.setBackground(table.getBackground());
            c.setForeground(table.getForeground());
        }
        return c;
    }

    public Component tableSigColourRenderer(Component c, int row, int column, JTable table) {

        if (column == 7) {
            int progresso = Integer.parseInt(table.getModel().getValueAt(row, column).toString());

            if (progresso == 0) {
                c.setBackground(Color.RED);
                c.setForeground(table.getForeground());
            } else {
                c.setBackground(Color.YELLOW);
                c.setForeground(table.getForeground());
            }
        } else {
            c.setBackground(table.getBackground());
            c.setForeground(table.getForeground());
        }
        return c;
    }

    public void abaterSig(int valor, int id) throws SQLException {
        ResultSet rs = stm.executeQuery("SELECT SIG FROM CONSUMIVEL WHERE ID_CONSUMIVEL = " + id + "");
        int valorSig = 0;

        while (rs.next()) {
            valorSig = rs.getInt("SIG");
        }

        int valorTotal = valorSig - valor;

        stm.executeUpdate("UPDATE CONSUMIVEL SET SIG = " + valorTotal + " WHERE ID_CONSUMIVEL = " + id + "");
    }

    public void apagar(String tabela, int id) throws SQLException {
        stm.execute("DELETE FROM " + tabela.toUpperCase() + " WHERE ID_" + tabela.toUpperCase() + " = " + id + "");

    }

    public int getIdConsumivel(String consumivel) throws SQLException {
        if (consumivel.isBlank()) {
            return 0;
        }

        String toUpperCase = consumivel.toUpperCase();
        String[] result = toUpperCase.split("_");
        String marca = result[0];
        String modelo = result[1];
        String cons = result[2];

        int id = 0;

        ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL FROM CONSUMIVEL a, IMPRESSORA b WHERE NOME = '" + cons + "' AND MARCA = '" + marca + "' AND MODELO = '" + modelo + "'");
        while (rs.next()) {
            id = rs.getInt(1);
        }

        return id;
    }

}
