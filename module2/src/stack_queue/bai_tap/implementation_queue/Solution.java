package stack_queue.bai_tap.implementation_queue;

public class Solution {

    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front;
        Node rear;
    }

    static void enQueue(Queue q, int value) {
        Node node = new Node();
        node.data =  value;
        if (q.front == null) {
            q.front = node;
        }else {
            q.rear.link = node;
        }
        q.rear = node;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else {
            Node node = q.front;
            value = node.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void display(Queue q) {
        Node node = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (node.link != q.front) {
            System.out.println(node.data);
            node = node.link;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q .front = q .rear =  null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        display(q);

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        // Remaining elements in Circular Queue
        display(q);

        enQueue(q, 9);
        enQueue(q, 20);
        display(q);
    }
}
