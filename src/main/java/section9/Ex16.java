package section9;

import com.sun.javafx.image.impl.ByteIndexed;
import sun.swing.FilePane;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 15:36
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedGenerateCharArr());
        scanner.toString();
        System.out.println(scanner.next());
    }
}
class GenerateCharArr{
    public char[] generate(){
        return new char[]{'a','v','d','g'};
    }
}
class AdaptedGenerateCharArr extends GenerateCharArr implements Readable{
    int count = 3;

    @Override
    public int read(CharBuffer cb) throws IOException {
        char[] generate = generate();
        for (char c : generate){

            cb.append(c);
        }
        return count--;
    }
}
