package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.Xu.
 * Date : 2019/7/28.
 * Description :1. 两数之和
 */
public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int result=target-nums[i];
            if (map.containsKey(result)){
                return new int[]{i,map.get(result)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException();
    }


}
