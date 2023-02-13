package pack.jv;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String size, String type, double weight){
        this.size=size;
        this.type=type;
        this.weight = weight;
    }

    public abstract void speed(String speed);
    public abstract void noise();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
