package com.lizza.Tree;

/**
 * 最近公共祖先
 *          6
 *       /    \
 *      4      8
 *     / \    / \
 *    2   5  7   9
 *   /
 *  1
 * 题型一: 一般二叉树
 * 题型二: 搜索二叉树; 对于搜索二叉树, 可以根据其特性, 判断 p 和 q 的值与 root 的值的关系
 *        从而只需要遍历左子树或右子树
 */
public class LowestCommonAncestor {

    public static void main(String[] args){
        Node root = new Node(6);
        Node _4 = new Node(4);
        Node _8 = new Node(8);
        root.left = _4;
        root.right = _8;
        Node _2 = new Node(2);
        Node _1 = new Node(1);
        _2.left = _1;
        _4.left = _2;
        Node _5 = new Node(5);
        _4.right = _5;
        _8.left = new Node(7);
        _8.right = new Node(9);
        System.out.println(lowestCommonAncestor(root, _1, _5).val);
    }

    /**
     * 最近公共祖先
     *          6
     *       /    \
     *      4      8
     *     / \    / \
     *    2   5  7   9
     *   /
     *  1
     */
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        // 如果 p 或 q 有一个是 root, 则说明 p 或 q 是最近的公共祖先
        if (root == null || q == root || p == root) return root;
        //
        Node left = lowestCommonAncestor(root.left, p, q);
        //
        Node right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
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
