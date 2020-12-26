package com.lizza.Stack;

/**
 * 自定义的栈: 要求提供查询当前栈最小数的方法
 */
public class MinStack {

    public static void main(String[] args){
    	Stack stack = new Stack();
    	stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.min());
    	stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.min());
    }

    static class Stack {
        int[] data;
        int index;
        int min;

        public Stack() {
            this.index = -1;
            this.min = Integer.MAX_VALUE;
            this.data = new int[1 << 16];
        }

        public void push(int e) {
            if (e <= min) {
                data[++index] = min;
                min = e;
            }
            data[++index] = e;
        }

        public void pop() {
            if (data[index] == min) {
                min = data[--index];
            }
            --index;
        }

        public int top() {
            return data[index];
        }

        public Integer min() {
            return min;
        }
    }
}
