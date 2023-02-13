package pack.jv;

public class Eagle extends Animal{

    public Eagle(String type, String size, double weight){
        super(size, type, weight);

    }

    @Override
    public void speed(String speed) {
        System.out.printf("flying (%s)", speed);
    }

    @Override
    public void noise() {
        System.out.println("eagle sound (???)");
    }
}
