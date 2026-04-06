package easy;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 */

class MyQueue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();
    
    public MyQueue() {
    
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        shiftStacks();
        return stackOut.pop();
    }
    
    public int peek() {
        shiftStacks();
        return stackOut.peek();
    }
    
    public void shiftStacks() {
        if (stackOut.empty()) {
            while (!stackIn.empty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.empty();
    }
}

public class LC232 {
    void main() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
    
}
