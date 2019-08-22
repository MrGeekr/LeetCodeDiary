package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.Xu.
 * Date : 2019/8/22.
 * Description : 242. 有效的字母异位词
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        //如果两个字符串长度不相同，则一定不可能是字母异位词
        if (s.length()!=t.length()){
            return false;
        }
        //题目限定26个小写字母,所以只需要大小为26的数组
        int[] array=new int[26];

        for (int i = 0; i <s.length() ; i++) {
            array[s.charAt(i)-'a']++;
        }

        for (int i = 0; i <t.length() ; i++) {
            array[t.charAt(i)-'a']--;
            if (array[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcdn", "eabcd"));
    }
}
