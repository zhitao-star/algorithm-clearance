package top.wangzhitao.chapter18_BinaryTreeTraversalIteration.code;

import top.wangzhitao.chapter17_BinaryTreeTraversalRecursion.code.BinaryTreeTraversalRecursion;

import java.util.Stack;

/**
 * @author wangzhitao 1542344316@qq.com 2024/8/28
 * @version 1.0
 * @since 1.0
 * 二叉树的非递归遍历方式
 */
public class BinaryTreeTraversalIteration {

    public static void stackPreOder(BinaryTreeTraversalRecursion.TreeNode head) {
        if (head != null) {
            Stack<BinaryTreeTraversalRecursion.TreeNode> stack = new Stack<>();
            // push head
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                //print head
                System.out.println("val:" + head.val);
                // push right
                if (head.right != null) {
                    stack.push(head.right);
                }
                // push left
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
    }

    public static void stackInOrder(BinaryTreeTraversalRecursion.TreeNode head) {
        if (head != null) {
            Stack<BinaryTreeTraversalRecursion.TreeNode> stack = new Stack<>();

            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    // head is not null and push head and handle left tree
                    stack.push(head);
                    head = head.left;
                } else {
                    // head is null and pop head and handle right tree
                    head = stack.pop();
                    System.out.println("val:" + head.val);
                    head = head.right;
                }
            }
        }
    }

    public static void stackPostOrder(BinaryTreeTraversalRecursion.TreeNode head) {
        if (head != null) {
            //use two stack
            Stack<BinaryTreeTraversalRecursion.TreeNode> stack = new Stack<>();
            Stack<BinaryTreeTraversalRecursion.TreeNode> collection = new Stack<>();

            stack.push(head);

            while (!stack.isEmpty()) {
                head = stack.pop();
                collection.push(head);
                if (head.left != null) {
                    stack.push(head.left);
                }
                if (head.right != null) {
                    stack.push(head.right);
                }
            }
            while (!collection.isEmpty()) {
                System.out.println("val:" + collection.pop().val);
            }
        }
    }

    public static void posOrderOneStack(BinaryTreeTraversalRecursion.TreeNode h) {
        if (h != null) {
            Stack<BinaryTreeTraversalRecursion.TreeNode> stack = new Stack<>();
            stack.push(h);
            // 如果始终没有打印过节点，h就一直是头节点
            // 一旦打印过节点，h就变成打印节点
            // 之后h的含义 : 上一次打印的节点
            while (!stack.isEmpty()) {
                BinaryTreeTraversalRecursion.TreeNode cur = stack.peek();
                if (cur.left != null && h != cur.left && h != cur.right) {
                    // 有左树且左树没处理过
                    stack.push(cur.left);
                } else if (cur.right != null && h != cur.right) {
                    // 有右树且右树没处理过
                    stack.push(cur.right);
                } else {
                    // 左树、右树 没有 或者 都处理过了
                    System.out.print(cur.val + " ");
                    h = stack.pop();
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        BinaryTreeTraversalRecursion.TreeNode head = BinaryTreeTraversalRecursion.buildBinaryTree();
        stackPreOder(head);
        System.out.println();
        stackInOrder(head);
        System.out.println();
        stackPostOrder(head);
        System.out.println();
        posOrderOneStack(head);
    }
}
