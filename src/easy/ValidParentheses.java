package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by MrGeekr.
 * Date : 2019/11/29.
 * Description :
 * 20. 有效的括号
 * 难度
 * 简单
 *
 * 1214
 *
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 关注
 * 通过次数
 *
 * 160,393
 *
 * 提交次数
 *
 * 399,623
 * 描述
 * 评论
 * 题解New
 * 历史
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        //用HashMap存放符号的对应关系,右括号放在key，因为要到用右括号来对比栈中的左括号
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (!map.containsKey(c)){
                stack.push(c);
            }else {
                //要注意栈为空的情况，否则异常
                if (stack.isEmpty()){
                    return false;
                }
                char temp=stack.pop();
                if (temp!=map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
