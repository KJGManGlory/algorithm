package com.lizza.Tree;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2021-01-08
 */
public class MirrorTree {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3);
        root.left = _2;
        root.right = _3;
        TreeNode _4 = new TreeNode(4);
        TreeNode _5 = new TreeNode(5);
        TreeNode _6 = new TreeNode(6);
        TreeNode _7 = new TreeNode(7);
        _2.left = _4;
        _2.right = _5;
        _3.left = _6;
        _3.right = _7;
        mirrorTree(root);

    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(left);
        return root;
    }
}
