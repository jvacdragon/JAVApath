package pack.jv;

import pack.other.Item;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("package testing import");

        System.out.println(item.toString());

        pack.other.Item item2 = new pack.other.Item("Test 2");
        System.out.println(item2.toString());
    }
}
