package com.lizza.Tree;

/**
 * 二叉树
 * 三种遍历方式: 先序遍历, 中序遍历, 后序遍历, 层次遍历
 *
 * 先序遍历: 根节点 > 左孩子 > 右孩子
 * 中序遍历: 左孩子 > 根节点 > 右孩子
 * 后续遍历: 左孩子 > 右孩子 > 根节点
 */
public class BinaryTree {

    /**
     * 示例树
     *       6
     *    /    \
     *   3      7
     *  / \    / \
     * 1   2  4   8
     *       /
     *      0
     * 先序遍历: 63127408
     * 中序遍历:
     */
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
        traversal(root);
    }

    public static void traversal(Node node) {
        if (node == null) return;
        // 先序遍历
        visit(node);
        traversal(node.left);
        // 中序遍历
        // visit(node);
        traversal(node.right);
        // 后序遍历
        // visit(node);
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
