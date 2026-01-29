//Create three threads. Ensure that the second thread starts only after
//the first thread ends and the third thread starts only after the second
//thread ends using the join method. Each thread should print its start
//and end along with its name.
package multiThreading;

public class MultipleThreads extends Thread{
    private final int threadNumber;
    public MultipleThreads(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){
        System.out.printf("%d Thread starting %s\n ",threadNumber,Thread.currentThread().getName());
        try{
            sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Some error occurred :" + e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.printf("%d Thread ended %s\n ",threadNumber,Thread.currentThread().getName());
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException {
        MultipleThreads t1 = new MultipleThreads(1);
        MultipleThreads t2 = new MultipleThreads(2);
        MultipleThreads t3 = new MultipleThreads(3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
