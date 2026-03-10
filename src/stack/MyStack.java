package stack;

import linkedList.Node;

public class MyStack {

    private Node top; // topo da linha
    private int size; // quantos elementos

    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public int peek() {
        return top.value; //olha o topo sem remover
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());  // 30 - só olha
        System.out.println(stack.pop());   // 30 - remove
        System.out.println(stack.pop());   // 20 - remove
        System.out.println(stack.size());  // 1
    }


}










