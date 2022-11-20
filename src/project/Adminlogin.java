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
import javax.swing.JOptionPane;

/**
 *
 * @author subha
 */
public class Adminlogin {
    public static boolean checkadmin(String query,String[] data){
         Connection con = null;
         PreparedStatement pst= null;
         ResultSet rs = null;
         boolean flag = true;
         try
        {
            con = ConnectionProvider.getCon();
            pst = con.prepareStatement(query);            
            
//            System.out.println(data[0]);      
//            System.out.println(data[1]);

            pst.setString(1, data[0]);           
            pst.setString(2, data[1]);
            rs = pst.executeQuery();
            System.out.println(rs);
//            System.out.print(rs.next());
            rs.next();
            String email = rs.getString("email");

//            System.out.println(role);
            if(email.equals("soumadri@gmail.com")){
                flag = true;
                return flag;
            }else{
                flag = false;
                return flag;
            }
//            if
        }
        catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Email and Password are invalid");
            flag = false;
        }
        return flag;
    }
}
