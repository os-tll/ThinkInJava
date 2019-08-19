package section11;

import lombok.Data;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/11 13:18
 */
public class Ex22 {

    public static void main(String[] args) {
        HashSet<Ex22Aid> ex22Aids = new HashSet<>();
        try {
            List<String> strings = TextFile.readFile("E:/thinkinginjava/src/main/java/section11/Ex15.java");
            for (String s : strings) {
                Iterator<Ex22Aid> iterator = ex22Aids.iterator();
                boolean flag = true;
                while (iterator.hasNext()) {
                    Ex22Aid next = iterator.next();
                    if (next.equals(s)) {
                        next.setCounts(next.getCounts() + 1);
                        flag = false;
                    }
                }
                if(flag){
                    Ex22Aid ex22Aid = new Ex22Aid();
                    ex22Aid.setWord(s);
                    ex22Aid.setCounts(1);
                    ex22Aids.add(ex22Aid);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ex22Aids);
    }
}

@Data
class Ex22Aid {
    private String word;
    private Integer counts;

    @Override
    public boolean equals(Object o1) {
        if(this.word ==null && o1==null){
            return true;
        }
        if (o1 instanceof String) {
            return ((String) o1).equals(this.word);
        }
        if (o1 instanceof Ex22Aid) {
            return ((Ex22Aid) o1).getWord().equals(this.word);
        }
        return false;
    }

    @Override
    public String toString() {
        return "word->" + word + ",  counts->" + counts + "\n";
    }
}
