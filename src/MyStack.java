
class Stack {
    int top;
    int size;
    int[] stack;

    public Stack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];

    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }

        return false;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }

        else {
            stack[++top] = data;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }

        else {
            top--;
        }
    }

    public void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println("top= " + i + " Element " + stack[i]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack[top]);
        }
    }

}

public class MyStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.display();

    }
}
