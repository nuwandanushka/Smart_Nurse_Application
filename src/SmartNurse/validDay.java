/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;
import java.util.HashMap;
/**
 *
 * @author nuwan_rates
 */
public class validDay {
   private int validDayId;
   
   private HashMap <String,validShift> validDay=new HashMap<String,validShift>();

    /**
     * @return the validDayId
     */
    public int getValidDayId() {
        return validDayId;
    }

    /**
     * @param validDayId the validDayId to set
     */
    public void setValidDayId(int validDayId) {
        this.validDayId = validDayId;
    }

    /**
     * @return the validDay
     */
    public HashMap <String,validShift> getValidDay() {
        return validDay;
    }

    /**
     * @param validDay the validDay to set
     */
    public void setValidDay(HashMap <String,validShift> validDay) {
        this.validDay = validDay;
    }
   
 }
