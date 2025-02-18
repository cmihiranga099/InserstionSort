

package implementing_stacks_using_queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Implementing_Stacks_Using_Queue {

    
    public static void main(String[] args) {
          Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
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
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued: " + queue.poll());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                    
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Front element: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty!");
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
    

