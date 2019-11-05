package section13;

import java.util.Formatter;

/**
 * 格式化说明符的使用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 15:25
 */
public class Ex4 {
    String line1 = "%-15.15";
    String line2 = "%5";
    String line3 = "%20.3";
    float total = 0;
    Formatter formatter = new Formatter(System.out);
    private void printTitle(){
        formatter.format(line1+"s"+ line2+"s"+line3+"s"+"\n","Item", "Qty","Price");
    }
    private void printEach(String item, int qty, float price){
        formatter.format(line1+"s"+ line2+"d"+line3+"f"+"\n",item, qty, price);
        total += price * qty;
    }

    private void printTotal(){
        formatter.format(line1 + "s" + line2 + "s"+line3 + "f"+"\n", "Tax", "", total*0.4);
        formatter.format(line1 + "s" + line2 + "s"+line3 + "f"+"\n", "Total", "", total);
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        ex4.printTitle();
        ex4.printEach("a23456789123456789",234,2.13f);
        ex4.printEach("b",341,523.65f);
        ex4.printTotal();
    }
}
