/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;

import Database_Layer.Database_Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
/**
 *
 * @author nuwan_rates
 */
public class User {
    private int userId;
    private String Name;
    private String userName;
    private String password;
    private String Status;

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }
   public void validation(JTextField username, JPasswordField password){
    
       String sql="{call GetUser('"+username.getText()+"' , '"+password.getText()+"' )}";
       Database_Connection db=Database_Connection.GetInstance();
       ResultSet re=db.getData(sql);
       
       try 
      {
          if (re.next())
          {
              JOptionPane.showMessageDialog(null, "Thank you" );
              MDIForm admin=new MDIForm();
              new MDIForm().setVisible(true);
              setName(re.getString("FNAME"));
              String authority=re.getString("AUTHORITY");
              
              if(authority.contains("ADMIN")){
                  admin.jTabbedPane1.setEnabledAt(0, false);
                  MDIForm.ulable.setText(getName()+", Smart Nurse");
              }
              
          }
          else 
          {
              JOptionPane.showMessageDialog(null, "Invalid User");
          }  
      } 
      catch (SQLException ex) 
      {
          Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
    
       
       
   }
    
}
