import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String bulletIt = "Print a Bulleted List: \n" +
                "   \u2022 First Point\n" +
                "   \u2022 Second Point";
        System.out.println(bulletIt);

        String blockText = """
                Print a Bulletd List: 
                    \u2022 First Point
                    \u2022 SecondPoint
                """;
        System.out.println(blockText);

        double n = 10.123;
        System.out.printf("Just like in C programming %.2f\n", n);

        int num = 12;
        String text = """
                The number %d
                in hexadecimal is %x
                and in octadecimal is %o
                
                
                """;
        System.out.printf(text,num,num,num);

        for(int i = 1; i<=16; i++){
            System.out.printf(text, i,i,i);
        }

        String date = "25/05/2003";

        System.out.println(date.length());
        System.out.println(date.isBlank());
        System.out.println(date.lastIndexOf("0"));
        System.out.println(date.charAt(9));

        System.out.printf("%d \n", date.length());

        stringInformation("      Hello     World");

        formatDate(date);

        StringBuilder test = new StringBuilder(2);

        System.out.println(test.append(123));
        System.out.println(test.replace(2,3,"asd"));
        System.out.println(test.capacity());
    }
    public static void formatDate(String date){
        String year = date.substring(6, 10);
        String month = date.substring(3, 5);
        String day = date.substring(0,2);
        String formattedDate = String.join("-", year,month, day);

        System.out.println(year);
        System.out.println(formattedDate);

    }
    public static void stringInformation(String string){
        if(string.isEmpty()){
            System.out.println("string is empty");
            return;
        }

        int stringLength = string.length();
        char firstChar = string.charAt(0);
        char lastChar = string.charAt(stringLength - 1);
        String text = """
               Length = %d
               First char = %c
               Last char = %c
                """;
        System.out.printf(text, stringLength, firstChar, lastChar);
        System.out.println(string.contains("Hello"));
        System.out.println(string);
        System.out.println(string.trim());
    }

}
