package top.wangzhitao.chapter13.code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 王志涛 2024/8/18
 */
public class QueueStackAndCircularQueue {

    public static class QueueJavaImpl {

        // LinkedList 是双向链表
        public Queue<Integer> queue = new LinkedList<>();

        public Boolean isEmpty() {
            return queue.isEmpty();
        }

        public void offer(Integer num) {
            queue.offer(num);
        }

        public Integer poll() {
            return queue.poll();
        }

        public Integer peek() {
            return queue.peek();
        }

        public Integer size() {
            return queue.size();
        }
    }

    public static class QueueArrImpl {
        private final int[] queue;
        private int l;
        private int r;

        public QueueArrImpl(int num) {
            queue = new int[num];
            l = 0;
            r = 0;
        }

        public Boolean isEmpty() {
            return l == r;
        }

        public void offer(int num) {
            queue[r++] = num;
        }

        public int poll() {
            return queue[l++];
        }

        public int peek() {
            return queue[l];
        }

        public Integer head() {
            return queue[l];
        }

        public Integer tail() {
            return queue[r - 1];
        }

        public Integer size() {
            return r - l;
        }

    }

    public static class StackJavaImpl {
        // stack java使用的是动态数组实现的
        public Stack<Integer> stack = new Stack<>();

        public Boolean isEmpty() {
            return stack.isEmpty();
        }

        public void push(Integer num) {
            stack.push(num);
        }

        public Integer pop() {
            return stack.pop();
        }

        public Integer peek() {
            return stack.peek();
        }

        public Integer size() {
            return stack.size();
        }
    }

    public static class StackArrImpl {
        // size 始终指向栈顶元素的上一个
        // 所以入栈是直接赋值然后size++
        // 出栈是size--，然后返回size位置的值
        public int[] stack;
        public int size;

        public StackArrImpl(int size) {
            stack = new int[size];
            size = 0;
        }

        public Boolean isEmpty() {
            return size == 0;
        }

        public void push(int num) {
            stack[size++] = num;
        }

        public Integer pop() {
            return stack[--size];
        }

        public Integer peek() {
            return stack[size - 1];
        }

        public Integer size() {
            return size;
        }


    }

}
