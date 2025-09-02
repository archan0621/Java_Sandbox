package SandBox;

class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

public class Threads {
    public static void main(String[] args) {
        Thread v = new MyThread();
        v.run();
        v.start();
        v.run();
    }
}
