import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class T01_TwoSum {

    public static void main(String[] args){
        int[] array = new int[]{3, 3};
        int target = 6;
        int[] result = twoSum(target, array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int target, int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int e = array[i];
            if (map.containsKey(target - e) && i != map.get(target - e)) {
                return new int[]{map.get(target - e), i};
            }
            map.put(e, i);
        }
        return null;
    }
}
