/**
  * Copyright 2019 bejson.com 
  */
package CheckWorkRecord;
import java.util.Date;

/**
 * Auto-generated: 2019-11-05 11:14:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Holiday {

    private boolean holiday;
    private String name;
    private int wage;
    private Date date;
    public void setHoliday(boolean holiday) {
         this.holiday = holiday;
     }
     public boolean getHoliday() {
         return holiday;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setWage(int wage) {
         this.wage = wage;
     }
     public int getWage() {
         return wage;
     }

    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

}