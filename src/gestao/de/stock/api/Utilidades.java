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
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
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
    Statement insert;

    public Utilidades(Conexao c) throws SQLException, ClassNotFoundException {
        this.c = c;
        stm = c.fazerConexao().createStatement();
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

    public int importarExcel(String tabela) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {

        //Localização para guardar ficheiro
        JFileChooser excelFileChooser = new JFileChooser();

        excelFileChooser.setDialogTitle("Selecionar Ficheiro: " + tabela);
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

            //Inicializar variavies de modo a fazer comunicação com a bd
            String q = "";
            ArrayList<Object> values = new ArrayList<>();
            ArrayList<Object> queries = new ArrayList<>();
            //verificar qual a tabela escolhida    
            switch (tabela) {
                case "consumivel" -> {
                    //Buscar dados que vão ser inseridos
                    for (int y = 1; y <= excelSheet.getLastRowNum(); y++) {

                        q = "INSERT /*+ ignore_row_on_dupkey_index ( CONSUMIVEL (NNA)) */ INTO CONSUMIVEL (NNA, NOME, PRECO, REFERENCIA, ID_IMPRESSORA) "
                                + "VALUES ";
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 5; z++) {
                            XSSFCell cell = excelRow.getCell(z);
                            if (cell != null) {
                                switch (z) {
                                    case 2,3 -> {
                                        values.add(cell.getRawValue());
                                    }
                                    case 4 -> {
                                        String impressora = cell.toString();
                                        int id = getIdImpressora(impressora);
                                        values.add(id);
                                    }
                                    default -> {
                                        values.add("'" + cell + "'");
                                    }
                                }
                            } else {
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    values.add(0);
                                } else {
                                    values.add("'INDEFINIDO'");
                                }
                            }
                        }

                        //Substituir [] por () nos values
                        String valoresFinais = Arrays.toString(values.toArray()).replace("[", "(").replace("]", ")");
                        //Adicionar dados à query
                        q += valoresFinais;
                        System.out.println(q);
                        insert.addBatch(q);
                        queries.add(q);
                        values.clear();
                    }
                }

                case "ic" -> {
                    //Buscar dados que vão ser inseridos
                    for (int y = 1; y <= excelSheet.getLastRowNum(); y++) {

                        q = "INSERT /*+ ignore_row_on_dupkey_index ( IC (IC)) */ INTO IC (IC, PRETO, COR, ID_IMPRESSORA) "
                                + "VALUES ";
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 5; z++) {
                            XSSFCell cell = excelRow.getCell(z);

                            //Quando chegar à impressora, transformar no id
                            if (z == 3) {
                                String impressora = cell.toString();
                                int id = getIdImpressora(impressora);
                                values.add(Integer.toString(id));
                            } else {
                                if (cell.getCellType() == CellType.STRING) {
                                    values.add("'" + cell.toString() + "'");
                                } else {
                                    values.add(cell.toString());
                                }
                            }
                        }

                        //Substituir [] por () nos values
                        String valoresFinais = Arrays.toString(values.toArray()).replace("[", "(").replace("]", ")");
                        //Adicionar dados à query
                        q += valoresFinais;
                        System.out.println(q);
                        insert.addBatch(q);
                        values.clear();
                    }
                }

                case "impressora" -> {
                    //Buscar dados que vão ser inseridos
                    for (int y = 1; y <= excelSheet.getLastRowNum(); y++) {

                        q = "INSERT /*+ ignore_row_on_dupkey_index ( IMPRESSORA (MODELO)) */ INTO IMPRESSORA (MARCA, MODELO) "
                                + "VALUES ";
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 2; z++) {
                            XSSFCell cell = excelRow.getCell(z);

                            values.add("'" + cell.toString() + "'");
                        }
                        //Substituir [] por () nos values
                        String valoresFinais = Arrays.toString(values.toArray()).replace("[", "(").replace("]", ")");

                        //Adicionar dados à query
                        q += valoresFinais;
                        System.out.println(q);
                        insert.addBatch(q);

                        queries.add(q);
                        values.clear();
                    }
                }
                case "centro_custo" -> {
                    //Buscar dados que vão ser inseridos
                    for (int y = 1; y <= excelSheet.getLastRowNum(); y++) {

                        q = "INSERT /*+ ignore_row_on_dupkey_index ( CENTRO_CUSTO (CUSTO)) */ INTO CENTRO_CUSTO (RESPONSAVEL, TEXTO, LOCALIZACAO, CUSTO) "
                                + "VALUES ";
                        XSSFRow excelRow = excelSheet.getRow(y);

                        for (int z = 0; z < 4; z++) {
                            XSSFCell cell = excelRow.getCell(z);

                            if (cell != null) {
                                if (cell.getCellType() == CellType.STRING) {
                                    values.add("'" + cell.toString() + "'");
                                } else {
                                    values.add(cell.getRawValue());
                                }
                            } else {
                                values.add("'INDEFINIDO'");
                            }
                        }
                        //Substituir [] por () nos values
                        String valoresFinais = Arrays.toString(values.toArray()).replace("[", "(").replace("]", ")");

                        //Adicionar dados à query
                        q += valoresFinais;
                        System.out.println(q);
                        insert.addBatch(q);

                        queries.add(q);
                        values.clear();
                    }

                }
            }

            Component opcao = null;

            int op = JOptionPane.showConfirmDialog(opcao, "A importar: " + queries.size() + " dados.\nContinuar?",
                    "Importar " + tabela.toUpperCase(), JOptionPane.NO_OPTION);

            if (op == 0) {

                long[] res = insert.executeLargeBatch();
                if (res.length != 0) {
                    queries.clear();
                    insert.clearBatch();
                    return res.length;
                } else {
                    queries.clear();
                    insert.clearBatch();
                    return 0;
                }

            }

        }

        return -1;
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
            //Listar Consumiveis
            case "consumivel" -> {

                rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO || '_'|| NOME) AS NOME FROM CONSUMIVEL a, IMPRESSORA b "
                        + "WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA ORDER BY NOME");

                while (rs.next()) {
                    list.add(rs.getString("NOME"));
                }
            }
            //Listar Impressosras
            case "impressora" -> {
                rs = stm.executeQuery("SELECT (MARCA || '_' || MODELO) AS IMPRESSORA FROM IMPRESSORA ORDER BY IMPRESSORA");

                while (rs.next()) {
                    list.add(rs.getString("IMPRESSORA"));
                }
            }
            //Listar Centros custo
            case "centro_custo" -> {

                rs = stm.executeQuery("SELECT CUSTO FROM CENTRO_CUSTO ORDER BY CUSTO");

                while (rs.next()) {
                    list.add(rs.getString("CUSTO"));
                }
            }
            //Listar localizaçoes dos centros custo
            case "localizacao" -> {

                rs = stm.executeQuery("SELECT LOCALIZACAO FROM CENTRO_CUSTO ORDER BY LOCALIZACAO");

                while (rs.next()) {
                    list.add(rs.getString("LOCALIZACAO"));
                }
            }
            //Listar Ics
            case "ic" -> {

                rs = stm.executeQuery("SELECT IC FROM IC ORDER BY IC");

                while (rs.next()) {
                    list.add(rs.getString("IC"));
                }
            }
            //Listar tabelas
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
                //Buscar id consumivel a partir do nome, marca e modelo 
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
                //Buscar id Centro Custo a partir da LOCALIZACAO
                case "localizacao" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE LOCALIZACAO = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                //Buscar id Centro Custo a partir do CUSTO
                case "centro_custo" -> {
                    rs = stm.executeQuery("SELECT ID_CENTRO_CUSTO FROM CENTRO_CUSTO WHERE CUSTO = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                //Buscar id IC a partir do IC
                case "ic" -> {
                    rs = stm.executeQuery("SELECT ID_IC FROM IC WHERE IC = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                //Buscar id impressora a partir do IC
                case "impressora" -> {
                    rs = stm.executeQuery("SELECT a.ID_Impressora FROM IMPRESSORA a, IC b  "
                            + "WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.IC = '" + c.getSelectedItem() + "'");
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }

                }
                //Buscar id impressora a partir da Marca e Modelo
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
            //Buscar Localização a partir do id do IC
            case "centro_custo" -> {
                rs = stm.executeQuery("SELECT Localizacao FROM CENTRO_CUSTO a, Utilizacao b WHERE a.ID_CENTRO_CUSTO = b.ID_CENTRO_CUSTO AND b.ID_IC = " + comboId("impressora", c) + "");
                while (rs.next()) {
                    return rs.getString("Localizacao");
                }

            }
            //Buscar Marca e Modelo a partir do id do IC
            case "impressora" -> {
                rs = stm.executeQuery("SELECT (Marca || ' ' || Modelo) AS IMPRESSORA FROM Impressora a, IC b WHERE a.ID_IMPRESSORA = b.ID_IMPRESSORA AND b.ID_IC = " + comboId("impressora", c) + "");
                while (rs.next()) {
                    return rs.getString("IMPRESSORA");
                }
            }
        }
        return null;
    }

    //Definir a cor das celulas das tabelas
    public Component tableColourRenderer(String tabela, Component c, int row, int column, JTable table) {

        switch (tabela) {
            case "stock" -> {
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
            }
            case "sig" -> {
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
            }
        }
        return c;
    }

    public boolean abaterSig(int valor, int id) throws SQLException {
        ResultSet rs = stm.executeQuery("SELECT SIG FROM CONSUMIVEL WHERE ID_CONSUMIVEL = " + id + "");
        int valorSig = 0;

        while (rs.next()) {
            valorSig = rs.getInt("SIG");
        }
        
        if(valor > valorSig){
            return false;
        }
        int valorTotal = valorSig - valor;

        stm.executeUpdate("UPDATE CONSUMIVEL SET SIG = " + valorTotal + " WHERE ID_CONSUMIVEL = " + id + "");
        return true;
    }

    public void apagar(String tabela, int id) throws SQLException {
        stm.execute("DELETE FROM " + tabela.toUpperCase() + " WHERE ID_" + tabela.toUpperCase() + " = " + id + "");
    }

    public void apagarTodosDados(String tabela) throws SQLException {
        stm.execute("DELETE FROM " + tabela.toUpperCase());
    }

    public int getIdConsumivel(String consumivel) throws SQLException {
        if (consumivel.isBlank() || consumivel.contains("-")) {
            return 0;
        }

        String toUpperCase = consumivel.toUpperCase();
        String[] result = toUpperCase.split("_");
        String marca = result[0];
        String modelo = result[1];
        String nome = result[2];

        int id = 0;

        ResultSet rs = stm.executeQuery("SELECT ID_CONSUMIVEL FROM CONSUMIVEL a, IMPRESSORA b WHERE NOME = '" + nome + "' AND MARCA = '" + marca + "' AND MODELO = '" + modelo + "' "
                + "AND a.ID_IMPRESSORA = b.ID_IMPRESSORA");
        while (rs.next()) {
            id = rs.getInt(1);
        }
        System.out.println(marca+modelo+nome);
        System.out.println(id);

        return id;
    }

    public int getIdImpressora(String impressora) throws SQLException {
        if (impressora.isBlank()) {
            return 0;
        }

        String toUpperCase = impressora.toUpperCase();
        String[] result = toUpperCase.split("_");
        String marca = result[0];
        String modelo = result[1];

        int id = 0;

        ResultSet rs = stm.executeQuery("SELECT ID_IMPRESSORA FROM IMPRESSORA "
                + "WHERE MARCA = '" + marca + "' AND MODELO = '" + modelo + "'");
        while (rs.next()) {
            id = rs.getInt(1);
        }

        return id;
    }

}
