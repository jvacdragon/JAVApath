package pack.jv;

interface FlightEnable{
    public abstract void takeOff();
    abstract void land();
    void  fly();
}

interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
