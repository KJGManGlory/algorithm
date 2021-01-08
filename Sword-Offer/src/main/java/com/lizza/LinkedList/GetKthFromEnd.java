package com.lizza.LinkedList;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * 前后指针
 */
public class GetKthFromEnd {

    public static void main(String[] args){
        ListNode _5 = new ListNode(5);
        ListNode _4 = new ListNode(4);
        ListNode _3 = new ListNode(3);
        ListNode _2 = new ListNode(2);
        ListNode _1 = new ListNode(1);
        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;

        ListNode result = getKthFromEnd(_1, 2);
        while (result != null) {
            result = result.next;
            System.out.println(result.value);
        }
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode start = head, end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null) {
            end = end.next;
            start = start.next;
        }
        return start;
    }
}
