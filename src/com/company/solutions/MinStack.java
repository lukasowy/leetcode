package com.company.solutions;

import java.util.LinkedList;

/**
 * 155. Min Stack
 */
class MinStack {

    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> minStack = new LinkedList<>();

    public MinStack() {

    }

    public void push(int val) {
        minStack.push(Math.min(val, minStack.peek() == null ? val : minStack.peek()));
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(-2);
        stack.push(0);
        stack.push(-1);
        stack.getMin();
        stack.top();
        stack.pop();
        stack.getMin();

    }
}