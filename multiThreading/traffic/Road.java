package multiThreading.traffic;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        // TrafficSignalThread red = new TrafficSignalThread(TrafficColor.RED);
        // TrafficSignalThread yellow = new TrafficSignalThread(TrafficColor.YELLOW);
        // TrafficSignalThread green = new TrafficSignalThread(TrafficColor.GREEN);
        Runnable redSignal = new TrafficSignalThread(TrafficColor.RED);
        Runnable yellowSignal = new TrafficSignalThread(TrafficColor.YELLOW);
        Runnable greenSignal = new TrafficSignalThread(TrafficColor.GREEN);
        Thread red = new Thread(redSignal);
        Thread yellow = new Thread(yellowSignal);
        Thread green = new Thread(greenSignal);
        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
    }
}
