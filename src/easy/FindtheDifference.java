package easy;

import java.util.HashMap;

/**
 * Created by Mr.Xu.
 * Date : 2019/7/29.
 * Description :389. 找不同
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> sMap =new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            Character key=s.charAt(i);
            if (!sMap.containsKey(key)){
                sMap.put(key,0);
            }else {
                sMap.put(key,sMap.get(key)+1);
            }
        }
        HashMap<Character,Integer> tMap =new HashMap<>();
        for (int i = 0; i <t.length() ; i++) {
            Character key=t.charAt(i);
            if (!tMap.containsKey(key)){
                tMap.put(key,0);
            }else {
                tMap.put(key,tMap.get(key)+1);
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            Character key=t.charAt(i);
            if (sMap.get(key)==null||!sMap.get(key).equals(tMap.get(key))){
                return key;
            }
        }
        throw new IllegalArgumentException();
    }
}
