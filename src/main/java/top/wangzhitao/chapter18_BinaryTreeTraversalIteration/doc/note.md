# 二叉树的遍历 非递归

## 前序遍历

- 1、头节点进栈
- 2、打印头节点
- 3、因为输出的是 中 左 右 所以 先压入右 再压入左
- 4、while循环 直到栈空为止

## 中序遍历

- 中序的顺序是 左 中 右
- 1、子树 头节点 左边界全部进栈
- 2、弹出节点 打印 节点右树重复1操作
- 3、while循环 直到 没有树节点以及栈为空了

## 后续遍历   两个栈实现

1、先序打印是 中 左 右 入栈是 中 右 左
2、那么 入栈 中 左 右 对应 中 右 左  
3、那么进行反转就是 左 右 中

## 后续遍历  用一个栈实现

	// 用一个栈完成先序遍历
	// 测试链接 : https://leetcode.cn/problems/binary-tree-preorder-traversal/


    // 用一个栈完成中序遍历
    // 测试链接 : https://leetcode.cn/problems/binary-tree-inorder-traversal/

    // 用两个栈完成后序遍历
    // 提交时函数名改为postorderTraversal
    // 测试链接 : https://leetcode.cn/problems/binary-tree-postorder-traversal/


    // 用一个栈完成后序遍历
    // 提交时函数名改为postorderTraversal
    // 测试链接 : https://leetcode.cn/problems/binary-tree-postorder-traversal/



