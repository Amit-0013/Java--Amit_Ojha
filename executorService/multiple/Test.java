package executorService.multiple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(5)){
            for (int i = 1; i < 6; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);
            }
            service.shutdown();
            if(!service.awaitTermination(10 , TimeUnit.SECONDS)){
                System.out.println("Emergency shutdowm.");
                service.shutdownNow();
            }

            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
