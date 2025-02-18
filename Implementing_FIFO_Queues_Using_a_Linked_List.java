/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementing_fifo_queues_using_a_linked_list;

import java.util.Scanner;

// Node class representing a single element in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using a Linked List
class QueueLinkedList {
    private Node front, rear;

    // Constructor initializes an empty queue
    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    // Enqueue (Insert) an element at the rear
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(item + " enqueued.");
    }

    // Dequeue (Remove) an element from the front
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) { // If the queue becomes empty, reset rear to null
            rear = null;
        }
        return data;
    }

    // Peek at the front element without removing it
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
public class Implementing_FIFO_Queues_Using_a_Linked_List {

    public static void main(String[] args) {
                QueueLinkedList queue = new QueueLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to enqueue: ");
                    int num = scanner.nextInt();
                    queue.enqueue(num);
                    break;
                case 2:
                    System.out.println("Dequeued: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Front element: " + queue.peek());
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    }
    
}
