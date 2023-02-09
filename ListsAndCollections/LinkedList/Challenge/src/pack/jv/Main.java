package pack.jv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Town adelaide = new Town("Adelaide", 1374);
        Town aliceSprings = new Town("Alice Springs", 2271);
        Town brisbane = new Town("Brisbane", 917);
        Town darwin = new Town("Darwin", 3972);
        Town melbourne = new Town("Melbourne", 877);
        Town perth = new Town("Perth", 39723);

        LinkedList<Town> listTown = createLinkedList(
                createSortedTownArray(
                        adelaide, aliceSprings,
                        brisbane, darwin, melbourne, perth));

        ListIterator<Town> iterator = createIterator(listTown);

        String[] optionsArray = {"f", "b", "l", "q"};
        List <String> optionsList = Arrays.asList(optionsArray);
        ArrayList<String> options = new ArrayList<>(optionsList);

        String menuMessage = """
                Available actions:
                (f)orward
                (b)ackward
                (l)ist places
                (q)uit
                --------------------------""";

        Scanner scan = new Scanner(System.in);
        String option = "";
        while (option != "q"){
            System.out.println(menuMessage);
            option = scan.nextLine();

            System.out.println(option);

            if(option.equals("f")){
                System.out.println(forward(iterator));
            }

            else if(option.equals("b")){
                System.out.println(backward(iterator));
            }

            else if(option.equals("l")){
                System.out.println(listPlaces(listTown));
            }

            else if(option.equals("q")){
                System.out.println("Ending program...");
                break;
            }
            else if(!options.contains(option)){
                System.out.println("Please enter a valid action.");
            }

        }
    }

    public static Town[] createSortedTownArray(Town... towns){
        ArrayList <Integer> dist = new ArrayList<>();
        ArrayList <Town> sortedTownsList = new ArrayList<>();

        for(int i = 0;i<towns.length;i++){
            dist.add(towns[i].getDistSydney());
            sortedTownsList.add(towns[i]);
        }
        dist.sort(Comparator.naturalOrder());

        Town[] sortedTowns = new Town[towns.length];
        for(Town item : towns){
            for(int i = 0;i<towns.length;i++){
                sortedTowns[dist.indexOf(item.getDistSydney())] = item;
            }
        }
        return sortedTowns;
    }
    public static LinkedList<Town> createLinkedList(Town[] towns){
        LinkedList<Town> list = new LinkedList<>();
        for(Town item : towns){
            list.add(item);

        }
        return list;
    }

    public static ListIterator<Town> createIterator(LinkedList <Town> towns){
        ListIterator<Town> iteratorTowns = towns.listIterator();
        return iteratorTowns;
    }

    private static String forward(Iterator<Town> iterator){
        if(iterator.hasNext()){
            Town currTown = iterator.next();
            return "Your current location is " + currTown.getName() +
            ". The distance to Sidney is " + currTown.getDistSydney();
        } else {
            return "No town forward.";
        }
    }

    private static String backward(ListIterator<Town> iterator){

        if(iterator.hasPrevious()){
            Town currTown = iterator.previous();
            return "Your current location is " + currTown.getName() +
                    ". The distance to Sidney is " + currTown.getDistSydney();
        } else {
            return "No town backward.";
        }
    }
    private static String listPlaces(LinkedList<Town> list){
        String phrase = """
                Places list: 
                
                """ ;
        System.out.println(list.toString());
        for(Town item : list){
            phrase+= "\nTown: "+item.getName()+"\nDistance from Sidney: "+item.distSydney+"\n";
        }
        phrase+= "-".repeat(50);
        return  phrase;
    }
}

class Town{
    final String name;
    final int distSydney;

    public Town(String name, int distSydney){
        this.name = name;
        this.distSydney = distSydney;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", distSydney=" + distSydney +
                '}';
    }

    public int getDistSydney() {
        return distSydney;
    }
}