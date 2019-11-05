/**
  * Copyright 2019 bejson.com 
  */
package CheckWorkRecord;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2019-11-05 10:11:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Items {

    private long item_id;
    private long table_id;
    private Date created_on;
    private Date updated_on;
    private Created_by created_by;
    private Updated_by updated_by;
    private String created_by_union_id;
    private String created_by_wechat_nickname;
    private Date title;
    private String summary;
    private List<String> rights;
    private List<Fields> fields;
    private boolean lock_all;
    private List<String> lock_field_ids;
    private Date last_activity_on;
    private Permission_field_ids permission_field_ids;
    private boolean is_recommend;
    public void setItem_id(long item_id) {
         this.item_id = item_id;
     }
     public long getItem_id() {
         return item_id;
     }

    public void setTable_id(long table_id) {
         this.table_id = table_id;
     }
     public long getTable_id() {
         return table_id;
     }

    public void setCreated_on(Date created_on) {
         this.created_on = created_on;
     }
     public Date getCreated_on() {
         return created_on;
     }

    public void setUpdated_on(Date updated_on) {
         this.updated_on = updated_on;
     }
     public Date getUpdated_on() {
         return updated_on;
     }

    public void setCreated_by(Created_by created_by) {
         this.created_by = created_by;
     }
     public Created_by getCreated_by() {
         return created_by;
     }

    public void setUpdated_by(Updated_by updated_by) {
         this.updated_by = updated_by;
     }
     public Updated_by getUpdated_by() {
         return updated_by;
     }

    public void setCreated_by_union_id(String created_by_union_id) {
         this.created_by_union_id = created_by_union_id;
     }
     public String getCreated_by_union_id() {
         return created_by_union_id;
     }

    public void setCreated_by_wechat_nickname(String created_by_wechat_nickname) {
         this.created_by_wechat_nickname = created_by_wechat_nickname;
     }
     public String getCreated_by_wechat_nickname() {
         return created_by_wechat_nickname;
     }

    public void setTitle(Date title) {
         this.title = title;
     }
     public Date getTitle() {
         return title;
     }

    public void setSummary(String summary) {
         this.summary = summary;
     }
     public String getSummary() {
         return summary;
     }

    public void setRights(List<String> rights) {
         this.rights = rights;
     }
     public List<String> getRights() {
         return rights;
     }

    public void setFields(List<Fields> fields) {
         this.fields = fields;
     }
     public List<Fields> getFields() {
         return fields;
     }

    public void setLock_all(boolean lock_all) {
         this.lock_all = lock_all;
     }
     public boolean getLock_all() {
         return lock_all;
     }

    public void setLock_field_ids(List<String> lock_field_ids) {
         this.lock_field_ids = lock_field_ids;
     }
     public List<String> getLock_field_ids() {
         return lock_field_ids;
     }

    public void setLast_activity_on(Date last_activity_on) {
         this.last_activity_on = last_activity_on;
     }
     public Date getLast_activity_on() {
         return last_activity_on;
     }

    public void setPermission_field_ids(Permission_field_ids permission_field_ids) {
         this.permission_field_ids = permission_field_ids;
     }
     public Permission_field_ids getPermission_field_ids() {
         return permission_field_ids;
     }

    public void setIs_recommend(boolean is_recommend) {
         this.is_recommend = is_recommend;
     }
     public boolean getIs_recommend() {
         return is_recommend;
     }

}