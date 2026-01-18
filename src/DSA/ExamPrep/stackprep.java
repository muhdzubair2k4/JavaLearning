package DSA.ExamPrep;

//Stack Using Array
class stackprep {
    //push, pop, peak, display "LIFO"

    int size;
    int top;
    int[] arrayStack;

    public stackprep(int data) {
            this.size = data;
            this.arrayStack = new int[size];
            this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
            return top == size-1;
    }


    public void push(int data) {
       if(isFull()) {
           System.out.println("Stack is full");
           return;
       }
        arrayStack[++top] = data;
    }



    public int pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int oldTop = top;
            top--;
            return arrayStack[oldTop];
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
           return arrayStack[top];
    }

}

class LinkedListStack {
    Node top;
    class Node {
        Node next;
        
    }
}
