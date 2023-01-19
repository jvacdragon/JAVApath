public class Main {
    public static void main(String[] args){
        //sumDigits(123123123);

        int i = 1;
        while( i <= 10){
            //System.out.println(i);
            i++;
        }

        int j = 11;
        do{
            j--;
            if(j==5) {
                continue;
            }
           // System.out.println(j);

        }while (j>0);
    }

    public static int sumDigits(int num){

        if(num<0){
            System.out.println("Select a valid number");
            return -1;
        }

        int sum = 0;
        do{
            int digit = num%10;
            sum = sum+digit;

            num=num/10;
        }while(num!=0);

        System.out.println(sum);

        return sum;
    }

    public static boolean isPalindrome(int number){
        int firstNumber = number;
        String newNumber = "";

        do{
            int lastDigit = number%10;
            newNumber+=lastDigit;
            number=number/10;
        } while(number != 0);
        if(Integer.parseInt(newNumber) == firstNumber){
            return true;
        }
        return false;
    }
}
