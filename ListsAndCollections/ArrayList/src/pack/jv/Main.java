package pack.jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }
}
public class Main {
    public static void main(String[] args) {
        Object[] groceryItem = new Object[3];
        groceryItem[0] = new GroceryItem("milk");
        groceryItem[1] = new GroceryItem("apple", "produce", 6);
        groceryItem[2] = "5 oranges";

        System.out.println(Arrays.toString(groceryItem));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("milk"));
        objectList.add("yogurt");

        System.out.println(objectList);

        ArrayList<GroceryItem> groceryList= new ArrayList<>();
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("apple", "produce", 6));
        System.out.println(groceryList);

        groceryList.add(1, new GroceryItem("oranges", "produce", 10));
        System.out.println(groceryList);
        groceryList.remove(0);
        System.out.println(groceryList);

        String[] items = {"apples", "oranges", "bananas", "eggs"};

        //LISTS ARE IMMUTABLE
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> listString = new ArrayList<>(list);
        listString.add(0, "newElement");
        System.out.println(listString);

        ArrayList<String> nextList = new ArrayList<>(List.of("el1","el2", "el3"));
        System.out.println(nextList);

        nextList.addAll(listString);
        System.out.println(nextList);

        System.out.println("third item in nextList: " + nextList.get(2));

        System.out.println(nextList.contains("el2"));
        System.out.println(nextList.indexOf("apples"));

        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList);

        nextList.sort(Comparator.reverseOrder());
        System.out.println(nextList);

        var listToArray = nextList.toArray(new String[nextList.size()]);
        System.out.println(listToArray);
        System.out.println(Arrays.toString(listToArray));

        var arrayToList = Arrays.asList(listToArray);
        arrayToList.set(0,"aopaoasosao");
        //arrayToList.add("dfggdf") //DONT WORK. using Arrays.asList turns unresizeable.
        System.out.println(arrayToList);

        nextList.clear();
        System.out.println(nextList);
        System.out.println(nextList.isEmpty());
    }
}
