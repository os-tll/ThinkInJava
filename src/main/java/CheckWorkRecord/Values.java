/**
  * Copyright 2019 bejson.com 
  */
package CheckWorkRecord;
import lombok.Data;

import java.util.Date;

/**
 * Auto-generated: 2019-11-05 10:11:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Values {

    private String value;
    private String display_value;
    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

}