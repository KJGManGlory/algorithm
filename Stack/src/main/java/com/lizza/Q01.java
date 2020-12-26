package com.lizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q01 {

    // map用来缓存成对的括号; 最后添加一对问号是为了防止栈中元素为空时继续pop而报错
    static Map<Character, Character> map = new HashMap<Character, Character>(){{
        put('(', ')'); put('{', '}'); put('[', ']'); put('?', '?');
    }};

    public static void main(String[] args){
        String str = "()]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        if (str.length() > 0 && !map.containsKey(str.charAt(0))) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>(){{add('?');}};
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 左括号入栈, 右括号出栈
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (map.get(stack.pop()) != ch) {
                return false;
            }
        }

        return stack.size() == 1;
    }
}
