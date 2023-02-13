package pack.jv;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = 10;     //its an object type
        int unboxedInt = boxedInt; // its a primitive type
        System.out.println(unboxedInt);

        Integer[] arrayInteger = new Integer[5];
        arrayInteger[0] = 5;
        int[] arrayInts = new int[5];
        arrayInts[0] = 5;

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayInts));
        
    }
}
