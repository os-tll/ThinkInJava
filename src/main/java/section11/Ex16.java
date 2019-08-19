package section11;

import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/9 16:02
 */
public class Ex16 {
    public static void main(String[] args) throws Exception {

        HashSet<Character> vowelSet = new HashSet<>();
        Collections.addAll(vowelSet, 'A','E','I','O','U','a','e','i','o','u');
        List<String> strings = TextFile.readFile("E:/thinkinginjava/src/main/java/section11/Ex15.java");
        int fileCount = 0;
        for(String str : strings){
            if(str==null){
                break;
            }
            char[] chars = str.toCharArray();
            int wordCount = 0;
            for(char c : chars){
                if(vowelSet.contains(c)){
                    ++wordCount;
                    ++fileCount;
                }
            }
            System.out.println(str +" : "+wordCount);
        }
        System.out.println(fileCount);
    }


}
class TextFile{
    public static List<String> readFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[100000];
        fileReader.read(chars);
        String s = new String(chars);
        String[] strings = s.split(" ");
        String[] stringNew = new String[strings.length];
        int j = 0;
        for (int i = 0; i < strings.length; i++) {
            while(strings[i].isEmpty()){
                i++;
            }
            stringNew[j++] = strings[i];
        }
        return new ArrayList<>(Arrays.asList(stringNew));
    }
}