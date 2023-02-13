package pack.jv;

public class Fish extends Animal{

    public Fish(String type, String size, double weight){
        super(size, type, weight);

    }

    @Override
    public void speed(String speed) {
        System.out.printf("swimming (%s)", speed);
    }

    @Override
    public void noise() {
        System.out.println("bubble sound");
    }
}
