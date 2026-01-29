//Write a program that creates a single-threaded executor service.
//Define and submit a simple Runnable task that prints numbers
//from 1 to 10. After submission, shut down the executor
package executorService.Single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {
        try (ExecutorService ex = Executors.newSingleThreadExecutor()) {
            PrintNumbers task = new PrintNumbers();
            ex.submit(task);
        }
    }
}
