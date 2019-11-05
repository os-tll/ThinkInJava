package section13;

/**
 * 观察字符串后台汇编代码
 * 使用StringBuilder能够避免产生过多的StringBuilder
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 14:08
 */
public class Ex1 {
    public static void main(String[] args) {
        String str = "begin";
        for (int i = 0; i < 10; i++) {
            str += str;
        }
        str += "end";

        StringBuilder str1 = new StringBuilder("begin");
        for (int i = 0; i <10; i++) {
            str1.append(str);
        }
        str1.append("end");
    }
}
/*
* public class section13.Ex1 {
  public section13.Ex1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String begin
       2: astore_1
       3: iconst_0
       4: istore_2
       5: iload_2
       6: bipush        10
       8: if_icmpge     36
      11: new           #3                  // class java/lang/StringBuilder
      14: dup
      15: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      18: aload_1
      19: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: aload_1
      23: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: invokevirtual #6                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      29: astore_1
      30: iinc          2, 1
      33: goto          5
      36: new           #3                  // class java/lang/StringBuilder
      39: dup
      40: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      43: aload_1
      44: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: ldc           #7                  // String end
      49: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: invokevirtual #6                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      55: astore_1
      56: new           #3                  // class java/lang/StringBuilder
      59: dup
      60: ldc           #2                  // String begin
      62: invokespecial #8                  // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
      65: astore_2
      66: iconst_0
      67: istore_3
      68: iload_3
      69: bipush        10
      71: if_icmpge     86
      74: aload_2
      75: aload_1
      76: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: iinc          3, 1
      83: goto          68
      86: aload_2
      87: ldc           #7                  // String end
      89: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: return

* */