package easy;

/**
 * Created by Mr.Xu.
 * Date : 2019/7/29.
 * Description :
 */
public class PalindromeNumber9 {public boolean isPalindrome(int x) {
    String string=new StringBuilder(String.valueOf(x)).reverse().toString();
    return string.equals(String.valueOf(x));
}}
