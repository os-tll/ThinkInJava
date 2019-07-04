package exercise;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/3 15:47
 */
public class FindStringBegin {

    public static void main(String[] args) {
        System.out.println(new FindStringBegin().strStr("a",""));
    }

    public int strStr(String source, String target) {
        // Write your code here
        if(source.equals(target)){
            return 0;
        }
        char[] sourceCharArray = source.toCharArray();
        char[] targetCharArray = target.toCharArray();
        StringBuffer[] allStates = new StringBuffer[sourceCharArray.length*targetCharArray.length];
        for(int i = 0; i < allStates.length; i++){
            allStates[i] = new StringBuffer();
        }

        for(int i = 0; i <= sourceCharArray.length-targetCharArray.length; i++){
            for(int j = 0; j < targetCharArray.length;  j++){
                allStates[i] = allStates[i].append(sourceCharArray[i+j]);
            }
        }
        for(int i = 0; i < allStates.length; i++){
            StringBuffer sb = allStates[i];
            if(target.equals(new String(sb))){
                return i;
            }
        }
        return -1;
    }
}
