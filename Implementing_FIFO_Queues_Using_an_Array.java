/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementing_stacks_using_queue;

import java.util.Scanner;

class QueueArray {
    private int[] queue;
    private int front, rear, capacity, size;

    // Constructor to initialize the queue
    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (Insert) an element at the rear
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued.");
    }

    // Dequeue (Remove) an element from the front
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    // Peek at the front element without removing it
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display queue elements
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
public class Implementing_FIFO_Queues_Using_an_Array {
    
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = scanner.nextInt();
        QueueArray queue = new QueueArray(capacity);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Exit");
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
                    System.out.println("Is queue full? " + queue.isFull());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
}
