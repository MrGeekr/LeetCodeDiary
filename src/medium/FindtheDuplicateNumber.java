package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mr.Xu.
 * Date : 2019/7/29.
 * Description :287. 寻找重复数
 */
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}


