/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;

/**
 *
 * @author nuwan_rates
 */
public class StaffSkillLevels implements HardConstraint {
    private int skillLevelId;
    private String Day;
    private String shift;
    private int skillGroupId;
    
    private skillGroup sGroup;

    /**
     * @return the skillLevelId
     */
    public int getSkillLevelId() {
        return skillLevelId;
    }

    /**
     * @param skillLevelId the skillLevelId to set
     */
    public void setSkillLevelId(int skillLevelId) {
        this.skillLevelId = skillLevelId;
    }

    /**
     * @return the Day
     */
    public String getDay() {
        return Day;
    }

    /**
     * @param Day the Day to set
     */
    public void setDay(String Day) {
        this.Day = Day;
    }

    /**
     * @return the shift
     */
    public String getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(String shift) {
        this.shift = shift;
    }

    /**
     * @return the skillGroupId
     */
    public int getSkillGroupId() {
        return skillGroupId;
    }

    /**
     * @param skillGroupId the skillGroupId to set
     */
    public void setSkillGroupId(int skillGroupId) {
        this.skillGroupId = skillGroupId;
    }

    /**
     * @return the sGroup
     */
    public skillGroup getsGroup() {
        return sGroup;
    }

    /**
     * @param sGroup the sGroup to set
     */
    public void setsGroup(skillGroup sGroup) {
        this.sGroup = sGroup;
    }
}   
