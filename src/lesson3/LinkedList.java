package lesson3;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    private static class Node<T> {
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            if (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " not correct!");
        }
        Node<T> current = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        return current.value;
    }

    public boolean remove(int index) {
        if (index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            while (currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            current.next = current.next.next;
        }
        return true;
    }

    public boolean contains(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
