
package implementingstacksusingarray;

 class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto stack
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }

    // Pop element from stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element without removing it
    public int peek() {
        return (top == -1) ? -1 : stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Display the stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
public class ImplementingStacksUsingArray {

   
    
    public static void main(String[] args) {
       StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack elements: 10 20 30

        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.display(); // Output: Stack elements: 10 20

        System.out.println("Stack is empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();
        stack.pop(); // Output: Stack Underflow
    }
    
    }
}
