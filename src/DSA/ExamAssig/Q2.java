package DSA.ExamAssig;

import java.util.Scanner;

class ArrayStack {
    int size;
    int top = -1;
    char[] stack;

    ArrayStack(int size) {
        this.size = size;
        this.stack = new char[size];
    }

    public void push(char data) {
        if (top == size-1)  {System.out.println("Stack is Full"); return;}
        stack[++top] = data;
    }

    public char pop () {
        if (top == -1) return '\0';
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class balanceExpression{

    static boolean isBalanced(String exp) {
        ArrayStack as = new ArrayStack(exp.length());

        for (int i = 0; i<exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                as.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if(as.isEmpty()) {
                    return false;
                }

                char top = as.pop();

                if (    (ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return as.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp;
        int choice;
        do {
            System.out.println("1. Check Expression");
            System.out.println("2. Exit");
            System.out.print("Enter Your Choice : "); choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.print("\nEnter your Expression : ");
                    exp = sc.next();
                    System.out.println(
                            isBalanced(exp)
                                    ? "Expression is Balance"
                                    : "Not Balanced");
                    break;
                case 2 :
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }


        } while (choice != 2);
    }
}
