//Write a program that starts a thread and prints its state after each
//significant event (creation, starting, and termination). Use
//Thread.sleep() to simulate long-running tasks and Thread.getState() to
//print the thread's state.
package multiThreading;

public class ThreadState extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.printf("From run: %s\n",getState());
        } catch (InterruptedException e) {
            System.out.println("Some error occurred: "+e.getMessage());
        }
    }

}
class Main{
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Creating a thread: %s\n",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("thread finished: %s\n",t1.getState());
    }

}
