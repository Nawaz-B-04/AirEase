import java.util.Scanner;

class StackOp {
    int top = -1;
    int size;
    int[] a;

    // Constructor to initialize the stack with a given size
    public StackOp(int size) {
        this.size = size;
        a = new int[size];
    }

    public void push(int b) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            a[++top] = b;
            System.out.println(b + " pushed onto stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(a[top] + " popped from stack.");
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }
}

public class stack {
    public static void main(String[] args) {
        int choice = 0, size, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack:");
        size = sc.nextInt();
        StackOp ob = new StackOp(size);

        while (choice != 4) {
            System.out.println("\nEnter choice: \n1. Push \n2. Pop \n3. Display \n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to push:");
                    b = sc.nextInt();
                    ob.push(b);
                    break;

                case 2:
                    ob.pop();
                    break;

                case 3:
                    ob.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice.");
            }
        }
        sc.close();
    }
}

