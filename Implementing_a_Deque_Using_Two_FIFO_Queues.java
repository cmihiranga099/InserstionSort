/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementing_stacks_using_queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class DequeUsingTwoQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    // Constructor
    public DequeUsingTwoQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Add element to the front
    public void addFront(int item) {
        q2.offer(item);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Add element to the rear
    public void addRear(int item) {
        q1.offer(item);
    }

    // Remove element from the front
    public int removeFront() {
        if (q1.isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return q1.poll();
    }

    // Remove element from the rear
    public int removeRear() {
        if (q1.isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int removedItem = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return removedItem;
    }

    // Get the front element
    public int getFront() {
        return q1.isEmpty() ? -1 : q1.peek();
    }

    // Get the rear element
    public int getRear() {
        if (q1.isEmpty()) {
            return -1;
        }
        int last = -1;
        for (int item : q1) {
            last = item;
        }
        return last;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Display deque elements
    public void display() {
        if (q1.isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        System.out.println("Deque elements: " + q1);
    }
public class Implementing_a_Deque_Using_Two_FIFO_Queues {
     DequeUsingTwoQueues deque = new DequeUsingTwoQueues();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDeque Operations:");
            System.out.println("1. Add Front");
            System.out.println("2. Add Rear");
            System.out.println("3. Remove Front");
            System.out.println("4. Remove Rear");
            System.out.println("5. Get Front");
            System.out.println("6. Get Rear");
            System.out.println("7. Display");
            System.out.println("8. Check if Empty");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to add at front: ");
                    int frontItem = scanner.nextInt();
                    deque.addFront(frontItem);
                    System.out.println(frontItem + " added at front.");
                    break;
                case 2:
                    System.out.print("Enter number to add at rear: ");
                    int rearItem = scanner.nextInt();
                    deque.addRear(rearItem);
                    System.out.println(rearItem + " added at rear.");
                    break;
                case 3:
                    System.out.println("Removed front element: " + deque.removeFront());
                    break;
                case 4:
                    System.out.println("Removed rear element: " + deque.removeRear());
                    break;
                case 5:
                    System.out.println("Front element: " + deque.getFront());
                    break;
                case 6:
                    System.out.println("Rear element: " + deque.getRear());
                    break;
                case 7:
                    deque.display();
                    break;
                case 8:
                    System.out.println("Is deque empty? " + deque.isEmpty());
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
}
