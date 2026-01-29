package executorService.multiple;

public class SleepTask implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Starting the Thread %s\n",current.getName());
        try{
            Thread.sleep(getRandom() * 1000);

        }catch(InterruptedException e){
            System.out.println("Some error occurred: "+e.getMessage());
        }
        System.out.printf("Ending the Thread %s\n",current.getName());
    }
    public int getRandom(){
        int random = (int) (Math.random() * 5 + 1);
        return random;
    }
}
