package section11;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 13:03
 */
public class Ex6 {
    public static void main(String[] args) {
        Random random = new Random(47);
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"123","789","456","342");
        System.out.println("1: " + arrayList); //1: ["123","789","456","342"]
        arrayList.add("000");
        System.out.println("2: "+arrayList); //2: ["123","789","456","342","000"]
        System.out.println("3: "+arrayList.contains("000")); //true
        arrayList.remove(3);
        String temp1 = arrayList.get(2);
        System.out.println("4: "+temp1 + "  "+arrayList.indexOf(temp1)); //4: 456 2
        String string = "123";
        System.out.println("5: "+arrayList.indexOf(string)); //5: 0
        System.out.println("6: "+arrayList.remove(string)); //6: true,remove方法当时非int类型参数则直接移除，int类型的则是下标
        System.out.println("7: "+arrayList.remove(temp1)); //7: true，remove方法当时非int类型参数则直接移除，int类型的则是下标
        System.out.println("8: "+arrayList); //8: ["789","000"]
        arrayList.add(2,"345");
        System.out.println("9: "+arrayList); //9: [789, 000, 345]
        List<String> subList = arrayList.subList(1,3);
        System.out.println("10: "+subList); //10: [000, 345]
        Collections.sort(subList);
        System.out.println("sorted subList: "+subList);
        //! arrayList.add(2,1); subList取出的元素的幕后还是原来的，所有subList的改动后反应到原来的，原来的改动会导致异常
        System.out.println("11: "+arrayList.containsAll(subList)); //containsAll与元素的顺序无关
        Collections.shuffle(subList, random);
        System.out.println("shuffled subList: "+subList);
        System.out.println("12: "+arrayList.containsAll(subList));
        ArrayList<String> arrayListCopy = new ArrayList<>(arrayList);
        subList = Arrays.asList(arrayListCopy.get(1), arrayListCopy.get(2));
        System.out.println("subList: "+subList); //subList: [1, 7]
        arrayListCopy.retainAll(subList);//找出两者的交集，赋给arrayListCopy
        System.out.println("13: "+arrayListCopy); //13: [000, 345]
        arrayListCopy = new ArrayList<>(arrayList);
        arrayListCopy.remove(0); //传入int类型，按照下标移除
        System.out.println("14: "+arrayListCopy); //113: [000, 345]
        arrayListCopy.removeAll(subList);
        System.out.println("15 :"+arrayListCopy); //15 :[]
        arrayListCopy = new ArrayList<>(arrayList);
        arrayListCopy.set(2, "234");//set方法意为replace
        System.out.println("16: "+arrayListCopy); //16: [789, 000, 234]
        arrayListCopy.addAll(1,subList);
        System.out.println("17: "+arrayListCopy);//17: [789, 000, 345, 000, 234]
        System.out.println("18: "+arrayListCopy.isEmpty()); //18: false
        arrayListCopy.clear();
        System.out.println("19: "+arrayListCopy); //19: []
        System.out.println("20: "+arrayListCopy.isEmpty()); //20: true
        System.out.println("21: "+arrayList);
        Object[] objects = arrayList.toArray();
        System.out.println("22: "+objects[2]);
        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);
        System.out.println("23: "+stringArray[2]);
    }
}
