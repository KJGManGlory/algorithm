package com.lizza.Tree;

/**
 * 二叉树
 *          6
 *       /    \
 *      4      8
 *     / \    / \
 *    2   5  7   9
 *   /
 *  1
 */
public class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
    public static Node getTree() {
        Node root = new Node(6);
        Node _4 = new Node(4);
        Node _8 = new Node(8);
        root.left = _4;
        root.right = _8;
        Node _2 = new Node(2);
        _2.left = new Node(1);
        _4.left = _2;
        _4.right = new Node(5);
        _8.left = new Node(7);
        _8.right = new Node(9);
        
        return root;
    }
    @Override
    public String toString() {
        return val + "";
    }
}
