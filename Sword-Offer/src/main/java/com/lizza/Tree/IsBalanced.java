package com.lizza.Tree;

/**
 * 判断一个二叉树是否是一个平衡二叉树
 */
public class IsBalanced {

    public static void main(String[] args){
        TreeNode treeNode = TreeNode.getTree();
        System.out.println(recur(treeNode));
    }
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
    public static int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
