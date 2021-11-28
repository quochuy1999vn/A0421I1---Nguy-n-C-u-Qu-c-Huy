package stack_queue.thuc_hanh.Queue_in_linkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node node = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node node = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return node;
    }
}

class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
