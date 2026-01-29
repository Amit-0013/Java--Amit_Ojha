//Write a program that creates two threads. Each thread should print
//"Hello from Thread X", where X is the number of the thread (1 or 2),
//ten times, then terminate
package multiThreading;

public class Threading extends Thread{
    private final int threadNumber;
    public Threading(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d: Hello from %d\n",(i+1),threadNumber);

        }
    }
}
class Main1{
    public static void main(String[] args) {
        Threading t1 = new Threading(1);
        Threading t2 = new Threading(2);
        t1.start();
        t2.start();
    }
}
