//Write a program that uses an executor service to execute multiple
//Callable tasks. Each task should calculate and return the factorial
//of a number provided to it. Use Future objects to receive the
//results of the calculations. After all tasks are submitted, retrieve
//the results from the futures, print them, and ensure the executor
//service is shut down correctly.
package executorService.callable;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number <= 1) return 1;
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;

        }
        return result;
    }
}
