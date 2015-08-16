/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse.UserPrivilege;

import Database_Layer.Database_Connection;
import SmartNurse.Employee;
import SmartNurse.Ward;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
/**
 *
 * @author nuwan_rates
 */
public class AdminUser {
    
    public void addWard(Ward ward){
        
       String sql="{call Wards_Adding('"+ward.getWardId()+"' , '"+ward.getWardName()+"' )}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       try {
           
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
    
    public void DeleteWard(String id){
        
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
    
    public void addNurse(Employee nurse){
       SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       String sql="{call NurseAdding('"+nurse.getEmployeeId()
               +"' , '"+nurse.getEmpName()
               +"' , '"+nurse.getNic()
               +"' , '"+nurse.getAddress()
               +"' , '"+nurse.getSkillType()
               +"' , '"+df.format(nurse.getDOB())
               +"' , '"+nurse.getHourseOfWorkInMonth()
               +"' , '"+nurse.getWardName()
               +"' , '"+nurse.getGender()
               +"')}";
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
    public void updateNurse(Employee nurse){
       SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
       String sql="{call UpdatingNurse('"+nurse.getEmployeeId()
               +"' , '"+nurse.getEmpName()
               +"' , '"+nurse.getNic()
               +"' , '"+nurse.getAddress()
               +"' , '"+nurse.getSkillType()
               +"' , '"+df.format(nurse.getDOB())
               +"' , '"+nurse.getHourseOfWorkInMonth()
               +"' , '"+nurse.getWardName()
               +"' , '"+nurse.getGender()
               +"')}";
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
    
    public Employee searchNurse(int nurseId){
       SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       String sql="{call NurseSearch('"+nurseId+"')}";
       Database_Connection dbConnection=Database_Connection.GetInstance();
       ResultSet result= dbConnection.getData(sql);
       try {
           if(!result.wasNull()){
             Employee nurse=new Employee();
             nurse.setEmpName(result.getString("NURSE_NAME"));
             nurse.setNic(result.getString("NIC"));
             nurse.setAddress(result.getString("ADDRESS"));
             nurse.setSkillType(result.getString("SKILL_TYPE"));
             nurse.setDOB(df.parse("DOB"));
             nurse.setHourseOfWorkInMonth(Integer.parseInt(result.getString("HOURS_OF_WORKED")));
             nurse.setWardName(result.getString("WARD_NAME"));
             nurse.setGender(result.getString("GENDER"));
           
             return nurse;  
           }
            
 
       } 
       catch (Exception ex) {
           Logger.getLogger(AdminUser.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           try {
               Database_Connection.closeConnection();
           } catch (SQLException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        return null;
    }
    
}
