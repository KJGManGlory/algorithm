package com.lizza.Tree;

import javax.swing.tree.TreeNode;

/**
 * 寻找二叉树中
 */
public class KthLargest {

    private static int result = 0;
    private static int k = 0;

    /**
     * 示例树: 01234678
     *          6
     *       /    \
     *      4      8
     *     / \    / \
     *    2   5  7   9
     *   /
     *  1
     * 先序遍历: 64215879
     * 中序遍历: 12456789
     * 后序遍历: 12547986
     */
    public static void main(String[] args){
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
        System.out.println(kthLargest(root, 4));
    }

    public static int kthLargest(Node root, int k) {
        KthLargest.k = k;
        traversal(root);
        return result;
    }

    public static void traversal(Node root) {
        if (root == null) return;
        traversal(root.right);
        if (k == 0) return;
        if (--k == 0) result = root.val;
        traversal(root.left);
    }

    public static void visit(Node node) {
        System.out.print(node);
    }

    static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
