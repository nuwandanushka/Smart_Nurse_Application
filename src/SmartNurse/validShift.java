/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;
import java.util.ArrayList;
/**
 *
 * @author nuwan_rates
 */
public class validShift {
  private int validShiftId;
  private ArrayList<Shift> validShift=new ArrayList<Shift>();

    /**
     * @return the validShiftId
     */
    public int getValidShiftId() {
        return validShiftId;
    }

    /**
     * @param validShiftId the validShiftId to set
     */
    public void setValidShiftId(int validShiftId) {
        this.validShiftId = validShiftId;
    }

    /**
     * @return the validShift
     */
    public ArrayList<Shift> getValidShift() {
        return validShift;
    }

    /**
     * @param validShift the validShift to set
     */
    public void setValidShift(ArrayList<Shift> validShift) {
        this.validShift = validShift;
    }
  
  
      
  
  
}
