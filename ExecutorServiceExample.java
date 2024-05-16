import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ExecutorServiceExample {

    public static void main(String [] args){
        ExecutorService executorService = newFixedThreadPool(10);

        Runnable runnable = () -> {
            System.out.println("Hello from executorService!");
        };
        executorService.submit(runnable);
        executorService.shutdown();
    }
}
