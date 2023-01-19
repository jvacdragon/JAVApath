import java.util.*;
public class Main {
    public static void main(String[] args){
        challenge();
        try {
            ageFromConsole();
        }catch (NullPointerException e){

            System.out.println(ageFromScanner());
        }
    }

    public static void ageFromConsole(){
        String birthYear = System.console().readLine("Tell your birth-year");
        System.out.println("you're " + (2023-Integer.parseInt(birthYear)) + " years old");
    }
    public static String ageFromScanner() {
        Scanner scan = new Scanner(System.in);


        boolean ageValid = false;
        int age = 0;

        do {
            System.out.println("Tell your birth-year");

            try {

                age = checkData(scan.nextLine());
                ageValid = age > 0;

            } catch(NumberFormatException e){
                System.out.println("Set a valid input");
            }
        }while(!ageValid);

        return "you're " + age + " years old";
    }

    public static int checkData(String birthyear) {
        int year = (2023-Integer.parseInt(birthyear));

        if ( year<12 || year > 125) {
            return -1;
        }


        return year;
    }

    public static void challenge(){
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter<6){
            try{
                System.out.println("Type the #"+counter+" number: ");

                int num = Integer.parseInt(scan.nextLine());

                sum+=num;
                counter++;

            }catch (NumberFormatException e){
                System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
    }

}
