package hard;

/**
 * Created by MrGeekr.
 * Date : 2019/9/25.
 * Description :42. 接雨水
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int length=height.length;
        if (length==0){
            return 0;}//考虑特殊情况
        int l=0;
        int r=length-1;
        int result = 0;

        int l_max=height[0];
        int r_max=height[length-1];

        while (l<=r){
            l_max=l_max>height[l]?l_max:height[l];
            r_max=r_max>height[r]?r_max:height[r];

            if (l_max<r_max){
                result+=l_max-height[l];
                l++;
            }else {
                result+=r_max-height[r];
                r--;
            }
        }

        return result;
    }
}
