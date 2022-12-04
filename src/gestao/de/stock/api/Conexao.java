/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.de.stock.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTextArea;

/**
 *Classe Conexão:
 *  Contém as funções necessárias para fazer as devidas conexões.
 */
public class Conexao {
    
    //variaveis
    private String orcUrl;
     private String driver;
     private String user;
     private String pass ;
     
     Connection conn;

    public Conexao() {
        orcUrl = "jdbc:oracle:thin:@//localhost:1521/teste";
        driver = "oracle.jdbc.OracleDriver";
        user = "dbadmin";
        pass = "admin";
    }
    
     
    
    //função de criação de conexao

    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * retorna a conexao
     */
    public Connection fazerConexao() throws SQLException, ClassNotFoundException
    {
        
        try{
            conn = DriverManager.getConnection(this.orcUrl, this.user, this.pass);
            return conn; 
        }catch( SQLException x){
            return null;
        }
    }
    
    /**
     *
     * @param orcUrl
     * @param user
     * @param pass
     * @param a
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * retorna a conexão com os parametros inseridos
     */
    public Connection fazerConexao(String orcUrl, String user, String pass, JTextArea a) throws SQLException, ClassNotFoundException
    {
        
        try{
            conn = DriverManager.getConnection(orcUrl, user, pass);
            a.setText("Conexão efetuada com sucesso!");
            return conn; 
        }catch( SQLException x){
            a.setText(x.toString());
            return null;
        }
    }

    public String getOrcUrl() {
        return orcUrl;
    }

    public void setOrcUrl(String orcUrl) {
        this.orcUrl = orcUrl;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
     
    
}
