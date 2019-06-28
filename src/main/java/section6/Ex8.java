package section6;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/27 11:30
 */
public class Ex8 {
    public static void main(String[] args) {
        int loop = 5;
        while(loop-- > 0){
            Connection connection = ConnectionManager.getConnection();
            System.out.println(connection);
        }
    }
}
class ConnectionManager{
    private static Connection[] connections = {new Connection(1), new Connection(2), new Connection(3), new Connection(4)};
    private static int i = 0;
    public static Connection getConnection(){
        if(i < 4){
            return connections[i++];
        }else {
            return null;
        }
    }

}
class Connection{
    int i ;
    Connection(int i ){
        this.i = i;
    }
    @Override
    public String toString(){
        return ""+i;
    }

}
