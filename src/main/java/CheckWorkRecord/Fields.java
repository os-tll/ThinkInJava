/**
  * Copyright 2019 bejson.com 
  */
package CheckWorkRecord;
import java.util.List;

/**
 * Auto-generated: 2019-11-05 10:11:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Fields {

    private String alias;
    private long field_id;
    private String type;
    private List<Values> values;
    private boolean lock_value;
    private boolean mosaic_value;
    public void setAlias(String alias) {
         this.alias = alias;
     }
     public String getAlias() {
         return alias;
     }

    public void setField_id(long field_id) {
         this.field_id = field_id;
     }
     public long getField_id() {
         return field_id;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setValues(List<Values> values) {
         this.values = values;
     }
     public List<Values> getValues() {
         return values;
     }

    public void setLock_value(boolean lock_value) {
         this.lock_value = lock_value;
     }
     public boolean getLock_value() {
         return lock_value;
     }

    public void setMosaic_value(boolean mosaic_value) {
         this.mosaic_value = mosaic_value;
     }
     public boolean getMosaic_value() {
         return mosaic_value;
     }

}