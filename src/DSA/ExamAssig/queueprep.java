package DSA.ExamAssig;

class Queue {
    int front = 0;
    int rear = -1;
    int size;
    int[] queue;

    Queue(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        queue[++rear] = data;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }

    int peak() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[rear];
    }

    void displayQueue() {
        System.out.println("Displaying Queue:");
        for (int i = front; i<=rear;i++) {
            System.out.print(queue[i] + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.displayQueue();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peak());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.displayQueue();

    }
}


