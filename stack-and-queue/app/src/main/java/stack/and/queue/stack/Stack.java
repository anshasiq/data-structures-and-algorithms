package stack.and.queue.stack;

import stack.and.queue.Node;
//package stack.and.queue;

//import stack.queue.Node;
public class Stack <T> {
    private Node <T> top;

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next=top;
       top=newNode;
    }

    public T pop(){
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty(){
        if(top==null){
        System.out.println("Stack is empty");
       return top==null;}
       else
       return false;
    }

    public T peek(){
       if (isEmpty()){
           return null;
       }
       System.out.println(top.data);
        return top.data;
    }


}
