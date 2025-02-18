
package implementing._steque;

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

// Steque implementation using a Linked List
class Steque {
    private Node front, rear;

    // Constructor initializes an empty Steque
    public Steque() {
        this.front = this.rear = null;
    }

    // Push (Insert at Front like a Stack)
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        if (rear == null) {
            rear = newNode;
        }
        System.out.println(item + " pushed to Steque.");
    }

    // Enqueue (Insert at Rear like a Queue)
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(item + " enqueued to Steque.");
    }

    // Pop (Remove from Front like a Stack)
    public int pop() {
        if (front == null) {
            System.out.println("Steque Underflow! Cannot pop.");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) { // If the steque becomes empty, reset rear
            rear = null;
        }
        return data;
    }

    // Check if the Steque is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display Steque elements
    public void display() {
        if (front == null) {
            System.out.println("Steque is empty!");
            return;
        }
        System.out.print("Steque elements: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
public class Implementing_Steque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Steque steque = new Steque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSteque Operations:");
            System.out.println("1. Push (Insert at Front)");
            System.out.println("2. Enqueue (Insert at Rear)");
            System.out.println("3. Pop (Remove from Front)");
            System.out.println("4. Display Steque");
            System.out.println("5. Check if Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int pushNum = scanner.nextInt();
                    steque.push(pushNum);
                    break;
                case 2:
                    System.out.print("Enter number to enqueue: ");
                    int enqueueNum = scanner.nextInt();
                    steque.enqueue(enqueueNum);
                    break;
                case 3:
                    System.out.println("Popped: " + steque.pop());
                    break;
                case 4:
                    steque.display();
                    break;
                case 5:
                    System.out.println("Is steque empty? " + steque.isEmpty());
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
    

