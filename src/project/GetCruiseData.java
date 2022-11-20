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
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author subha
 */
public class GetCruiseData {
    public static ResultSet GetAllData(){
         Connection con = null;
         PreparedStatement pst= null;
         ResultSet rs = null;
         boolean flag = true;
         Statement st;
         ArrayList<String> cruisetypesA = new ArrayList<String>();
         ArrayList<String> cruisetypesB = new ArrayList<String>();
         ArrayList<String> cruisetypesC = new ArrayList<String>();


         System.out.println("Hellow");
         
         try{
             con = ConnectionProvider.getCon();
             String query = "SELECT * FROM CRUISETYPE";
             st = con.createStatement();
             rs = st.executeQuery(query);
             
//             Statement stpst = con.createStatement(query);
//             System.out.println(rs.next);
             return rs;
         }catch(SQLException e){
             System.out.println(e);
             e.printStackTrace();
         }
        return null;
         
        
    }
}
