// Define the interface Stack
interface Stack {
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Implement the subclass IntegerStack
class IntegerStack implements Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public IntegerStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (!overflow()) {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack overflow!");
        }
    }

    @Override
    public int pop() {
        if (!underflow()) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack underflow!");
            return -1; // Or throw an exception
        }
    }

    @Override
    public void display() {
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    @Override
    public boolean overflow() {
        return top == maxSize - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class TestStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will cause overflow

        System.out.println("\nPopping elements from the stack:");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // This will cause underflow

        // Displaying the stack elements
        System.out.println("\nDisplaying the stack:");
        stack.display();
    }
}


