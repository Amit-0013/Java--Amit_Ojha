package polymorphism.override;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Vehicle();
        c1.service();
        v1.service();
    }
}
