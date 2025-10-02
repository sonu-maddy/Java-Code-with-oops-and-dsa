package sonu.com.queue;

public class IRDQQueue {
    private int[] dqueue;
    private  int front, rear, size;

    public IRDQQueue(int size) {
        this.size = size;
        this.dqueue = dqueue;
        this.front = -1;
        this.front = -1;
    }

    public void  insertRear(int value){
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) { // First element
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        dqueue[rear] = value;
    }
    public boolean isEmpty(){
        return size == -1;
    }



    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(dqueue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        IRDQQueue q  = new IRDQQueue(5);

        q.insertRear(45);
        q.insertRear(23);
        q.insertRear(50);
        q.insertRear(12);

        q.display();
    }
}
