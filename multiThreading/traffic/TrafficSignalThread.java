package multiThreading.traffic;

public class TrafficSignalThread implements Runnable{
    private final TrafficColor color;

    public TrafficSignalThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public synchronized void  run() {
        System.out.printf("%s Active\n",color);
        try{
            Thread.sleep(color.getTimeOnMillis());
        } catch (InterruptedException e) {
            System.out.println("Error occurred: "+e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n",color);
    }
}
