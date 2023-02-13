package pack.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Maracanã", UsageType.SPORTS));
        mappables.add(new Building("Palacio do planalto", UsageType.GOVERNMENT));
        mappables.add(new Building("Minha casa", UsageType.RESIDENTIAL));

        for(var local : mappables){
            System.out.println("\n");
            System.out.println(local.getLabel());
            System.out.println(local.toJSON());
            Mappable.mapIt(local);
        }
    }
}
