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
    private int employeeId;
    private String empName;
    private String address;
    private String nic;
    private Date DOB;
    private Skills skill;
    private validDay validDay;
    private validShift validShift;

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
    public Skills getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    /**
     * @return the validDay
     */
    public validDay getValidDay() {
        return validDay;
    }

    /**
     * @param validDay the validDay to set
     */
    public void setValidDay(validDay validDay) {
        this.validDay = validDay;
    }

    /**
     * @return the validShift
     */
    public validShift getValidShift() {
        return validShift;
    }

    /**
     * @param validShift the validShift to set
     */
    public void setValidShift(validShift validShift) {
        this.validShift = validShift;
    }
             
}