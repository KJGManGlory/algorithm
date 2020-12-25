import java.util.Arrays;
import java.util.Stack;

/**
 *
 */
public class Q06_ReversePrint {

    public static void main(String[] args){
        int[] nums = new int[]{2, 3, 1};
        ListNode head = new ListNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
        }
        int[] arrays = reversePrint(head);
        System.out.println(Arrays.toString(arrays));
    }

    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode item = head;
        while (head.next != null) {
            stack.push(item.val);
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}