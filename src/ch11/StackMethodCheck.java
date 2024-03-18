package ch11;

import java.util.Stack;

public class StackMethodCheck {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(4);

        System.out.println(myStack);
        System.out.println(myStack.search(2));
        System.out.println(myStack.indexOf(4));
        System.out.println(myStack.lastIndexOf(4));

    }
}
