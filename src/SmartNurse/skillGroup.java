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
public class skillGroup {
    private int skillGroupId;
    private int sequenceNo;
    private String skillType;
    private int numberOfEmployee;
    
    //joined Fields
    private Skill skill;

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
     * @return the sequenceNo
     */
    public int getSequenceNo() {
        return sequenceNo;
    }

    /**
     * @param sequenceNo the sequenceNo to set
     */
    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    /**
     * @return the skillType
     */
    public String getSkillType() {
        return skillType;
    }

    /**
     * @param skillType the skillType to set
     */
    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    /**
     * @return the numberOfEmployee
     */
    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    /**
     * @param numberOfEmployee the numberOfEmployee to set
     */
    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    /**
     * @return the skill
     */
    public Skill getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
