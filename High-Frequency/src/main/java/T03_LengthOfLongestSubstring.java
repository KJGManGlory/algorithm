import java.util.HashMap;
import java.util.Map;

/**
 * 找最大不重复子串
 * 关键点: 可伸缩滑动窗口
 */
public class T03_LengthOfLongestSubstring {

    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        // 可伸缩滑动窗口, 通过 start, end 的变化, 得到需要的结果
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(chars[end])) {
                // 加 1 是为了将重复的那个字符从窗口中剔除
                start = Math.max(map.get(chars[end]) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(chars[end], end);
        }

        return max;
    }
}
