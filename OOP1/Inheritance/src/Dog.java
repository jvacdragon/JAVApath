public class Dog extends Animal{
    private String name;

    public Dog(String type, String size, double weight, String name){
        super(type, size, weight);
        this.name = name;
    }

    public void testType(){
        System.out.println(type);
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
