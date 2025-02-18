/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementing_stacks_using_a_linked_list;

// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using a Linked List
class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    // Push an element onto the stack
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    // Pop the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek at the top element without removing it
    public int peek() {
        return (top == null) ? -1 : top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack elements
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
public class Implementing_Stacks_Using_a_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack elements: 30 20 10

        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.display(); // Output: Stack elements: 20 10

        System.out.println("Stack is empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();
        stack.pop(); // Output: Stack Underflow
    }
    
}
}
