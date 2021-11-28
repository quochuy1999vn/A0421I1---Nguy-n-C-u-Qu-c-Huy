package list.bai_tap.arrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == elements.length) {
            ensureCapacity(elements.length*2);
        }

        for (int i = size; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E result = (E) elements[index];
        for (int i = 0; i < index - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList newList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            newList.elements[i] = elements[i];
        }
        newList.size = size;
        return newList;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        Object newElement[] = new Object[minCapacity];
        for (int i = 0; i < size; i++) {
            newElement[i] = elements[i];
        }
        elements = newElement;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
}
