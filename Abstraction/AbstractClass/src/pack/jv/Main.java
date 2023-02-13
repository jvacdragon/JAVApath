package pack.jv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pastor alemao", "2 metros", 25);
        dog.noise();
        dog.speed("15 km/h");

        List<Animal> listAnimals = List.of(dog, new Eagle("urubu", "grandao",
                30), new Fish("goldenfish", "pequeno né", 0.03));

        ArrayList<Animal> animalsArray = new ArrayList<>(listAnimals);

        for(Animal animal : animalsArray){
            System.out.println("\n");
            System.out.println(animal.toString());
            System.out.println("\n");
        }


        System.out.printf("testing %15.2f testing", 10.0);

    }
}
