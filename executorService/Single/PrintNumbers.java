//Write a program that creates a single-threaded executor service.
//Define and submit a simple Runnable task that prints numbers
//from 1 to 10. After submission, shut down the executor
package executorService.Single;

public class PrintNumbers implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);

        }
    }
}
