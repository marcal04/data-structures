package queue;

import linkedList.Node;

public class MyQueue {
    private Node head; //frente
    private Node tail; // final
    private int size; // quantidade

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public int dequeue() {
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public int peek() {
        return head.value; //só lê o head
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());     // 10 - primeiro da fila
        System.out.println(queue.dequeue());  // 10 - sai o primeiro
        System.out.println(queue.dequeue());  // 20 - sai o segundo
        System.out.println(queue.size());     // 1  - sobrou o 30






    }













}
