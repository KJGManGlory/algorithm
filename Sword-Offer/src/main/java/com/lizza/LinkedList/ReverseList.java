package com.lizza.LinkedList;

import java.util.Arrays;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 */
public class ReverseList {

    public static void main(String[] args){
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
        ListNode _4 = new ListNode(4);
        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        reverse(_1);
        System.out.println(result);
    }
    static ListNode result;
//    public static ListNode reverseList(ListNode head) {
//
//    }
    static ListNode h;
    public static void reverse(ListNode head) {
        if (head.next != null) {
            reverse(head.next);
        }
        System.out.println(head.value);
    }
}
