package pack.jv;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){
        LinkedList <String> placesToVisit = new LinkedList<>();
        placesToVisit.add("rj");
        placesToVisit.add(0, "sp");
        System.out.println(placesToVisit);

        addMethods(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        iterator(placesToVisit);
    }
    private static LinkedList<String> addMethods(LinkedList <String> list){
        list.add("addElement");
        list.addFirst("AddingFirst");
        list.addLast("AddLast");

        list.push("pushing");

        list.offerFirst("offerFirst");
        list.offerLast("offerLast");

        return list;
    }

    private static void removeElements(LinkedList<String> list){

        String rm = list.removeFirst();
        System.out.println(rm + " was removed");

        String rm2 = list.removeLast();
        System.out.println(rm2 + " was removed");
    }

    private static void iterator(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        while(iterator.hasNext()){
            System.out.println("This is the next element: " + iterator.next());
        }
    }
}
