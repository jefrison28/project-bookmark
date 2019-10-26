/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.ukdw.cmark;
import java.sql.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class sql_connect {
    Connection cin = null;
    
    public static Connection ConncrDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:E:\\rpl\\SQLiteDatabaseBrowserPortable\\Data\\login.db");
        return con;
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}
