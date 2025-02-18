
package implementing_fifo_queues_using_a_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Implementing_fifo_queues_using_a_Queue {

  
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nQueue Operations using Java's Queue:");
            System.out.println("1. Enqueue (Offer)");
            System.out.println("2. Dequeue (Poll)");
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
                    queue.offer(num);
                    System.out.println(num + " enqueued.");
                    break;
                case 2:
                    Integer dequeued = queue.poll();
                    if (dequeued == null) {
                        System.out.println("Queue Underflow! Cannot dequeue.");
                    } else {
                        System.out.println("Dequeued: " + dequeued);
                    }
                    break;
                case 3:
                    Integer front = queue.peek();
                    if (front == null) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Front element: " + front);
                    }
                    break;
                case 4:
                    System.out.println("Queue elements: " + queue);
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
    

