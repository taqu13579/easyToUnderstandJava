package chapter25;

public class ThreadSample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Task task = new Task("thread-1");
            task.doit();
        });
        t1.start();
        System.out.println("-----main終了-----");
    }
}
