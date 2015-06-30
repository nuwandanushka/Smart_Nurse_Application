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
public class Skills {
    private int skillId;
    private String skillType;
    
    
    public Skills(int id, String sType){
        this.skillId=id;
        this.skillType=sType;
    }

    /**
     * @return the skillId
     */
    public int getSkillId() {
        return skillId;
    }

    /**
     * @return the skillType
     */
    public String getSkillType() {
        return skillType;
    }
}
