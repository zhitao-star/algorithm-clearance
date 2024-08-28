package top.wangzhitao.chapter17_BinaryTreeTraversalRecursion.code;

/**
 * @author wangzhitao 1542344316@qq.com 2024/8/28
 * @version 1.0
 * @since 1.0
 * 二叉树 三种遍历的递归实现
 */
public class BinaryTreeTraversalRecursion {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v) {
            val = v;
        }
    }

    public static void preOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        // 先序遍历  中 左 右
        System.out.println("value:" + head.val);
        preOrder(head.left);
        preOrder(head.right);
    }

    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        // 中序遍历  左 中 右
        inOrder(head.left);
        System.out.println("value:" + head.val);
        inOrder(head.right);
    }

    public static void postOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        // 后序遍历  左 右 中
        postOrder(head.left);
        postOrder(head.right);
        System.out.println("value:" + head.val);
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        System.out.println("====preOrder=====");
        preOrder(head);

        System.out.println("====inOrder=====");
        inOrder(head);

        System.out.println("====postOrder=====");
        postOrder(head);

    }
}



