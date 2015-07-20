/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLayer;

/**
 *
 * @author nuwan_rates
 */
public class Ward {
    private int wardId;
    private String wardName;

    public Ward(int Id, String wName){
        this.wardId=Id;
        this.wardName=wName;
    }
    /**
     * @return the wardId
     */
    public int getWardId() {
        return wardId;
    }

    /**
     * @return the wardName
     */
    public String getWardName() {
        return wardName;
    }
}
