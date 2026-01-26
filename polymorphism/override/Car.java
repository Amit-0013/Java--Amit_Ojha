package polymorphism.override;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("The car is getting serviced.");
    }
}
