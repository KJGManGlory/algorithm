package com.lizza.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 二叉树
 * 三种遍历方式: 先序遍历, 中序遍历, 后序遍历, 层次遍历
 *
 * 先序遍历: 根节点 > 左孩子 > 右孩子
 * 中序遍历: 左孩子 > 根节点 > 右孩子
 * 后续遍历: 左孩子 > 右孩子 > 根节点
 * 层序遍历
 */
public class BinaryTree {

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
     * 层序遍历: 64825791
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
        levelOrder(root);
    }

    /**
     * 层序遍历
     */
    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            visit(node);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    /**
     * 先序, 中序, 后序遍历
     */
    public static void traversal(Node root) {
        if (root == null) return;
        // 先序遍历
//        visit(root);
        traversal(root.left);
        // 中序遍历
//         visit(root);
        traversal(root.right);
        // 后序遍历
         visit(root);
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
