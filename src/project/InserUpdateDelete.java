
package project;

import java.sql.*;
import javax.swing.JOptionPane;
public class InserUpdateDelete {
    public static void setData(String Query, String msg,String data[])
    {
        Connection con = null;
        Statement st= null;
        try
        {
            con = ConnectionProvider.getCon();
            System.out.println(data[0]);
            PreparedStatement ps = con.prepareStatement(Query);
            int index = 0;
            for(int i=0;i <= data.length-1;i++){
                index = index + 1;
                ps.setString(index,data[i]);
            }

            ps.executeUpdate();
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
