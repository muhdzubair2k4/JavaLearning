package JavaLearning.ClassesAndObjects;

public class Counter {
    int id;
    static int count = 241200;
    //set your counter start from 241200
    {
        count++;
        id = count;
    }

    public static void showCount () {
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        showCount();

        System.out.println("Id of C2 is " + c2.id);
    }
}
