package ock.jv;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Put your numbers between ',' :");
        Scanner scan = new Scanner(System.in);
        String scanInt = scan.nextLine();

        String[] StringArray = scanInt.split(",");

        int[] intArray = new int[StringArray.length];
        for(int i=0; i<intArray.length;i++){
                intArray[i] = Integer.parseInt(StringArray[i].trim());
        }

        int[] reversedArray = reverseArray(intArray);

        System.out.println("Your array is : " + Arrays.toString(StringArray));
        System.out.println("Your reversed array is: " + Arrays.toString(reversedArray));
        System.out.println("Your min value is: " + minValue(intArray));
    }

    private static int minValue(int[] intArray){
        Arrays.sort(intArray);
        return intArray[0];
    }

    private static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];

        for (int i=0; i<arr.length;i++){
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }
}
