package dev.santoshk;

import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(0);

        System.out.println("Top element is " + stack.peek()); // 0
        int val = stack.pop();
        System.out.println("Removed element is " + val); // 5, 10
        System.out.println("Top element is " + stack.peek()); // 10
        val = stack.pop(); // 10
        System.out.println("Removed element is " + val); // 10
        System.out.println("Top element is " + stack.peek()); // 5

        if(stack.empty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
}