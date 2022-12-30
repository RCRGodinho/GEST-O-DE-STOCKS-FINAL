/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.de.stock.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAT
 */
public class Propriedade {

    public static Properties prop = new Properties();
    private String file = "config.server";

    public void criarPropriedade(String title, String value) {

        try {
            prop.setProperty(title, value);
            prop.store(new FileOutputStream(getFile()), null);

        } catch (IOException ex) {
            Logger.getLogger(Propriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarPropriedade(String title, String value) {
        try {
            prop.replace(title, value);
            prop.store(new FileOutputStream(getFile()), null);
        } catch (IOException ex) {
            Logger.getLogger(Propriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String carregarPropriedade(String title) {
        String value;
        try {
            prop.load(new FileInputStream(getFile()));
            value = prop.getProperty(title);
        } catch (IOException ex) {
            return null;
        }
        return value;
    }

    public boolean verificarFicheiro() throws IOException {

        try ( FileInputStream f = new FileInputStream(new File(getFile()))) {
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        }
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

}
