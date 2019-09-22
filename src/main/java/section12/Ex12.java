package section12;

import com.sun.org.apache.bcel.internal.generic.Select;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 15:41
 */
public class Ex12 {
    public static void main(String[] args) {
        Ex12Aid ex12Aid = new Ex12Aid(3);
        ex12Aid.add(1);
        ex12Aid.add(2);
        ex12Aid.add(3);
        ex12Aid.add(4);
        Ex12Aid.Select select = ex12Aid.getSelect();
        while (!select.end()) {
            System.out.print(select.current());
            select.next();
        }
    }
}

class Ex12Aid {
    int arr[];
    int i = 0;

    Ex12Aid(int size) {
        arr = new int[size];
    }

    public Select getSelect() {
        i = 0;
        return new Select();
    }

    public void add(int num) {
        try {

            arr[i++] = num;
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new Ex12AidException();
        }
    }

    class Select {

        public boolean end() {
            return i == arr.length;
        }

        public Object current() {
            return arr[i];
        }

        public void next() {
            i++;
        }
    }


}

class Ex12AidException extends RuntimeException {
}

