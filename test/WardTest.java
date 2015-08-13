/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import SmartNurse.UserPrivilege.AdminUser;
import SmartNurse.Ward;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nuwan_rates
 */
public class WardTest {
    @Test
    public void wardAdd() {
        Ward ward=new Ward(3,"ICU");
        AdminUser admin=new AdminUser();
        admin.addWard(ward);
        
        
    }
    @Test
    public void wardUpdate() {
       Ward ward=new Ward(1,"ECG");
        AdminUser admin=new AdminUser();
        admin.UpdateWard(ward); 
    }
    
    @Test
    public void wardDelete() {
       
        AdminUser admin=new AdminUser();
        admin.DeleteWard(1); 
    }
    
}
