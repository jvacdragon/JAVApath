package pack.jv;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try {


            Random random = new Random();

            int[] numArray = new int[random.nextInt(1, 16)];

            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = random.nextInt(101);
            }

            int[] newArray = descendingOrder(numArray);
            System.out.println(Arrays.toString(newArray));

            System.out.println(numArray[100]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    private static int[] descendingOrder(int[] intArray){

        int[] copyArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println(Arrays.toString(copyArray));

        Arrays.sort(copyArray);

        int[] newArray = new int[copyArray.length];
        for(int i = 0; i<copyArray.length;i++){
            newArray[i] = copyArray[copyArray.length-1-i];
        }
        return newArray;
    }
}