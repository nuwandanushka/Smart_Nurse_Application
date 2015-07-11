/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author nuwan_rates
 */
public class Database_Connection {
    private static Connection dbCon;
    private static Database_Connection getConnectionInstance;  
    String drivers;
    String url;
    String username;
    String Password;
    private Database_Connection(){
    try
        {
            drivers  = "sun.jdbc.odbc.JdbcOdbcDriver";
            url      = "jdbc:odbc:Smart_Nurse";
            username = "NuwanSQL";
            Password = "Software";
            Class.forName(drivers);
            dbCon = DriverManager.getConnection(url,username,Password);            
        }
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Unable Find the Connection Class. " + ex.toString());
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQL Exception has been Occured. " + ex.toString());
        }       
    } 
    public static Database_Connection GetInstance() 
    {
        if (getConnectionInstance == null)
        {   
                getConnectionInstance = new Database_Connection();                         
        }        
            return getConnectionInstance;            
    }
    private Connection getConnection() throws Exception
    {
        Connection  connect = DriverManager.getConnection(url,username,Password);        
        return connect;        
    }
    public void InsertValues(String SQL) throws Exception
    {
        try
        {    
          Database_Connection con = Database_Connection.GetInstance();
          Connection sqlCon = con.getConnection();
          Statement st = sqlCon.createStatement();
          st.executeUpdate(SQL);
          sqlCon.close();
        }
        catch (Exception ex)
        {
          JOptionPane.showMessageDialog(null, "Insertion Faild. " + ex.toString(), SQL,1);                   
        }  
    }
          
    public ResultSet getData(String SQL)
    {
        ResultSet rs = null;
        try
        {
            Database_Connection con = Database_Connection.GetInstance();
            Connection sqlCon = con.getConnection();
            Statement st = sqlCon.createStatement();
            rs = st.executeQuery(SQL);
            return rs;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error occured when retrieving " + ex.toString(), SQL,1);  
        }
          return rs;
    }
   
}