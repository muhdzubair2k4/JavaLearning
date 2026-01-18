package JavaLearning.Multithreading;

public class SleepMethodTest extends Thread{
    public void run() {
        String N = Thread.currentThread().getName();
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(N);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Demo {
    public static void main(String[] args){
        SleepMethodTest t1 = new SleepMethodTest();
        SleepMethodTest t2 = new SleepMethodTest();
        SleepMethodTest t3 = new SleepMethodTest();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();


    }
}