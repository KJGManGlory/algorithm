package com.lizza.Tree;

/**
 * 求一个二叉树的最大深度
 *
 *       6
 *    /    \
 *   3      7
 *  / \    / \
 * 1   2  4   8
 *       /
 *      0
 * 
 */
public class TreeDepth {

    public static void main(String[] args){
        Node root = new Node(6);
        Node _3 = new Node(3);
        Node _7 = new Node(7);
        root.left = _3;
        root.right = _7;
        _3.left = new Node(1);
        _3.right = new Node(2);
        Node _4 = new Node(4);
        _7.left = _4;
        _7.right = new Node(8);
        _4.left = new Node(0);
        System.out.println(maxDepth(root));
    }
    
    public static int maxDepth(Node root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
}
