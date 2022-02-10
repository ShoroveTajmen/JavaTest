package leetcode155;

import java.util.Stack;

public class MinStack {
    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public MinStack() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }

    public void push(int val) {
        firstStack.push(val);
        if(secondStack.isEmpty()){
            secondStack.push(val);
        }
        Integer min = secondStack.peek();
        if(min > val){
            secondStack.push(val);
        }
        else{
           secondStack.push(min);
        }
    }

    public int pop() {
        firstStack.pop();
        secondStack.pop();
        return 0;
    }

    public int top() {
        return firstStack.peek();
    }

    public int getMin() {
        return secondStack.peek();
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(10);
        m.push(2);
        m.push(1);
        m.push(5);
        System.out.println(m.top());
        System.out.println(m.getMin());
        System.out.println(m.pop());
        System.out.println(m.top());
    }
}
