package hard;

/**
 * Created by MrGeekr.
 * Date : 2019/11/27.
 * Description :描述
 * 评论
 * 题解New
 * 历史
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 *
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 *
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 *
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int length=nums.length;
        for (int i = 0; i <length ; i++) {
            //循坏，保证nums[i]这个位置能交换到正确的数字，只有一次if判断交换不够
            while (nums[i] > 0 && nums[i] <= length && nums[nums[i] - 1] != nums[i]) {
                // 第 3 个条件不成立的索引的部分是 i 和 nums[i]-1
                swap(nums, nums[i] - 1, i);

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]-1!=i){
                return i+1;//这里return就相当于有break的作用，如果使用result变量，则会累加下去
            }
        }
        return length+1;
    }

    private static void swap(int[] nums, int i, int num) {
        int temp=nums[i];
        nums[i]=nums[num];
        nums[num]=temp;

    }

    public static void main(String[] args) {
        int a=firstMissingPositive(new int[]{1,1});
        System.out.println(a);
    }

}
