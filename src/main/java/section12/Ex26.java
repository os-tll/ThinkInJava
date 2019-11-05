package section12;

import java.io.FileInputStream;

/**
 * 书中没有找到
 *  原题为：
 *  Change the file name string in MainException.java to
 *  name a file that doesn't exist.
 *  Run the program and  * note the result
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 17:08
 */
public class Ex26 {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("aaa.txt");
    }
}
