/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author subha
 */
public class Ordernow {
    public static boolean Checkorder(String[] data){
         Connection con = null;
         PreparedStatement pst= null;
         ResultSet rs = null;
         boolean flag = true;
         try{
             con = ConnectionProvider.getCon();
             pst = con.prepareStatement("INSERT INTO ORDERLIST VALUES(?,?,?,?)"); 
             pst.setString(1, data[0]);           
             pst.setString(2, data[1]);
             pst.setString(3, data[2]);
             pst.setString(4, data[3]);
             
             rs = pst.executeQuery();
             
             
             flag = true;
             return flag;
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Your order is not confirmed..");
         }
        return false;
    }
}
