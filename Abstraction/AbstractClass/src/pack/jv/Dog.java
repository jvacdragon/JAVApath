package pack.jv;

public class Dog extends Animal{

    public Dog(String type, String size, double weight){
        super(size, type, weight);

    }

    @Override
    public void speed(String speed) {
        System.out.printf("running (%s)", speed);
    }

    @Override
    public void noise() {
        System.out.println("woof woof");
    }
}
