package JavaLearning.Multithreading;

public class ExtendingThreadTest extends Thread{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Zubair");
        }
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        ExtendingThreadTest t = new ExtendingThreadTest();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ali Raza");
        }
    }
}
