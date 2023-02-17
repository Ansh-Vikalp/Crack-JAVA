class Queue {
    int front;
    int rear;
    int size;
    int[] queue;

    public Queue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.queue = new int[size];

    }

    public boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("FULL Queue");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            queue[++rear] = data;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("EMPTY Queue");
        } else {

            int data = queue[front];
            if (front == rear) {
                front = rear = -1;

            } else {

                front++;

            }
            System.out.println("Removed: " + data);

            // int data = queue[front++];
            // if (front > rear) {
            // front = rear = -1;

            // }

        }

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i] + " ");
        }
        System.out.println();

    }
}

public class MyQueue {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println();
        queue.display();

    }
}
