/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author subha
 */
public class select {
    public static boolean getdata(String query,String[] data){
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
            String useremail = rs.getString("email");
            if(useremail != null){
                flag = true;
                return flag;
            }else{
                flag = false;
                return flag;
            }
//            if
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Email and Password are invalid");
            flag = false;
        }
        return flag;
    }
    
    public static String getdata(String Query, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
