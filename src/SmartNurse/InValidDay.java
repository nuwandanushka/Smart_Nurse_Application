/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SmartNurse;
import java.util.HashMap;
import java.util.Date;
/**
 *
 * @author nuwan_rates
 */
public class InValidDay {
   private int inValidDayId;
   private Date inValidDay;

    /**
     * @return the validDayId
     */
    public int getValidDayId() {
        return inValidDayId;
    }

    /**
     * @param validDayId the validDayId to set
     */
    public void setValidDayId(int validDayId) {
        this.inValidDayId = validDayId;
    }

    /**
     * @return the inValidDay
     */
    public Date getInValidDay() {
        return inValidDay;
    }

    /**
     * @param inValidDay the inValidDay to set
     */
    public void setInValidDay(Date inValidDay) {
        this.inValidDay = inValidDay;
    }

    
 }
