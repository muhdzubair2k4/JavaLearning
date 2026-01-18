package DSA.ExamAssig;

import java.util.Scanner;

class menuDrivenProg {
    int size;
    String[] stack;
    int top = -1;

    menuDrivenProg (int size) {
        this.size = size;
        this.stack = new String[size];
    }

    void push (String data){
        if (top == size-1) {
            System.out.println("Stack Overflowed");
            return;
        }
        stack[++top] = data;
    }

    String pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return "\0";
        }
        return stack[top--];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Displaying Menu:");
        for (int i = 0; i<= top; i++) {
            System.out.println(i + ". " + stack[i]);
        }
    }

    String displayTop () {
        if (top == -1) {
            return "Stack is Empty";
        }
        return stack[top];
    }

    public static void main(String[] args) {
        menuDrivenProg mdp = new menuDrivenProg(10);
        Scanner sc = new Scanner(System.in);
        int choice;
        String exp;
        do {
            System.out.println("\n1. Push – Store a new action");
            System.out.println("2. Pop – Undo the last action");
            System.out.println("3. Peek – Display the last performed action");
            System.out.println("4. Display – Show all stored actions");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your text : ");
                    exp = sc.nextLine();

                    mdp.push(exp);
                    break;
                case 2:
                    System.out.println("Undo Complete...");
                    mdp.pop();
                    break;
                case 3:
                    System.out.println(mdp.displayTop());
                    break;
                case 4:
                    mdp.display();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (choice != 5);
    }
}