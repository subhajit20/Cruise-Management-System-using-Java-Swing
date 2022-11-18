/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/**
 *
 * @author subha
 */
public class Resetpassword {
    public static void ForgetPassword(String[] data,String[] query) {
         Connection con = null;
         PreparedStatement pst1 = null;
         PreparedStatement pst2 = null;

         ResultSet rs1 = null;
         ResultSet rs2 = null;

         boolean flag = true;
         try{
            con = ConnectionProvider.getCon();
            pst1 = con.prepareStatement(query[0]);
            
            pst1.setString(1, data[0]);
            
            rs1 = pst1.executeQuery();
            
            rs1.next();
            
            if(rs1.getString("email") != null){
                String useremail = rs1.getString("email");
                if(data[1].equals(data[2])){
                    pst2 = con.prepareStatement(query[1]);
                    pst2.setString(1, data[1]);
                    pst2.setString(2, useremail);
                    
                    rs2 = pst2.executeQuery();
                    JOptionPane.showMessageDialog(null, "Your Password has been changed successfully...");
                }else{
                    JOptionPane.showMessageDialog(null, "Password and Confirm passowrd are not matched...");
                }
                
            }else{
                System.out.println("No email exist...");
            }
         }catch(SQLException e){
             System.out.println("Email is not Found...");
         }
    }
}
