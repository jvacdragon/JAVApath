package pack.jv;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
//
//        int[] n = new int [10];
//        for(int i = 0; i<10; i++){
//            n[i] = i+1;
//
//            System.out.println(n[i]);
//        }
//
//        int[] nums = new int[] {11,12,13,141,51,61,71,81,91,20};
//        for(int i = 0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
//
//        int[] num = {1,2,4,8,16,32};
//        for(int i = 0; i<num.length; i++){
//            n[i] = i+1;
//
//            System.out.println(num[i]);
//        }
//
//        System.out.println();
//        String phrase = "";
//        for(int item : num){
//            item = item*2;
//            phrase = phrase+item+" ";
//        }
//        System.out.println(phrase);
//        System.out.println(Arrays.toString(num));
//
//        Object[] objectArray = {1,2, "String", num, false};
//        System.out.println(Arrays.toString(objectArray));
//
//        System.out.println(objectArray[3] instanceof Integer);

        System.out.println(Math.ceil(Math.random()*10));

        Random random = new Random();
        System.out.println(random.nextInt(100));

        int[] randomArray = getRandomIArray(10);
        System.out.println(Arrays.toString(randomArray));

        //BINARY SEARCH
        //RETURNS THE INDEX OF THE SEARCH IF IT EXISTS and a negative value if it does not
        System.out.println(Arrays.binarySearch(randomArray, 5));

        String[] stringArray = {"Abc", "def", "gh", "ijk", "lmno"};
        System.out.println(Arrays.binarySearch(stringArray, "gh"));

        int[] testEqual = {1,2,3,4,5};
        int[] copyOfTesEqual = Arrays.copyOf(testEqual, 5);

        System.out.println(Arrays.equals(testEqual, copyOfTesEqual));
    }

    private static int[] getRandomIArray(int len){
        int[] randomArray = new int[len];
        Random random = new Random();

        for(int i=0;i<randomArray.length;i++){
            randomArray[i] = random.nextInt(11);
        }

        Arrays.sort(randomArray);
        return randomArray;
    }
}

