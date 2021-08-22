package list.bai_tap.linkedList;




public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(int numNodes) {
    }

    public void add(int index, E element) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node insert = new Node(element);
        insert.next = node.next;
        node.next = insert;
        numNodes++;
    }

    public void addFirst(E e) {
        Node insert = new Node(e);
        insert.next = head;
        head = insert;
        numNodes++;
    }

    public void addLast(E e) {
        Node insert = new Node(e);
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = insert;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
       if (index == 0) {
            E element = (E) head.data;
            head = head.next;
            numNodes--;
            return element;
       }

       E element = (E) head.next.data;
       node.next = node.next.next;
       numNodes--;
       return element;
    }

    public boolean remove(Object e) {
        Node node = head;
        if (node.data == e) {
            head = node.next;
            numNodes--;
            return true;
        }

        while (node.next != null) {
            if (node.next.data == e) {
                node.next = node.next.next;
                numNodes--;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

//    public MyLinkedList<E> clone() {
//        MyLinkedList newLinkedList = new MyLinkedList(numNodes);
//        Node node = head;
//        for (int i = 0; i < numNodes; i++) {
//
//        }
//
//    }

    public boolean contains(E o) {
        Node node = head;
        while (node.next != null) {
            if (node.next.data == o) {
                return true;
            }
        }
        return false;
    }

//    public int indexOf(E o) {
//        MyLinkedList<E> linkedList[] = new MyLinkedList[numNodes];
//        for (MyLinkedList<E> node : linkedList) {
//            if (node == o) {
//                return node;
//            }
//        }
//        return -1;
//    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node getFirst() {
        Node node = head;
        return node;
    }


}

class Node{
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
