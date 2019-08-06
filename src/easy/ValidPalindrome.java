package easy;

import java.util.Arrays;

/**
 * Created by Mr.Xu.
 * Date : 2019/8/4.
 * Description : 125. 验证回文串
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        String lowerCase=s.toLowerCase();//字符串中的字母都转为小写，方便比较
        char[] chars=lowerCase.toCharArray();
        while (left<right){
            while ((!Character.isLetterOrDigit(chars[left]))&&left<right){
                left++;
            }
            while ((!Character.isLetterOrDigit(chars[right]))&&left<right){
                right--;
            }
            if (chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
