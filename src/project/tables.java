
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
         Connection con = null;
         Statement st = null;
         try{
             con = ConnectionProvider.getCon();
             st = con.createStatement();
             st.executeUpdate("create table USER2(name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), address varchar(200))");
            
             JOptionPane.showMessageDialog(null, "table created successfully");
             //System.out.println("done");
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
         finally{
             try{
                 con.close();
                 st.close();
             }
             catch(Exception e){
                 
             }
         }
    }
    
}
