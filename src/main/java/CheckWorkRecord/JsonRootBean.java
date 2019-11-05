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
public class JsonRootBean {

    private int filtered;
    private int total;
    private List<Items> items;
    public void setFiltered(int filtered) {
         this.filtered = filtered;
     }
     public int getFiltered() {
         return filtered;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

}