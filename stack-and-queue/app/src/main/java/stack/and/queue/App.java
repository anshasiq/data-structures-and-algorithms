/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import stack.and.queue.queue.Queue;
import stack.and.queue.stack.Stack;

public class App {
//    public String getGreeting() {
//        return "Hello World!";
//    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.isEmpty();
        stack.peek();
        stack.pop();
        stack.peek();
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(45);
        queue.peek();
//        System.out.println(new App().getGreeting());
    }
}