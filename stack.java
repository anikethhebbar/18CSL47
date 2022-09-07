import java.util.Scanner;

class Stack {
    private int maxsize, top;
    private int stack[];

    public Stack(int s) // Constructor
    {
        maxsize = s;
        stack = new int[maxsize];
        top = -1;
    }

    public void push(int pu) {
        if (top == maxsize - 1) {
            System.out.println("Stack is Full");
        } else {
            stack[++top] = pu;
            System.out.println("Element " + pu + " pushed into stack");
        }
    }

    public void pop() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Element " + (stack[top--]) + " popped from stack");
    }

    public void display() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            for (int i = top; i >= 0; i--)
                System.out.print("The stack elements are " + stack[i] + "\t");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int choice;
        int n = sc.nextInt();
        Stack s = new Stack(n);
        do {
            System.out.println("\nStack Operations");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int item = sc.nextInt();
                    s.push(item);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
        System.out.println("");
    }
}
