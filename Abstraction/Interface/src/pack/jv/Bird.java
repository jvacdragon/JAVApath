package pack.jv;

public class Bird extends Animal implements FlightEnable, Trackable {

    @Override
    public void move() {
        System.out.println("fly");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void track() {

    }
}
