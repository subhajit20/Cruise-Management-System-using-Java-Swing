
package project;

import java.lang.*;
import static java.lang.Class.forName;
import java.sql.*;
public class ConnectionProvider {
    //public static void main(String[] args) throws ClassNotFoundException, SQLException {
    public static Connection getCon(){
        try{
                String url = "jdbc:oracle:thin:@localhost:1521:orcl";

                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("Driver loaded");

                //Connection con = DriverManager.getConnection(url, "TECHNO2", "a1234");
                //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TECHNO2", "MORNING");
                Connection con = DriverManager.getConnection(url, "system","a12345" );
                System.out.println(con);
                System.out.println("ok");
                //con.close();
                return con;
        }
        catch(Exception e){
            System.out.println("lol");
            
        }
        //return null;
        return null;
    }  
        
}
