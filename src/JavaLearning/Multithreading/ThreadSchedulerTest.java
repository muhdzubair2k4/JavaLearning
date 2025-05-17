package JavaLearning.Multithreading;

public class ThreadSchedulerTest extends Thread{
    public void run() {
        String N = Thread.currentThread().getName();
        for (int i = 1; i<=3; i++) {
            System.out.println(N);
        }
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Test {
    public static void main(String[] args) {
        ThreadSchedulerTest t1 = new ThreadSchedulerTest();
        ThreadSchedulerTest t2 = new ThreadSchedulerTest();
        ThreadSchedulerTest t3 = new ThreadSchedulerTest();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String N = Thread.currentThread().getName();
        for (int i = 1; i<=3; i++) {
            System.out.println(N);
        }

    }
}