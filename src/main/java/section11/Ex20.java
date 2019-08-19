package section11;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/10 10:28
 */
public class Ex20 {
    public static void main(String[] args) throws Exception {

        HashSet<Character> vowelSet = new HashSet<>();
        Collections.addAll(vowelSet, 'A','E','I','O','U','a','e','i','o','u');
        List<String> strings = TextFile.readFile("E:/thinkinginjava/src/main/java/section11/Ex15.java");
        int fileCount = 0;
        HashMap<Character, Integer> vowelMap = new HashMap<>();
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
                    if(vowelMap.containsKey(c)){
                        vowelMap.put(c,vowelMap.get(c)+1);
                    }else{
                        vowelMap.put(c,0);
                    }
                }
            }
            System.out.println(str +" : "+wordCount);
        }
        System.out.println(fileCount);
        System.out.println(vowelMap);
    }
}
