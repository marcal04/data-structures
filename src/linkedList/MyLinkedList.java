package linkedList;

public class MyLinkedList {
    private Node head;
    private int size;
    private Node tail;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        System.out.println(list.size());
    }


}

