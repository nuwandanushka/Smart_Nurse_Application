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
public class Shift {
    
    private int shiftId;
    private String shiftName;
    private float startTime;
    private float endTime;
    
    public Shift(int id, String shiftName, float sTime, float eTime){
        
        this.shiftId=id;
        this.shiftName=shiftName;
        this.startTime=sTime;
        this.endTime=eTime;
    }

    /**
     * @return the shiftId
     */
    public int getShiftId() {
        return shiftId;
    }

    /**
     * @return the shiftName
     */
    public String getShiftName() {
        return shiftName;
    }

    /**
     * @return the startTime
     */
    public float getStartTime() {
        return startTime;
    }

    /**
     * @return the endTime
     */
    public float getEndTime() {
        return endTime;
    }
    
}
