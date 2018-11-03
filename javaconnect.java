/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
Connection conn = null;
public static Connection ConnecrDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\HP\\Documents\\NetBeansProjects\\Project123\\project123.sqlite");
        JOptionPane.showMessageDialog(null,"Connection establish");
        return null;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
}
