package JavaLearning.Multithreading;

public class ImplementRunnableTest implements Runnable{
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Zubair");
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class implementRunnable {
    public static void main(String[] args) throws InterruptedException{
        ImplementRunnableTest a = new ImplementRunnableTest();
        Thread t = new Thread(a);

        t.start();

        for(int i = 1; i<=50; i++) {
            System.out.println("ZUBAIR");
        }
        Thread.sleep(1000);
    }
}
