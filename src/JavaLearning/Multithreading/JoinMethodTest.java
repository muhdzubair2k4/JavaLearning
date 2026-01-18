package JavaLearning.Multithreading;

public class JoinMethodTest extends Thread{
    public void run () {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
        }
    }
}

class JoinDemo{
    public static void main(String[] args) throws InterruptedException {
        JoinMethodTest t1 = new JoinMethodTest();
        JoinMethodTest t2 =  new JoinMethodTest();
        JoinMethodTest t3 = new JoinMethodTest();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}