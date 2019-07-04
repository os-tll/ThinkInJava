package exercise;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 15:50
 */
public class Sort {
    /**
     * 冒泡
     *
     * @author tanglonglong ＼(－－)／
     * @date 15:51 2019/7/2
     */
    public void sortIntegers1(int[] A) {
        // write your code here


        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                // minTem = num < minTemp ? num : minTemp
                if (A[j] < A[i]) {
                    swap(A, i, j);
                }
            }
        }
    }

    public void swap(int[] A, int x, int y) {
        int x1 = A[x];
        A[x] = A[y];
        A[y] = x1;
    }

    /**
     * 快排---失败的一种实现。。。。一点也不快
     *
     * @author tanglonglong ＼(－－)／
     * @date 15:52 2019/7/2
     */
    public void sortIntegers2(int[] A, int beginIndex, int endIndex) {
        if (beginIndex >= endIndex) {
            System.out.println(Arrays.toString(A));
            return;
        }
        int randomIndex = (endIndex + beginIndex) / 2;
        int randomNumber = A[randomIndex];
        int b1[] = new int[endIndex - beginIndex + 1];
        int i = 0;
        int j = b1.length - 1;
        for (int x = beginIndex; x <= endIndex; x++) {
            if (x == randomIndex) {
                continue;
            }
            if (A[x] < randomNumber) {
                b1[i++] = A[x];
            } else {
                b1[j--] = A[x];
            }
        }
        b1[i] = randomNumber;
        int h = 0;
        for (int x = beginIndex; x <= endIndex; x++) {
            A[x] = b1[h++];
        }
        sortIntegers2(A, beginIndex, beginIndex + i);
        sortIntegers2(A, beginIndex + i + 1, endIndex);
    }

    /**
     * 快排---真正意义上的快
     *
     * @author tanglonglong ＼(－－)／
     * @date 17:50 2019/7/2
     */
    public void sortIntegers3(int[] A, int beginIndex, int endIndex) {
        int h = beginIndex;
        for (int i = beginIndex; i <= endIndex; i++) {
            if (A[h] > A[i]) {
                swap(A, i, h);
                h = i;
            }
        }
    }

    static int count;

    public TreeNode maxNode(TreeNode root) {
        // write your code here
        int childCount = root.getChildCount();
        if (childCount == 0) {
            count++;
        }
        for (int i = 0; i < childCount; i++) {
            TreeNode childAt = root.getChildAt(i);
            maxNode(childAt);
        }
        return null;
    }



    int partsort(int a[],int l,int r){                 //将比a[r]小的元素放左边，比它大的放右边，最后把a[r]放中间
        int i=l;                                        //i为比a[r]大的元素的下标，初始为开始位置l

        for(int j=l;j<r;j++){

            if(a[j]<=a[r]){                               //如果元素比a[r]小则和大的元素交换位置，目的让小的放一起，大的放一起

                int t=a[j];                                 //可以自己手运行几遍这个循环

                a[j]=a[i];

                a[i]=t;

                i++;

            }

        }

        int t=a[i];                                   //a[i]为小元素和大元素的交界处，将a[r]与之交换

        a[i]=a[r];

        a[r]=t;

        return i;                                    //返回交界处下标，继续排前边的和后边的这俩组

    }

    void quicksort(int a[],int l,int r){

        if(l<r){                                   //递归结束条件为组中只剩一个元素

            int p=partsort(a,l,r);                    //分成俩组返回交界处

            quicksort(a,l,p-1);                  //继续分左边

            quicksort(a,p+1,r);

        }

    }


        public static void main(String[] args) {
//        int[] ints = {3, 2, 1, 4, 2, 67, 96, 36, 0, 5};
        int[] ints = {2,4,5,3};
//        new Sort().sortIntegers2(ints,0, ints.length-1);
        new Sort().quicksort(ints,0, ints.length-1);
    }
}
