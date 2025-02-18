/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementing_singly_._doubly_linked_list;

class DoublyNode {
    int data;
    DoublyNode next, prev;

    // Constructor to initialize the node
    public DoublyNode(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class DoublyLinkedList {
    private DoublyNode head;
    
    public DoublyLinkedList() {
        head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        System.out.println(data + " inserted at the beginning.");
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(data + " inserted at the end.");
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty! Cannot delete.");
            return;
        }
        System.out.println(head.data + " deleted from the beginning.");
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from the end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty! Cannot delete.");
            return;
        }
        DoublyNode temp = head;
        if (temp.next == null) {
            System.out.println(temp.data + " deleted from the end.");
            head = null;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.data + " deleted from the end.");
        temp.prev.next = null;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        DoublyNode temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
public class Implementing_Singly__Doubly_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    int data1 = scanner.nextInt();
                    dll.insertAtBeginning(data1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int data2 = scanner.nextInt();
                    dll.insertAtEnd(data2);
                    break;
                case 3:
                    dll.deleteFromBeginning();
                    break;
                case 4:
                    dll.deleteFromEnd();
                    break;
                case 5:
                    dll.display();
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

