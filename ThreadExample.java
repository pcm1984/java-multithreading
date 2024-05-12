public class ThreadExample {
    public static void main(String [] args){
        Runnable runnable = () -> {
            System.out.println("Running "  + Thread.currentThread().getName());
            System.out.println("Runnable started");
            System.out.println("Runnable finished");
        };
        Thread thread1 = new Thread(runnable, "Thread 1");
        thread1.start();
        Thread thread2 = new Thread(runnable, "Thread 2");
        thread2.start();
    }
}
