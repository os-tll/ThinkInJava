package section11;

import java.util.LinkedList;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 21:28
 */
public class Ex15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            //加号说明下一个元素要入栈
            if('+' == c){
                ++i;
                if('-' == chars[i]){
                    Character pop = stack.pop();
                    System.out.print(pop);
                    continue;
                }
                stack.push(chars[i]);
            }
            if('-' == c){
                Character pop = stack.pop();
                System.out.print(pop);
            }
        }
        System.out.println();
    }
}

/**
 * 使用linkedList模拟栈
 * @param <T>
 */
class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.add(v);
    }
    /**
     * 获取栈顶元素
     */
    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.poll();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
