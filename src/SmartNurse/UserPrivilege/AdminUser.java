/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse.UserPrivilege;

import Database_Layer.Database_Connection;
import SmartNurse.Ward;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author nuwan_rates
 */
public class AdminUser {
    
    public void addWard(Ward ward){
        
       String sql="{call Wards_Adding('"+ward.getWardId()+"' , '"+ward.getWardName()+"' )}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       try 
       {
           dbConnection.InsertValues(sql);
           JOptionPane.showMessageDialog(null, "Inserted");
       } 
       catch (Exception ex) 
       {
           Logger.getLogger(AdminUser.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           try {
               Database_Connection.closeConnection();
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
     public void UpdateWard(Ward ward){
        
       String sql="{call UpdatingWard('"+ward.getWardId()+"' , '"+ward.getWardName()+"' )}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       try 
       {
           dbConnection.InsertValues(sql);
           JOptionPane.showMessageDialog(null, "Updated");
       } 
       catch (Exception ex) 
       {
           Logger.getLogger(AdminUser.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           try {
               Database_Connection.closeConnection();
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
    public void SearchWard(Ward ward){
        
       String sql="{call UpdatingWard('"+ward.getWardId()+"' , '"+ward.getWardName()+"' )}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       try 
       {
           dbConnection.InsertValues(sql);
           JOptionPane.showMessageDialog(null, "Updated");
       } 
       catch (Exception ex) 
       {
           Logger.getLogger(AdminUser.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           try {
               Database_Connection.closeConnection();
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    } 
    
    public void DeleteWard(int id){
        
       String sql="{call Deleteward('"+id+"')}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       try 
       {
           dbConnection.InsertValues(sql);
           JOptionPane.showMessageDialog(null, "Deleted");
       } 
       catch (Exception ex) 
       {
           Logger.getLogger(AdminUser.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           try {
               Database_Connection.closeConnection();
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    } 
    
}
