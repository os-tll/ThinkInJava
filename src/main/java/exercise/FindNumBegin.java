package exercise;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/3 16:58
 */
public class FindNumBegin {
    public static void main(String[] args) {
        new FindNumBegin().binarySearch(new int[]{2,2,3,4,5,6,8,13,17,18}, 17);
        System.out.println(index);

    }
    int target;
    int[] nums;
    static int index = -1;
    public int binarySearch(int[] nums, int target) {
        // write your code here
        //使用二分法
        this.target = target;
        this.nums = nums;
        search(0, nums.length-1);
        return index;
    }

    public void search(int beginIndex, int endIndex){
        if( endIndex - beginIndex <=1){
            if(nums[beginIndex] == target && (beginIndex < index || index == -1)){
                index = beginIndex;
            }
            if(nums[endIndex] == target && (endIndex < index || index == -1)){
                index = endIndex;
            }
            return ;
        }
        int middleIndex = (beginIndex + endIndex + 1) / 2;
        int middleNum = nums[middleIndex];
        //目标大于中值
        if( this.target > middleNum ){
            search(middleIndex, endIndex);
        }
        //目标小于等于中值
        if( this.target <= middleNum ){
            search(beginIndex, middleIndex);
        }

    }
}

