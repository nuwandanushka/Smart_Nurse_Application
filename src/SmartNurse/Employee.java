/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;
import java.util.Date;
/**
 *
 * @author nuwan_rates
 */
public class Employee {
    
    // /////Persistent fields///////
    private int employeeId;
    private String empName;
    private String address;
    private String nic;
    private Date DOB;
    private String skill;
    
    // Joined Fields /////
    private InValidDay inValidDay;
    private InValidShift inValidShift;

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the DOB
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * @return the ValidDay
     */
    public InValidDay getValidDay() {
        return inValidDay;
    }

    /**
     * @param validDay the ValidDay to set
     */
    public void setValidDay(InValidDay inValidDay) {
        this.inValidDay = inValidDay;
    }

    /**
     * @return the validShift
     */
    public InValidShift getValidShift() {
        return inValidShift;
    }

    /**
     * @param validShift the validShift to set
     */
    public void setValidShift(InValidShift validShift) {
        this.inValidShift = validShift;
    }
             
}
