/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import SmartNurse.User;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nuwan_rates
 */
public class LoginTest {
    
    @Test
    public void Test(){
        JTextField username=new JTextField();
        username.setText("Nuwan");
        JPasswordField password=new JPasswordField();
        password.setText("123");
        User user=new User();
        user.validation(username, password);
        String name=user.getName();
        assertEquals(name, "Nuwan Danushka");
    }
}
