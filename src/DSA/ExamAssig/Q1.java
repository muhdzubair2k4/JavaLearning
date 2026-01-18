package DSA.ExamAssig;
import java.util.Scanner;

class CafeteriaQueue {
    int front = -1, rear = -1;
    int maxSize = 5;
    String queue[] = new String[maxSize];

    // Enqueue operation
    void enqueue(String student) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is Full! No more students can be added.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = student;
            System.out.println(student + " added to the queue.");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty! No student to remove.");
        } else {
            System.out.println(queue[front] + " removed from the queue.");
            front++;
        }
    }

    // Display operation
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Students waiting in the cafeteria queue:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }
}

class UniversityCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafeteriaQueue cq = new CafeteriaQueue();
        int choice;

        do {
            System.out.println("\n--- University Cafeteria Queue Menu ---");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    cq.enqueue(name);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}