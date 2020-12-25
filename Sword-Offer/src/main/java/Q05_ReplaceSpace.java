/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-25
 */
public class Q05_ReplaceSpace {

    public static void main(String[] args){
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 32) {
                result += "%20";
                continue;
            }
            result += c;
        }
        return result;
    }
}
