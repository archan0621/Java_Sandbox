package SandBox;

public class VolatileTest {
    volatile static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (running) {
                // 아무 작업을 하지 않는 루프
            }
            System.out.println("Worker thread 종료됨");
        });

        worker.start();

        Thread.sleep(1000); // 1초 후 running을 false로 변경
        running = false;
        System.out.println("Main thread: running = false 설정 완료");

        worker.join(); // worker가 종료될 때까지 기다림
        System.out.println("Main thread 종료");
    }
}