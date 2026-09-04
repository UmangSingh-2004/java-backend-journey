package org.example.Umang;

import java.util.Arrays;

// Node definition for LinkedList
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Singly Linked List
class MyLinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void deleteByValue(int value) {
        if (head == null) return;

        // If target is at head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        // Target found
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

// Custom Dynamic Array List
class MyArrayList {
    private int[] data;
    private int size;

    public MyArrayList() {
        data = new int[4]; // initial capacity
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void deleteByValue(int value) {
        int targetIdx = -1;
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                targetIdx = i;
                break;
            }
        }

        if (targetIdx != -1) {
            // Shift elements left
            for (int i = targetIdx; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}

public class Main {
    public static void main(String[] args) {
        // Linked List Demo
        System.out.println("--- LinkedList Test ---");
        MyLinkedList ll = new MyLinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.printList(); // 10 -> 20 -> 30 -> null

        ll.deleteByValue(20);
        ll.printList(); // 10 -> 30 -> null

        // ArrayList Demo
        System.out.println("\n--- ArrayList Test ---");
        MyArrayList al = new MyArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.printList(); // [100, 200, 300]

        al.deleteByValue(200);
        al.printList(); // [100, 300]
    }
}