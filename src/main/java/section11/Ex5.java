package section11;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 10:58
 */
public class Ex5 {
    public static void main(String[] args) {
        Random random = new Random(47);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,9,7,5,3,1,4);
        System.out.println("1: " + arrayList); //1: [9, 7, 5, 3, 1, 4]
        arrayList.add(0);
        System.out.println("2: "+arrayList); //2: [9, 7, 5, 3, 1, 4, 0]
        System.out.println("3: "+arrayList.contains(3)); //true
        arrayList.remove(3);
        int temp1 = arrayList.get(2);
        System.out.println("4: "+temp1 + "  "+arrayList.indexOf(temp1)); //4: 5  2
        Integer integer = new Integer(4);
        System.out.println("5: "+arrayList.indexOf(integer)); //5: 4
        System.out.println("6: "+arrayList.remove((Object)integer)); //6: true,remove方法当时非int类型参数则直接移除，int类型的则是下标
        System.out.println("7: "+arrayList.remove((Object)temp1)); //7: true，remove方法当时非int类型参数则直接移除，int类型的则是下标
        System.out.println("8: "+arrayList); //8: [9, 7, 1, 0]
        arrayList.add(3,-1);
        System.out.println("9: "+arrayList); //9:[9, 7, 1, -1, 0]
        List<Integer> subList = arrayList.subList(1,4);
        System.out.println("10: "+subList); //10:[7, 1] 前闭后开
        Collections.sort(subList);
        System.out.println("sorted subList: "+subList);
        //! arrayList.add(2,1); subList取出的元素的幕后还是原来的，所有subList的改动后反应到原来的，原来的改动会导致异常
        System.out.println("11: "+arrayList.containsAll(subList)); //containsAll与元素的顺序无关
        Collections.shuffle(subList, random);
        System.out.println("shuffled subList: "+subList);
        System.out.println("12: "+arrayList.containsAll(subList));
        ArrayList<Integer> arrayListCopy = new ArrayList<>(arrayList);
        subList = Arrays.asList(arrayListCopy.get(1), arrayListCopy.get(3));
        System.out.println("subList: "+subList); //subList: [1, 7]
        arrayListCopy.retainAll(subList);//找出两者的交集，赋给arrayListCopy
        System.out.println("13: "+arrayListCopy); //13: [1, 7]
        arrayListCopy = new ArrayList<>(arrayList);
        arrayListCopy.remove(0); //传入int类型，按照下标移除
        System.out.println("14: "+arrayListCopy); //14: [9, -1, 7, 0]
        arrayListCopy.removeAll(subList);
        System.out.println("15 :"+arrayListCopy); //15 :[-1, 0]
        arrayListCopy.set(1, -5);//set方法意为replace
        System.out.println("16: "+arrayListCopy); //16: [-1, -5]
        arrayListCopy.addAll(1,subList);
        System.out.println("17: "+arrayListCopy);//17: [-1, -5, 1, 7]
        System.out.println("18: "+arrayListCopy.isEmpty()); //18: false
        arrayListCopy.clear();
        System.out.println("19: "+arrayListCopy); //19: []
        System.out.println("20: "+arrayListCopy.isEmpty()); //20: true
        System.out.println("21: "+arrayList);
        Object[] objects = arrayList.toArray();
        System.out.println("22: "+objects[2]);
        Integer[] integersArray = new Integer[arrayList.size()];
        arrayList.toArray(integersArray);
        System.out.println("23: "+integersArray[2]);
    }
}
