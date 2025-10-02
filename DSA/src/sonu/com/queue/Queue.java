package sonu.com.queue;

import javax.print.attribute.standard.QueuedJobCount;

public class Queue {
    private int[] queue;
    private int front, rear, size, capacity;
    private int[] arrey;
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;

        }
        rear = (rear + 1) % capacity;
        queue[++rear]=value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front++  ];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // For testing
    public static void main(String[] args) {
        Queue cq = new Queue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display(); // Output: 10 20 30 40 50

        cq.dequeue();
        cq.dequeue();
        cq.display(); // Output: 30 40 50

        cq.enqueue(60);
        cq.enqueue(70);
        cq.display(); // Output: 30 40 50 60 70

        cq.enqueue(80); // Should print "Queue is full"
        System.out.println();
    }
}
