package multiThreading.traffic;

public enum TrafficColor {
    RED(9000) , YELLOW(1000) , GREEN(3000);
    private final int timeOnMillis;

    TrafficColor(int timeOnMillis) {
        this.timeOnMillis = timeOnMillis;
    }

    public int getTimeOnMillis() {
        return timeOnMillis;
    }
}
