package pck.jv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        simpleMenu();
    }

    private static void simpleMenu(){
        String[] optionsArray = {"0","1","2"};
        List<String> optionsList = List.of(optionsArray);
        ArrayList<String> options = new ArrayList<>(optionsList);
        ArrayList<String> items  = new ArrayList<>();

        for(int i = -1; i!=0; i=i){
            Scanner scan = new Scanner(System.in);


            String defaultMessage = """
                Press:

                0 - To shutdown
                1 - To add some item to the list.
                2 - To remove any item from the list.
                """;
            System.out.println(defaultMessage);
            String option = scan.nextLine();

            if(!options.contains(option)){
                System.out.println("Please select a valid option");
            }

            else if(option.trim().equals("0")){
                i = Integer.parseInt(option.trim());
                System.out.println("shutting down...");
            }
            else if(option.trim().equals("1")){
                Scanner scanItem = new Scanner(System.in);

                System.out.println("Type your items delimeted by comma: ");
                String scannedItem = scanItem.nextLine();

                items = addItem(items, scannedItem);
                System.out.println("Your current list is" + items);
            }
            else if(option.trim().equals("2")){
                Scanner scanItem = new Scanner(System.in);

                System.out.println("Type your items delimeted by comma: ");
                String scannedItem = scanItem.nextLine();

                items = removeItem(items, scannedItem);
                System.out.println("Your current list is: " + items);
            }
            System.out.println("-".repeat(80));
        }

    }

    private static ArrayList<String> addItem(ArrayList<String> list, String items){
        String[] itemsArray = items.split(",");
        for(String item : itemsArray){
            if(list.indexOf(item) < 1){
                list.add(item);
            }
        }
        list.sort(Comparator.naturalOrder());

        return list;
    }

    private static ArrayList<String> removeItem(ArrayList<String> list, String items){

        boolean allElementsContain = true;

        String[] itemsArray = items.split(",");


        for(String item : itemsArray){
            if(!list.contains(item)) {
                allElementsContain = false;
                break;
            };
        }

        if(!allElementsContain){
            System.out.println("Item is not in the list.");
        }

        else {
            List<String> removeList = List.of(items);
            ArrayList<String> removeArrayList = new ArrayList<>(removeList);
            list.removeAll(removeArrayList);
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
