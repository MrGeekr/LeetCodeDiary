package easy;

import java.util.HashMap;

/**
 * Created by Mr.Xu.
 * Date : 2019/7/28.
 * Description :136. 只出现一次的数字
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        int[] array=new int[]{1,1,2,2,3,4,4,5,5,6,6};
        System.out.println( singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        //使用异或运算，出现次数为偶数的数字经过异或后等于0，剩下的数字即是数组中只出现一次的数字
        for (int num : nums) {
            result = result ^ num;
        }
        return result;

    }
}
