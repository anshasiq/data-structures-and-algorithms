package stack.and.queue.queue;

import stack.and.queue.Node;

public class Queue <T> {
    Node <T> front;
    Node <T> tail;
    public void enqueue(T data){
        if(front==null){
        Node<T> newNode = new Node<>(data);
            front = newNode;
        tail =newNode;}
        else
        { Node<T> newNode = new Node<>(data);
            tail.next=newNode;
            tail =newNode;}}
    public boolean isEmpty() {
        return front == null;
    }
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return front.data;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            tail = null;
        }

        return data;
    }
}
